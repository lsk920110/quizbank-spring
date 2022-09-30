package com.quiz.bank.api.admin.vo;

import java.util.List;

import com.quiz.bank.common.vo.ResultVO;

public class SubjectCategoryListResultVO extends ResultVO{

	
	private int test_category_no;
	private String test_category;
	
	private List<SubjectCategoryParamVO> subject_category_list;

	public int getTest_category_no() {
		return test_category_no;
	}

	public void setTest_category_no(int test_category_no) {
		this.test_category_no = test_category_no;
	}

	public String getTest_category() {
		return test_category;
	}

	public void setTest_category(String test_category) {
		this.test_category = test_category;
	}

	public List<SubjectCategoryParamVO> getSubject_category_list() {
		return subject_category_list;
	}

	public void setSubject_category_list(List<SubjectCategoryParamVO> subject_category_list) {
		this.subject_category_list = subject_category_list;
	}


	
}
