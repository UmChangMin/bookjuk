package com.bookjuk.admin.dto;

import java.util.Date;

public class AdminService_questionDto {

	//자주묻는질문
	 private long question_num;				 //NUMBER(10) PRIMARY KEY,  -- 자주묻는질문 번호
	 private String question_subject;		 //VARCHAR2(100),       -- 제목
	 private String question_content; 		 //VARCHAR2(4000),      -- 내용
	 private Date question_date;			 //TIMESTAMP         -- 작성일 ( 관리자 뷰 & 사용자 뷰 등록일 존재하지 않아용 )
	 
}

