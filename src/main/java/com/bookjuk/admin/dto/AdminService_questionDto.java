package com.bookjuk.admin.dto;

import java.util.Date;

public class AdminService_questionDto {

	//자주묻는질문
	 private long question_num;				 //NUMBER(10) PRIMARY KEY,  -- 자주묻는질문 번호
	 private String question_subject;		 //VARCHAR2(100),       -- 제목
	 private String question_content; 		 //VARCHAR2(4000),      -- 내용
	 private Date question_date;			 //TIMESTAMP         -- 작성일 ( 관리자 뷰 & 사용자 뷰 등록일 존재하지 않아용 )
	
	 public long getQuestion_num() {
		return question_num;
	}
	public void setQuestion_num(long question_num) {
		this.question_num = question_num;
	}
	public String getQuestion_subject() {
		return question_subject;
	}
	public void setQuestion_subject(String question_subject) {
		this.question_subject = question_subject;
	}
	public String getQuestion_content() {
		return question_content;
	}
	public void setQuestion_content(String question_content) {
		this.question_content = question_content;
	}
	public Date getQuestion_date() {
		return question_date;
	}
	public void setQuestion_date(Date question_date) {
		this.question_date = question_date;
	}
	
	@Override
	public String toString() {
		return "AdminService_questionDto [question_num=" + question_num + ", question_subject=" + question_subject
				+ ", question_content=" + question_content + ", question_date=" + question_date + "]";
	}
	 
	 
	 
}

