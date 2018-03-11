package com.bookjuk.service.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminServiceDao;
import com.bookjuk.aop.LogAspect;
import com.bookjuk.book.dto.BookDto;
import com.bookjuk.service.dao.ServiceDao;
import com.bookjuk.service.dto.ServiceContactDto;
import com.bookjuk.service.dto.ServiceNoticeDto;
import com.bookjuk.service.dto.ServiceQuestionDto;

@Component
public class ServiceServiceImp implements ServiceService {

	@Autowired
	private ServiceDao serviceDao;

	@Override	// 180305 강민아 자주묻는 질문 리스트 뿌리기
	public void customer(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int count = serviceDao.questionCount();
		//LogAspect.logger.info(LogAspect.logMsg + "count :" + count);
		
		List<ServiceQuestionDto>questionList=null;
		if(count>0) {
			questionList=serviceDao.questionList();
			//LogAspect.logger.info(LogAspect.logMsg+"( questionList ) :"+questionList.size());
		}
		
		mav.addObject("count",count);
		mav.addObject("questionList",questionList);
		
		mav.setViewName("service/service_question/service_question.search");
	}

	@Override	//	180302 강민아 공지사항 리스트 뿌리기
	public void noticeList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		//LogAspect.logger.info(LogAspect.logMsg+"넘어오니?");
		
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null) {pageNumber="1";}
		
		int currentPage=Integer.parseInt(pageNumber);
		
		int listSize=10;
		
		int startRow=(currentPage-1)*listSize+1;
		int endRow=currentPage*listSize;
		
		int count = serviceDao.noticeCount();
		//LogAspect.logger.info(LogAspect.logMsg + "count :" + count);
		
		List<ServiceNoticeDto>noticeList=null;
		if(count>0) {
			noticeList=serviceDao.noticeList(startRow,endRow);
			//LogAspect.logger.info(LogAspect.logMsg+"( noticeList ) :"+noticeList.size());
		}
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("currentPage",currentPage);
		mav.addObject("listSize",listSize);
		mav.addObject("count",count);
		mav.addObject("noticeList",noticeList);	
		
		mav.setViewName("service/service_notice/service_notice_list.search");
	}
	
	@Override	//	180302 강민아 공지사항 읽기 뿌리기
	public void noticeRead(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		//System.out.println("ok");
		
		long notice_num=Long.parseLong(request.getParameter("notice_num"));
		String pageNumber = request.getParameter("pageNumber");
		LogAspect.logger.info(LogAspect.logMsg+"notice_num&pageNumber : "+notice_num+","+pageNumber);
		
		ServiceNoticeDto serviceNoticeDto=serviceDao.noticeRead(notice_num);
		serviceNoticeDto.setNotice_content(serviceNoticeDto.getNotice_content().replace("\r\n", "<br/>"));
		//System.out.println(serviceNoticeDto.toString());
		
		int maxNum=serviceDao.maxNum(notice_num);
		int minNum=serviceDao.minNum(notice_num);
		System.out.println(maxNum+","+minNum);
		
		mav.addObject("serviceNoticeDto",serviceNoticeDto);
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("maxNum",maxNum);
		mav.addObject("minNum",minNum);
		
		mav.setViewName("service/service_notice/service_notice_read.search");
	}
	
	@Override	
	public void contactWrite(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_contact/service_contact_write.search");
	}


	@Override	//180226 강민아 1:1문의 작성
	public void contactWriteOk(ModelAndView mav) {
		
		Map<String,Object>map=mav.getModelMap();
		MultipartHttpServletRequest request=(MultipartHttpServletRequest)map.get("request");
		HttpSession session = (HttpSession) map.get("session");
		ServiceContactDto serviceContactDto=(ServiceContactDto)map.get("serviceContactDto");
		//System.out.println("넘어와?");
		
		serviceContactDto.setContact_date(new Date());
		
		MultipartFile upFile=request.getFile("file");
		String contact_file_name=Long.toString(System.currentTimeMillis())+"_"+upFile.getOriginalFilename();
		long contact_file_size=upFile.getSize();
		
		//LogAspect.logger.info(LogAspect.logMsg+"파일name&size : "+contact_file_name+","+contact_file_size);
		
		if(contact_file_size!=0) {
			File path=new File("C:\\bookjuk\\");	//파일이 들어갈 경로지정
			path.mkdir();	
			
			if(path.exists()&&path.isDirectory()) {
				File file=new File(path,contact_file_name);
				try {
					upFile.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				serviceContactDto.setContact_file_path(file.getAbsolutePath());
				serviceContactDto.setContact_file_name(contact_file_name);
				serviceContactDto.setContact_file_size(contact_file_size);
				
			}
		}
		
		String member_id = (String) session.getAttribute("member_id");
		serviceContactDto.setMember_id(member_id);
		serviceContactDto.setContact_content(serviceContactDto.getContact_content().replace("\r\n", "<br/>"));
		
		//LogAspect.logger.info(LogAspect.logMsg+serviceContactDto.toString());
		serviceContactDto.setContact_answer_whether("답변대기중");
		int check=serviceDao.ServiceWrite(serviceContactDto);
		//LogAspect.logger.info(LogAspect.logMsg+"잘 들어갔니? "+check);
		
		mav.addObject("check",check);
		mav.setViewName("service/service_contact/service_contact_writeOk.empty");
	}

	@Override	// 180227 강민아 1:1문의 리스트
	public void contactList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		HttpSession session = (HttpSession) map.get("session");
		
		String member_id = (String) session.getAttribute("member_id");
		
	
		/*serviceContactDto.setMember_id(member_id);
		System.out.println(member_id);*/
		
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null) {pageNumber="1";}
		
		int currentPage=Integer.parseInt(pageNumber);
		
		int boardSize=5;
		
		int startRow=(currentPage-1)*boardSize+1;
		int endRow=currentPage*boardSize;
		
		
		
		List<ServiceContactDto>ServiceContactList=null;
		if(member_id!=null) {
			
			int count = serviceDao.getBoardCount(member_id);
			//LogAspect.logger.info(LogAspect.logMsg+"count :"+count);
			if(count>0) {
				ServiceContactList=serviceDao.ServiceContactList(startRow,endRow,member_id);
				//LogAspect.logger.info(LogAspect.logMsg+"글 총개수( ServiceContactList ) :"+ServiceContactList.size());
				mav.addObject("pageNumber",pageNumber);
				mav.addObject("currentPage",currentPage);
				mav.addObject("boardSize",boardSize);
				mav.addObject("count",count);
				mav.addObject("ServiceContactList",ServiceContactList);				
			}
			
		}else {
			mav.addObject("member_id", member_id);
			
		}
		
		mav.setViewName("service/service_contact/service_contact_list.search");
	}

	@Override	//180227 강민아 1:1문의 읽기
	public void contactRead(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		
		long contact_num=Long.parseLong(request.getParameter("contact_num"));
		String pageNumber = request.getParameter("pageNumber");
		
		ServiceContactDto serviceContactDto=serviceDao.ServiceRead(contact_num);
		
		if(serviceContactDto.getContact_file_name()!=null) {
			int index=serviceContactDto.getContact_file_name().indexOf("_")+1;
			serviceContactDto.setContact_file_name(serviceContactDto.getContact_file_name().substring(index));
		}
		
		// 답변시 내용추가 해야함  ---> 맞는지 추후에 확인하기
		if(serviceContactDto.getContact_answer()!=null) {
			serviceContactDto.setContact_answer(serviceContactDto.getContact_answer());
		}
		
		mav.addObject("contact_num",contact_num);
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("serviceContactDto",serviceContactDto);
		
		mav.setViewName("service/service_contact/service_contact_read.search");
	}

	@Override	//180227 강민아 다운로드 작성
	public void contactDownLoad(ModelAndView mav) {
		
		Map<String, Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		HttpServletResponse response=(HttpServletResponse)map.get("response");
		
		long contact_num=Long.parseLong(request.getParameter("contact_num"));
		String pageNumber = request.getParameter("pageNumber");
		
		//LogAspect.logger.info(LogAspect.logMsg+"contactDownLoad : contact_num & pageNumber : " + contact_num + "," + pageNumber);
		//System.out.println("잘됩니당");
		
		ServiceContactDto serviceContactDto=serviceDao.fileBoardSelect(contact_num);
		//LogAspect.logger.info(LogAspect.logMsg+serviceContactDto.toString());
		
		BufferedInputStream fis=null;
		BufferedOutputStream fos=null;
		
		
		try {
			int index=serviceContactDto.getContact_file_name().indexOf("_")+1;
			String dbFileName=serviceContactDto.getContact_file_name().substring(index);
			String fileName=new String(dbFileName.getBytes("utf-8"),"ISO-8859-1");
			
			response.setContentType("application/octet=stream");
			response.setContentLength((int)serviceContactDto.getContact_file_size());
			response.setHeader("Content-Disposition", "attachment;filename="+fileName+";");
			
			fis=new BufferedInputStream(new FileInputStream(serviceContactDto.getContact_file_path()));
			fos=new BufferedOutputStream(response.getOutputStream());
			
			while(true) {
				int data=fis.read();
				if(data==-1)break;
				fos.write(data);
			}
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}

	@Override	// 180228 강민아 1:1문의 삭제
	public void contactDelete(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		//System.out.println("띠링");
		
		long contact_num=Long.parseLong(request.getParameter("contact_num"));
		String pageNumber = request.getParameter("pageNumber");
		//LogAspect.logger.info(LogAspect.logMsg+"삭제. contact_num & pageNumber : "+contact_num+","+pageNumber);
		
		ServiceContactDto serviceContactDto=serviceDao.fileBoardSelect(contact_num);
		String path=serviceContactDto.getContact_file_path();
		//LogAspect.logger.info(LogAspect.logMsg+serviceContactDto.toString());
		
		int check=serviceDao.contactDelete(contact_num);
		LogAspect.logger.info(LogAspect.logMsg+"Delete-check: "+check);
		
		if(path!=null && check > 0){	
			File file=new File(path);
			
			if(file.exists() && file.isFile()){	//한번더 확인 존재하느냐
				file.delete();
			}
		}
		
		mav.addObject("contact_num",contact_num);
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("check",check);
		
		mav.setViewName("service/service_contact/service_contact_delete.search");
		
	}
	
	@Override	// 180301 강민아 1:1문의 수정
	public void contactUpdate(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		long contact_num=Long.parseLong(request.getParameter("contact_num"));
		String pageNumber = request.getParameter("pageNumber");
		//LogAspect.logger.info(LogAspect.logMsg+"수정합니다. contact_num & pageNumber : "+contact_num+","+pageNumber);
		
		ServiceContactDto serviceContactDto=serviceDao.fileBoardSelect(contact_num);
		LogAspect.logger.info(LogAspect.logMsg+serviceContactDto.toString());
		
		if(serviceContactDto.getContact_file_name()!=null) {
			int index=serviceContactDto.getContact_file_name().indexOf("_")+1;
			serviceContactDto.setContact_file_name(serviceContactDto.getContact_file_name().substring(index));
		}
		serviceContactDto.setContact_content(serviceContactDto.getContact_content().replace("\r\n", "<br/>"));
		mav.addObject("contact_num",contact_num);
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("serviceContactDto",serviceContactDto);
		
		mav.setViewName("service/service_contact/service_contact_update.search");
	}

	@Override	// 180228 강민아 1:1문의 수정Ok
	public void contactUpdateOk(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		MultipartHttpServletRequest request=(MultipartHttpServletRequest)map.get("request");
		ServiceContactDto serviceContactDto=(ServiceContactDto)map.get("serviceContactDto");
		//System.out.println("넘어와?");
		
		long contact_num=Long.parseLong(request.getParameter("contact_num"));
		//System.out.println("contact_num:"+contact_num);
		serviceContactDto.setContact_date(new Date());

		MultipartFile upFile=request.getFile("file");
		String contact_file_name=Long.toString(System.currentTimeMillis())+"_"+upFile.getOriginalFilename();
		long contact_file_size=upFile.getSize();
		
		LogAspect.logger.info(LogAspect.logMsg+"파일name&size : "+contact_file_name+","+contact_file_size);
		
		if(contact_file_size!=0) {
			File path=new File("C:\\bookjuk\\");	//파일이 들어갈 경로지정
			path.mkdir();	
			
			if(path.exists()&&path.isDirectory()) {
				File file=new File(path,contact_file_name);
				try {
					upFile.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				serviceContactDto.setContact_file_path(file.getAbsolutePath());
				serviceContactDto.setContact_file_name(contact_file_name);
				serviceContactDto.setContact_file_size(contact_file_size);
				
			}
		}
		
		//LogAspect.logger.info(LogAspect.logMsg+serviceContactDto.toString());
		String pageNumber = request.getParameter("pageNumber");
		//LogAspect.logger.info(LogAspect.logMsg+"수정OK contact_num & pageNumber : "+contact_num+","+pageNumber);
		
		ServiceContactDto serviceContactDtos=serviceDao.fileBoardSelect(contact_num); 
		int check=serviceDao.ServiceContactUpdate(serviceContactDto);
		//LogAspect.logger.info(LogAspect.logMsg+check); 
		
		LogAspect.logger.info(LogAspect.logMsg+serviceContactDtos.toString());
		
		if(check>0&&serviceContactDtos.getContact_file_size()>0) {	// 파일이 존재 할때만 삭제
			String path = serviceContactDtos.getContact_file_path();
			File file = new File(path);
			if(file.exists() && file.isFile()) {
				file.delete();
			}
		}
		
		mav.addObject("check",check);
		mav.addObject("contact_num",contact_num);
		mav.addObject("pageNumber",pageNumber);
		
		mav.setViewName("service/service_contact/service_contact_updateOk.empty");
	}
	
}
