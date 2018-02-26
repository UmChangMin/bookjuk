package com.bookjuk.admin.dto;

import java.util.Date;

public class AdminService_contactDto {

	//1:1문의
	private long contact_num; 				//NUMBER(10) PRIMARY KEY,   -- 1:1문의 번호   
	private String contact_subject;			//VARCHAR2(100),        -- 제목
	private String contact_content; 		//VARCHAR2(4000),       -- 내용
	private String member_id; 				//VARCHAR2(10),               -- 사용자 아이디  --member_id <= join? session을 타고 넘어온 회원의 아이디를 자동 저장
	private Date contact_date; 				//TIMESTAMP,               -- 작성일
	private String contact_type; 			//VARCHAR2(30);            //-- 문의유형
	private String contact_answer; 			//VARCHAR2(4000),        -- 답변
	private String contact_answer_whether; 	//VARCHAR2(10),  -- 답변 유무
	
	private int contact_group_num; 			//NUMBER(3) NOT NULL,   --관리자 contactList를 뿌려주기 위한 페이징 기법 추가정보
	private int contact_sequence_num; 		//NUMBER(3) NOT NULL,--관리자 contactList를 뿌려주기 위한 페이징 기법 추가정보
	private int contact_sequence_level; 	//NUMBER(3) NOT NULL,--관리자 contactList를 뿌려주기 위한 페이징 기법 추가정보
	  
	private String contact_file_name; 		//VARCHAR2(100),      -- 파일이름
	private String contact_file_path; 		//VARCHAR2(200),      -- 파일경로
	private long contact_file_size; 		//NUMBER(10)          -- 파일사이즈
}

