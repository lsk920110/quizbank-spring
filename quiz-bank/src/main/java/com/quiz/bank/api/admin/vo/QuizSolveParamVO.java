package com.quiz.bank.api.admin.vo;

public class QuizSolveParamVO {
	
	private int quiz_no;
	private boolean correct_wrong;
	
	/**my answer*/
	private String my_answer;
	

	public int getQuiz_no() {
		return quiz_no;
	}
	public void setQuiz_no(int quiz_no) {
		this.quiz_no = quiz_no;
	}
	public boolean isCorrect_wrong() {
		return correct_wrong;
	}
	public void setCorrect_wrong(boolean correct_wrong) {
		this.correct_wrong = correct_wrong;
	}

	public String getMy_answer() {
		return my_answer;
	}
	public void setMy_answer(String my_answer) {
		this.my_answer = my_answer;
	}	
	
	
	

}
