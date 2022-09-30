package com.quiz.bank.api.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.bank.api.admin.mapper.AdminMapper;
import com.quiz.bank.api.admin.vo.QuizParamVO;
import com.quiz.bank.api.admin.vo.QuizResultVO;
import com.quiz.bank.api.admin.vo.QuizSolveParamVO;
import com.quiz.bank.api.admin.vo.QuizSolveResultVO;
import com.quiz.bank.api.admin.vo.RegistCategoryResultVO;
import com.quiz.bank.api.admin.vo.RegistSubjectResultVO;
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
		//ResultVO rv = readTestCategoryList();
		RegistCategoryResultVO rv = new RegistCategoryResultVO();
		
		rv.setTest_category(param.getTest_category());
		rv.setTest_category_no(param.getTest_category_no());
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}
	
	public ResultVO registSubjectCategory(SubjectCategoryParamVO param) {
		adminMapper.registSubjectCategoryList(param);
		RegistSubjectResultVO rv = new RegistSubjectResultVO();
		rv.setSubject_category(param.getSubject_category());
		rv.setSubject_category_no(param.getSubject_category_no());
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}
	
	public ResultVO readTestCategoryList() {
		List<TestCategoryParamVO> list = adminMapper.readTestCategoryList();
		TestCategoryListResultVO rv = new TestCategoryListResultVO();
		rv.setTest_category_list(list);
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}
	
	public ResultVO readSubjectCategoryList(int param) {
		List<SubjectCategoryParamVO> list = adminMapper.readSubjectCategoryList(param);
		SubjectCategoryListResultVO rv = new SubjectCategoryListResultVO();

		rv.setTest_category_no(param);
		rv.setSubject_category_list(list);
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		return rv;
	}

	@Deprecated
	public ResultVO registTest(TestParamVO param) {

		adminMapper.registTest(param);
		TestRegistResultVO rv = new TestRegistResultVO();
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		rv.setTest_no(param.getTest_no());
		
		return rv;
	}

	public ResultVO registQuiz(QuizParamVO param) {

		adminMapper.registQuiz(param);

		
		ResultVO rv = new ResultVO();
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());		
		
		return rv;
	}

	public ResultVO registQuizSolve(QuizSolveParamVO param) {

		String answer = adminMapper.readAnswer(param.getQuiz_no());
		boolean correct = param.getMy_answer().equals(answer) ? true : false;
		param.setCorrect_wrong(correct);
		adminMapper.registQuizSolve(param);
		
		QuizSolveResultVO rv = new QuizSolveResultVO();
		rv.setCorrect_wrong(correct);
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());
		
		return rv;
	}

	public ResultVO readQuiz(int param) {

		QuizResultVO rv = adminMapper.readQuiz(param);
		rv.setErrorCode(ErrorCode.SUCCESS.getCode());
		rv.setErrorMessage(ErrorCode.SUCCESS.getKey());		
		
		return rv;
	}
}
