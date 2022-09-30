package com.quiz.bank.api.admin.vo;

import com.quiz.bank.common.vo.ResultVO;

public class QuizSolveResultVO extends ResultVO{
	
	private boolean correct_wrong;

	public boolean isCorrect_wrong() {
		return correct_wrong;
	}

	public void setCorrect_wrong(boolean correct_wrong) {
		this.correct_wrong = correct_wrong;
	}
	
	

}
