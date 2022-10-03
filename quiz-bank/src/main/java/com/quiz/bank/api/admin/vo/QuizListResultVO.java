package com.quiz.bank.api.admin.vo;

import java.util.List;

import com.quiz.bank.common.vo.ResultVO;

public class QuizListResultVO extends ResultVO {

	private List <QuizParamVO> quizList;
	
	
	public List<QuizParamVO> getQuizList() {
		return quizList;
	}


	public void setQuizList(List<QuizParamVO> quizList) {
		this.quizList = quizList;
	}

	
	
}
