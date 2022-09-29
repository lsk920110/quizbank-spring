package com.quiz.bank.api.admin.vo;

import java.util.List;

import com.quiz.bank.common.vo.ResultVO;

public class TestCategoryListResultVO extends ResultVO{

	private List<TestCategoryParamVO> test_category_list;

	public List<TestCategoryParamVO> getTest_category_list() {
		return test_category_list;
	}

	public void setTest_category_list(List<TestCategoryParamVO> test_category_list) {
		this.test_category_list = test_category_list;
	}
	
	
}
