package com.quiz.bank.api.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.bank.api.admin.mapper.AdminMapper;
import com.quiz.bank.api.admin.vo.QuizParamVO;
import com.quiz.bank.api.admin.vo.QuizSolveParamVO;
import com.quiz.bank.api.admin.vo.SubjectCategoryListResultVO;
import com.quiz.bank.api.admin.vo.SubjectCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestCategoryListResultVO;
import com.quiz.bank.api.admin.vo.TestCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestParamVO;
import com.quiz.bank.api.admin.vo.TestRegistResultVO;
import com.quiz.bank.common.error.ErrorCode;
import com.quiz.bank.common.vo.ResultVO;

@Service
public class AdminService {
	
	@Autowired AdminMapper adminMapper;
	
	public ResultVO registTestCategory(TestCategoryParamVO param) {
		adminMapper.registTestCategory(param);
		ResultVO rv = selectTestCategoryList();
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}
	
	public ResultVO registSubjectCategory(SubjectCategoryParamVO param) {
		adminMapper.registSubjectCategoryList(param);
		ResultVO rv = selectSubjectCategoryList(param);
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}
	
	public ResultVO selectTestCategoryList() {
		List<TestCategoryParamVO> list = adminMapper.selectTestCategoryList();
		TestCategoryListResultVO rv = new TestCategoryListResultVO();
		rv.setTest_category_list(list);
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}
	
	public ResultVO selectSubjectCategoryList(SubjectCategoryParamVO param) {
		List<SubjectCategoryParamVO> list = adminMapper.selectSubjectCategoryList(param);
		SubjectCategoryListResultVO rv = new SubjectCategoryListResultVO();

		rv.setTest_category_no(param.getTest_category_no());
		rv.setSubject_category_list(list);
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}

	public ResultVO registTest(TestParamVO param) {

		adminMapper.registTest(param);
		TestRegistResultVO rv = new TestRegistResultVO();
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		rv.setTest_no(param.getTest_no());
		
		return rv;
	}

	public ResultVO registQuizzes(QuizParamVO[] param) {

		for (QuizParamVO quizParamVO : param) {
			adminMapper.registQuizzes(quizParamVO);
		}
		
		ResultVO rv = new ResultVO();
		
		
		return rv;
	}

	public ResultVO registQuizSolve(QuizSolveParamVO[] param) {

		
		//1.답 조회 할 배열 스트링 만들기
		String my_answer_list = "(";
		for (QuizSolveParamVO quizSolveParamVO : param) {
			my_answer_list += quizSolveParamVO.getMy_answer();
			my_answer_list += ",";
		}
		my_answer_list = my_answer_list.substring(0,my_answer_list.length()-1);
		my_answer_list += ")";
		adminMapper.registQuizSolve(my_answer_list);
		
		ResultVO rv = new ResultVO();
		
		
		return rv;
	}
}
