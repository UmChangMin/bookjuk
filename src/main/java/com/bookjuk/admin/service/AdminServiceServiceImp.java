package com.bookjuk.admin.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
		
		//AdminService_questionDto questionDto=serviceDao.selectService();
		
		mav.setViewName("admin/service/service/serviceManager.admin");
		
	}

	//자주묻는질문 글쓰기
	@Override
	public void serviceWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/service/serviceManager_write.admin");
		
	}
	
	//자주묻는질문 수정
		@Override
		public void serviceUpdateMove(ModelAndView mav) {
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");
			
			mav.setViewName("admin/service/service/serviceManager_update.admin");
			
		}
		
		//자주묻는질문 삭제
		@Override
		public void serviceDeleteMove(ModelAndView mav) {
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");
			
			mav.setViewName("admin/service/service/serviceManager_delete.admin");
			
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
		String noticeNumber=request.getParameter("notice_num");
		
		LogAspect.logger.info(LogAspect.logMsg+pageNumber+","+noticeNumber);
		
		//공지사항 글번호로 조회
		AdminService_noticeDto noticeDto=serviceDao.noticeSelect(noticeNumber);
		LogAspect.logger.info(LogAspect.logMsg+noticeDto.toString());
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("noticeNumber",noticeNumber);
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
		
		mav.addObject("pageNumber",pageNumber);
		
		mav.setViewName("admin/service/notice/noticeManager_write.admin");		
	}
	

	//공지사항 쓰기 완료
	@Override
	public void noticeWriteOkMove(ModelAndView mav) {		
		AdminService_noticeDto noticeDto=(AdminService_noticeDto)mav.getModel().get("noticeDto");
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");		
		
		String pageNumber=request.getParameter("pageNumber");
		LogAspect.logger.info(LogAspect.logMsg+pageNumber);
		
		//SimpleDateFormat으로 수정여부? --18/02/23 김태우
		/*SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd hh:mm");
		noticeDto.setNotice_date(sdf.format(new Date()));
		
		list 페이지 자체에서 fmt: ... pattern으로 받겠음
		*/
		
		//제목 앞에 공지사항을 자동적으로 추가하게 만듬
		
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
	
	
	
	@Override
	public void noticeUpdateMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager_update.admin");
		
	}
	
	@Override
	public void noticeDeleteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager_delete.admin");
		
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
		mav.addObject("pageNumber",pageNumber);
		mav.addObject("contact_num",contact_num);
		mav.addObject("contactDto", contactDto);
		
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName("admin/service/contact/contactManager_read.admin");
		
	}
	
	@Override
	public void contactWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager_write.admin");
		
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
		
		mav.setViewName("admin/service/contact/contactManager_delete.admin");
		
	}


	
	/** 1:1문의 끝*/
	
}
