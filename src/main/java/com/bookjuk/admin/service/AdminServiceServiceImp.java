package com.bookjuk.admin.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminServiceDao;
import com.bookjuk.admin.dto.AdminService_contactDto;
import com.bookjuk.admin.dto.AdminService_noticeDto;
import com.bookjuk.admin.dto.AdminService_questionDto;
import com.bookjuk.aop.LogAspect;

@Component
public class AdminServiceServiceImp implements AdminServiceService {

	@Autowired
	private AdminServiceDao serviceDao;
	
	public AdminServiceServiceImp() {}

	/** 자주묻는질문 시작*/
	
	//자주묻는질문 목록
	@Override
	public void serviceMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null)pageNumber="1";
		
		int current=Integer.parseInt(pageNumber);
		int boardSize=10;
		int start=(current-1)*boardSize+1;
		int end=current*boardSize;
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		hmap.put("start", start);
		hmap.put("end", end);
		
		int count=serviceDao.getQuestionCount();
		
		List<AdminService_questionDto> boardList=null;
		
		if(count>0) {
			boardList=serviceDao.getQuestionList(hmap);
		}
		//LogAspect.logger.info(LogAspect.logMsg+"count, boardList : " +count +", " +boardList.size());
		
		
		mav.addObject("count", count);
		mav.addObject("boardList", boardList);
		mav.addObject("boardSize", boardSize);
		mav.addObject("pageNumber", current);
		mav.setViewName("admin/service/service/serviceManager.admin");
		
	}

	//자주묻는질문 글쓰기
	@Override
	public void serviceWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/service/serviceManager_write.admin");
		
	}
	
	@Override
	public void serviceWriteOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		AdminService_questionDto questionDto=(AdminService_questionDto)map.get("questionDto");
		
		Random rd=new Random();
		questionDto.setQuestion_num(rd.nextInt(1000));
		questionDto.setQuestion_date(new Date());
		int check=serviceDao.writeQuestion(questionDto);
		
		mav.addObject("check", check);
		mav.setViewName("admin/service/service/serviceManager_writeOk.admin");
		
	}
	
	//자주묻는질문 수정
		@Override
		public void serviceUpdateMove(ModelAndView mav) {
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");
			String question_num=request.getParameter("question_num");
			String pageNumber=request.getParameter("pageNumber");
			
			AdminService_questionDto questionDto=serviceDao.questionUpSelect(question_num);
			System.out.println(questionDto.toString());
			
			mav.addObject("questionDto", questionDto);
			mav.addObject("pageNumber", pageNumber);
			mav.setViewName("admin/service/service/serviceManager_update.admin");			
		}
		
		@Override
		public void serviceUpdateOkMove(ModelAndView mav) {		
			AdminService_questionDto questionDto=(AdminService_questionDto)mav.getModel().get("questionDto");
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");		
			
			String pageNumber=request.getParameter("pageNumber");
			
			LogAspect.logger.info(LogAspect.logMsg+pageNumber);

			//LogAspect.logger.info(LogAspect.logMsg+questionDto.toString());
			
			questionDto.setQuestion_date(new Date());
			
			LogAspect.logger.info(LogAspect.logMsg+questionDto.toString());
			
			int check=serviceDao.serviceUpdate(questionDto);
			LogAspect.logger.info(LogAspect.logMsg+check);
			
			mav.addObject("check", check);
			mav.addObject("pageNumber", pageNumber);
			mav.setViewName("admin/service/service/serviceManager_updateOk.admin");
		}
		
		//자주묻는질문 삭제
		@Override
		public void serviceDeleteMove(ModelAndView mav) {
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");
			long question_num=Long.parseLong(request.getParameter("question_num"));
			mav.addObject("question_num", question_num);
			mav.setViewName("admin/service/service/serviceManager_delete.admin"); 
			
		}
		
		@Override
		public void serviceDeleteOkMove(ModelAndView mav) {
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");
			long question_num=Long.parseLong(request.getParameter("question_num"));
			
			int check=serviceDao.delete_question(question_num);
			
			mav.addObject("check",check);
			mav.setViewName("admin/service/service/serviceManager_deleteOk.admin");
			
		}
	
	
	/** 자주묻는질문 끝*/
	
	
	/** 공지사항 시작*/
		
	//공지사항 리스트
	@Override
	public void noticeMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null)pageNumber="1";
		
		int current=Integer.parseInt(pageNumber);
		int boardSize=10;
		int start=(current-1)*boardSize+1;
		int end=current*boardSize;
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		hmap.put("start", start);
		hmap.put("end", end);
		
		int count=serviceDao.getCount();
		
		List<AdminService_noticeDto> boardList=null;
		
		if(count>0) {
			boardList=serviceDao.getList(hmap);
		}
		//LogAspect.logger.info(LogAspect.logMsg+"count, boardList : " +count +", " +boardList.size());
		
		
		mav.addObject("count", count);
		mav.addObject("boardList", boardList);
		mav.addObject("boardSize", boardSize);
		mav.addObject("pageNumber", current);
		mav.setViewName("admin/service/notice/noticeManager.admin");
		
	}
	
	@Override
	public void noticeReadMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		String notice_num=request.getParameter("notice_num");
		
		LogAspect.logger.info(LogAspect.logMsg+pageNumber+","+notice_num);
		
		AdminService_noticeDto noticeDto=serviceDao.noticeSelect(notice_num);
		LogAspect.logger.info(LogAspect.logMsg+noticeDto.toString());
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("notice_num",notice_num);
		mav.addObject("noticeDto", noticeDto);
		mav.setViewName("admin/service/notice/noticeManager_read.admin");
		
	}
	
	//공지사항 쓰기
	@Override
	public void noticeWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");	
		
		//페이지번호를 null로 받아서 초기 페이지번호 생성
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null)pageNumber="1";
		
		String writer="관리자";
		Date today_date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd");
		String today =sdf.format(today_date);
		
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("today", today);
		mav.addObject("writer", writer);
		mav.setViewName("admin/service/notice/noticeManager_write.admin");		
	}
	

	//공지사항 쓰기 완료
	@Override
	public void noticeWriteOkMove(ModelAndView mav) {		
		AdminService_noticeDto noticeDto=(AdminService_noticeDto)mav.getModel().get("noticeDto");
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");		
		
		LogAspect.logger.info(LogAspect.logMsg+noticeDto.toString());
		
		String pageNumber=request.getParameter("pageNumber");
		LogAspect.logger.info(LogAspect.logMsg+pageNumber);
		
		String alert="[공지사항]";
		String subj=noticeDto.getNotice_subject();
				
		noticeDto.setNotice_content(noticeDto.getNotice_content().replace("\r\n", "<br/>"));
		noticeDto.setNotice_subject(alert+subj);
		noticeDto.setNotice_date(new Date());
		
		LogAspect.logger.info(LogAspect.logMsg+noticeDto.toString());
		
		int check=serviceDao.noticeInsert(noticeDto);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("check", check);
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName("admin/service/notice/noticeManager_writeOk.admin");		
	}
	
	
	//공지사항 수정
	@Override
	public void noticeUpdateMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		String notice_num=request.getParameter("notice_num");
		
		AdminService_noticeDto noticeDto=serviceDao.noticeUpSelect(notice_num);
		LogAspect.logger.info(LogAspect.logMsg+noticeDto.toString());
		
		mav.addObject("noticeDto", noticeDto);
		mav.addObject("notice_num", notice_num);
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName("admin/service/notice/noticeManager_update.admin");	
	}
	
	//공지사항 수정완료
	@Override
	public void noticeUpdateOkMove(ModelAndView mav) {		
		AdminService_noticeDto noticeDto=(AdminService_noticeDto)mav.getModel().get("noticeDto");
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");		
		
		String notice_num=request.getParameter("notice_num");
		String pageNumber=request.getParameter("pageNumber");
		LogAspect.logger.info(LogAspect.logMsg+pageNumber);

		LogAspect.logger.info(LogAspect.logMsg+noticeDto.toString());
		
		noticeDto.setNotice_date(new Date());
		
		LogAspect.logger.info(LogAspect.logMsg+noticeDto.toString());
		
		int check=serviceDao.noticeUpdate(noticeDto);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("check", check);
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName("admin/service/notice/noticeManager_updateOk.admin");
	}
	
	@Override
	public void noticeDeleteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		String notice_num=request.getParameter("notice_num");
		System.out.println(pageNumber+","+notice_num);
		
		mav.addObject("pagenumber", pageNumber);
		mav.addObject("notice_num", notice_num);
		mav.setViewName("admin/service/notice/noticeManager_delete.admin");
		
	}
	
	@Override
	public void noticeDeleteOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		String notice_num=request.getParameter("notice_num");
		System.out.println(pageNumber+","+notice_num);
		
		int check=serviceDao.delete_notice(notice_num);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("pageNumber", pageNumber);
		mav.addObject("notice_num", notice_num);
		mav.addObject("check", check);
		
		mav.setViewName("admin/service/notice/noticeManager_deleteOk.admin");
		
	}

	
	/** 공지사항 끝*/
	

	
	/** 1:1문의 시작*/
	@Override
	public void contactMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null)pageNumber="1";
		
		int current=Integer.parseInt(pageNumber);
		int boardSize=10;
		int start=(current-1)*boardSize+1;
		int end=current*boardSize;
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		hmap.put("start", start);
		hmap.put("end", end);
		
		int count=serviceDao.getContactCount();
		
		List<AdminService_contactDto> contactBoardList=null;
		
		if(count>0) {
			contactBoardList=serviceDao.getContactList(hmap); 
		}
		//LogAspect.logger.info(LogAspect.logMsg+"count, boardList : " +count +", " +boardList.size());
		
		
		mav.addObject("count", count);
		mav.addObject("boardList", contactBoardList);
		mav.addObject("boardSize", boardSize);
		mav.addObject("pageNumber", current);
		mav.setViewName("admin/service/contact/contactManager.admin");
		
	}
	
	@Override
	public void contactReadMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null)pageNumber="1";
		String contact_num=request.getParameter("contact_num");
		
		
		LogAspect.logger.info(LogAspect.logMsg+pageNumber+","+contact_num);
		
		//공지사항 글번호로 조회
		AdminService_contactDto contactDto=serviceDao.contactSelect(contact_num);
		LogAspect.logger.info(LogAspect.logMsg+contactDto.toString());
		
		/*if(contactDto.getContact_answer_whether()=="답변대기중") {
			String answer_whether=contactDto.getContact_answer_whether();
			System.out.println(no_answer);
			mav.addObject("no_answer", no_answer);*/
		
		String answer_whether=contactDto.getContact_answer_whether();
			
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("contact_num",contact_num);
		mav.addObject("contactDto", contactDto);
		mav.addObject("answer_whether", answer_whether);
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName("admin/service/contact/contactManager_read.admin");
		
	}
	
	@Override
	public void contactWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String contact_num=request.getParameter("contact_num");
		System.out.println(contact_num);
		AdminService_contactDto contactDto=serviceDao.contactSelect(contact_num);
		mav.addObject("contactDto", contactDto);
		
		mav.setViewName("admin/service/contact/contactManager_write.admin");		
	}
	
	@Override
	public void contactWriteOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		AdminService_contactDto contactDto=(AdminService_contactDto)map.get("contactDto");
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		long contact_num=contactDto.getContact_num();
		
		LogAspect.logger.info(LogAspect.logMsg+contactDto.toString());
		
		contactDto.setContact_answer_whether("답변완료");		
		
		int check=serviceDao.writeInsert(contactDto.getContact_answer(), contactDto.getContact_answer_whether(), contact_num);
		System.out.println(check);
		mav.addObject("check", check);
		
		mav.setViewName("admin/service/contact/contactManager_writeOk.admin");		
	}
	
	@Override
	public void contactUpdateMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager_update.admin");
		
	}
	
	@Override
	public void contactDeleteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		String contact_num=request.getParameter("contact_num");
		System.out.println(pageNumber+","+contact_num);
		
		mav.addObject("pagenumber", pageNumber);
		mav.addObject("contact_num", contact_num);
		mav.setViewName("admin/service/contact/contactManager_delete.admin");
		
	}
	
	@Override
	public void contactDeleteOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String pageNumber=request.getParameter("pageNumber");
		String contact_num=request.getParameter("contact_num");
		System.out.println(pageNumber+","+contact_num);
		
		int check=serviceDao.delete_contact(contact_num);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("pageNumber", pageNumber);
		mav.addObject("contact_num", contact_num);
		mav.addObject("check", check);
		
		mav.setViewName("admin/service/contact/contactManager_deleteOk.admin");
		
	}

	@Override
	public void serviceDownload(ModelAndView mav) {
		Map<String, Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		HttpServletResponse response=(HttpServletResponse)map.get("response");
		long contact_num=Long.parseLong(request.getParameter("contact_num"));
		
		AdminService_contactDto contactDto=serviceDao.getFile(contact_num);
		System.out.println(contactDto.toString());
		
		contactDto.setContact_file_name(contactDto.getContact_file_name().substring(contactDto.getContact_file_name().indexOf("_")+1));
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
		String fileName=new String(contactDto.getContact_file_name().getBytes("utf-8"),"ISO-8859-1");
		
		response.setContentType("image/x-icon");
		response.setContentLength((int)contactDto.getContact_file_size());
		response.setHeader("Content-Disposition", "attachment;filename="+fileName+";");
		
		bis=new BufferedInputStream(new FileInputStream(contactDto.getContact_file_path()));
		bos=new BufferedOutputStream(response.getOutputStream());
		
		while(true) {
			int data=bis.read();
			if(data==-1)break;
			bos.write(data);
			
		}
		bos.flush();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis!=null)	bis.close();
				if(bos!=null)	bos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
		
	
	/** 1:1문의 끝*/
	
}
