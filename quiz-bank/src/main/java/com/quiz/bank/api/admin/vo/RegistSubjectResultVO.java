package com.quiz.bank.api.admin.vo;

import com.quiz.bank.common.vo.ResultVO;

public class RegistSubjectResultVO extends ResultVO{

	private int subject_category_no;
	private String subject_category;
	public int getSubject_category_no() {
		return subject_category_no;
	}
	public void setSubject_category_no(int subject_category_no) {
		this.subject_category_no = subject_category_no;
	}
	public String getSubject_category() {
		return subject_category;
	}
	public void setSubject_category(String subject_category) {
		this.subject_category = subject_category;
	}
	
	
	
}
