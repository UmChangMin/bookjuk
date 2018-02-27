package com.bookjuk.service.dto;

import java.util.Date;

public class ServiceContactDto {

	private long contact_num;			// 1:1문의 번호
	private String contact_subject;		// 제목
	private String contact_content;		// 내용
	private String member_id;			// 아이디
	private Date contact_date;			// 작성일
	private String contact_type;		// 문의유형
	private String contact_answer;		// 답변
	private String contact_answer_whether;	// 답변유무
	
	private int contact_group_num;		
	private int contact_sequence_num;
	private int contact_sequence_level;
	
	private String contact_file_name;	// 파일이름
	private String contact_file_path;	// 파일경로
	private long contact_file_size;		// 파일사이즈
	
	public ServiceContactDto() {}

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

	public int getContact_group_num() {
		return contact_group_num;
	}

	public void setContact_group_num(int contact_group_num) {
		this.contact_group_num = contact_group_num;
	}

	public int getContact_sequence_num() {
		return contact_sequence_num;
	}

	public void setContact_sequence_num(int contact_sequence_num) {
		this.contact_sequence_num = contact_sequence_num;
	}

	public int getContact_sequence_level() {
		return contact_sequence_level;
	}

	public void setContact_sequence_level(int contact_sequence_level) {
		this.contact_sequence_level = contact_sequence_level;
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

	public ServiceContactDto(long contact_num, String contact_subject, String contact_content, String member_id,
			Date contact_date, String contact_type, String contact_answer, String contact_answer_whether,
			int contact_group_num, int contact_sequence_num, int contact_sequence_level, String contact_file_name,
			String contact_file_path, long contact_file_size) {
		super();
		this.contact_num = contact_num;
		this.contact_subject = contact_subject;
		this.contact_content = contact_content;
		this.member_id = member_id;
		this.contact_date = contact_date;
		this.contact_type = contact_type;
		this.contact_answer = contact_answer;
		this.contact_answer_whether = contact_answer_whether;
		this.contact_group_num = contact_group_num;
		this.contact_sequence_num = contact_sequence_num;
		this.contact_sequence_level = contact_sequence_level;
		this.contact_file_name = contact_file_name;
		this.contact_file_path = contact_file_path;
		this.contact_file_size = contact_file_size;
	}

	@Override
	public String toString() {
		return "ServiceContactDto [contact_num=" + contact_num + ", contact_subject=" + contact_subject
				+ ", contact_content=" + contact_content + ", member_id=" + member_id + ", contact_date=" + contact_date
				+ ", contact_type=" + contact_type + ", contact_answer=" + contact_answer + ", contact_answer_whether="
				+ contact_answer_whether + ", contact_group_num=" + contact_group_num + ", contact_sequence_num="
				+ contact_sequence_num + ", contact_sequence_level=" + contact_sequence_level + ", contact_file_name="
				+ contact_file_name + ", contact_file_path=" + contact_file_path + ", contact_file_size="
				+ contact_file_size + "]";
	}

	
}
