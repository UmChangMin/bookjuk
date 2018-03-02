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
	
	/*private int contact_group_num; 			//NUMBER(3) NOT NULL,   --관리자 contactList를 뿌려주기 위한 페이징 기법 추가정보
	private int contact_sequence_num; 		//NUMBER(3) NOT NULL,--관리자 contactList를 뿌려주기 위한 페이징 기법 추가정보
	private int contact_sequence_level; 	//NUMBER(3) NOT NULL,--관리자 contactList를 뿌려주기 위한 페이징 기법 추가정보
*/	  
	private String contact_file_name; 		//VARCHAR2(100),      -- 파일이름
	private String contact_file_path; 		//VARCHAR2(200),      -- 파일경로
	private long contact_file_size; 		//NUMBER(10)          -- 파일사이즈
	public long getContact_num() {
		return contact_num;
	}
	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}
	public String getContact_subject() {
		return contact_subject;
	}
	public void setContact_subject(String contact_subject) {
		this.contact_subject = contact_subject;
	}
	public String getContact_content() {
		return contact_content;
	}
	public void setContact_content(String contact_content) {
		this.contact_content = contact_content;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Date getContact_date() {
		return contact_date;
	}
	public void setContact_date(Date contact_date) {
		this.contact_date = contact_date;
	}
	public String getContact_type() {
		return contact_type;
	}
	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}
	public String getContact_answer() {
		return contact_answer;
	}
	public void setContact_answer(String contact_answer) {
		this.contact_answer = contact_answer;
	}
	public String getContact_answer_whether() {
		return contact_answer_whether;
	}
	public void setContact_answer_whether(String contact_answer_whether) {
		this.contact_answer_whether = contact_answer_whether;
	}
	public String getContact_file_name() {
		return contact_file_name;
	}
	public void setContact_file_name(String contact_file_name) {
		this.contact_file_name = contact_file_name;
	}
	public String getContact_file_path() {
		return contact_file_path;
	}
	public void setContact_file_path(String contact_file_path) {
		this.contact_file_path = contact_file_path;
	}
	public long getContact_file_size() {
		return contact_file_size;
	}
	public void setContact_file_size(long contact_file_size) {
		this.contact_file_size = contact_file_size;
	}
	@Override
	public String toString() {
		return "AdminService_contactDto [contact_num=" + contact_num + ", contact_subject=" + contact_subject
				+ ", contact_content=" + contact_content + ", member_id=" + member_id + ", contact_date=" + contact_date
				+ ", contact_type=" + contact_type + ", contact_answer=" + contact_answer + ", contact_answer_whether="
				+ contact_answer_whether + ", contact_file_name=" + contact_file_name + ", contact_file_path="
				+ contact_file_path + ", contact_file_size=" + contact_file_size + "]";
	}
	
	

}

