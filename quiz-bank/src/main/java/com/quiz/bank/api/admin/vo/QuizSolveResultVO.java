package com.quiz.bank.api.admin.vo;

import com.quiz.bank.common.vo.ResultVO;

public class QuizSolveResultVO extends ResultVO {

  private boolean correct_wrong;
  private String quiz_answer;

  public boolean getCorrect_wrong() {
    return this.correct_wrong;
  }

  public String getQuiz_answer() {
    return this.quiz_answer;
  }

  public void setQuiz_answer(String quiz_answer) {
    this.quiz_answer = quiz_answer;
  }

  public boolean isCorrect_wrong() {
    return correct_wrong;
  }

  public void setCorrect_wrong(boolean correct_wrong) {
    this.correct_wrong = correct_wrong;
  }

}
