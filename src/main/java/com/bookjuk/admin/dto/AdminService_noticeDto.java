package com.bookjuk.admin.dto;

import java.util.Date;

public class AdminService_noticeDto {
	
	//공지사항
	private long notice_num;				 // NUMBER(10) PRIMARY KEY,  -- 공지사항 번호
	private String notice_subject; 			 //VARCHAR2(100),       -- 제목
	private String notice_content; 			 //VARCHAR2(4000),      -- 내용
	private String notice_writer; 			 //VARCHAR2(15),         -- 작성자
	private Date notice_date; 				 //TIMESTAMP,               -- 작성일
	public long getNotice_num() {
		return notice_num;
	}
	public void setNotice_num(long notice_num) {
		this.notice_num = notice_num;
	}
	public String getNotice_subject() {
		return notice_subject;
	}
	public void setNotice_subject(String notice_subject) {
		this.notice_subject = notice_subject;
	}
	public String getNotice_content() {
		return notice_content;
	}
	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	public String getNotice_writer() {
		return notice_writer;
	}
	public void setNotice_writer(String notice_writer) {
		this.notice_writer = notice_writer;
	}
	public Date getNotice_date() {
		return notice_date;
	}
	public void setNotice_date(Date notice_date) {
		this.notice_date = notice_date;
	}
	@Override
	public String toString() {
		return "AdminService_noticeDto [notice_num=" + notice_num + ", notice_subject=" + notice_subject
				+ ", notice_content=" + notice_content + ", notice_writer=" + notice_writer + ", notice_date="
				+ notice_date + "]";
	}

	
	
}

