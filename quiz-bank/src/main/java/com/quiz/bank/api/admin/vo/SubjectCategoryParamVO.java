package com.quiz.bank.api.admin.vo;

public class SubjectCategoryParamVO {


	private String test_category_no;
	private String subject_category_no;
	private String subject_category;
	private boolean used_yn;
	
	
	
	public String getTest_category_no() {
		return test_category_no;
	}
	public void setTest_category_no(String test_category_no) {
		this.test_category_no = test_category_no;
	}
	public String getSubject_category_no() {
		return subject_category_no;
	}
	public void setSubject_category_no(String subject_category_no) {
		this.subject_category_no = subject_category_no;
	}
	public String getSubject_category() {
		return subject_category;
	}
	public void setSubject_category(String subject_category) {
		this.subject_category = subject_category;
	}
	public boolean isUsed_yn() {
		return used_yn;
	}
	public void setUsed_yn(boolean used_yn) {
		this.used_yn = used_yn;
	}
	
}
