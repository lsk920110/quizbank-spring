package com.quiz.bank.api.admin.vo;

public class QuizSolveParamVO {
	
	private String user_id;
	private int quiz_no;
	private boolean correct_wrong;
	private String test_prac_flag;
	
	/**my answer*/
	private String my_answer;
	

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
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
	public String getTest_prac_flag() {
		return test_prac_flag;
	}
	public void setTest_prac_flag(String test_prac_flag) {
		this.test_prac_flag = test_prac_flag;
	}
	public String getMy_answer() {
		return my_answer;
	}
	public void setMy_answer(String my_answer) {
		this.my_answer = my_answer;
	}	
	
	
	

}
