package com.quiz.bank.api.admin.vo;

public class QuizParamVO {
  private String test_category;
  private String subject_category;
  private int quiz_no;

  private int test_category_no;
  private int subject_category_no;
  private String quiz_content;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private String option5;
  private String quiz_answer;

  public String getTest_category() {
    return this.test_category;
  }

  public void setTest_category(String test_category) {
    this.test_category = test_category;
  }

  public String getSubject_category() {
    return this.subject_category;
  }

  public void setSubject_category(String subject_category) {
    this.subject_category = subject_category;
  }

  public int getQuiz_no() {
    return this.quiz_no;
  }

  public void setQuiz_no(int quiz_no) {
    this.quiz_no = quiz_no;
  }

  public int getTest_category_no() {
    return test_category_no;
  }

  public void setTest_category_no(int test_category_no) {
    this.test_category_no = test_category_no;
  }

  public int getSubject_category_no() {
    return subject_category_no;
  }

  public void setSubject_category_no(int subject_category_no) {
    this.subject_category_no = subject_category_no;
  }

  public String getQuiz_content() {
    return quiz_content;
  }

  public void setQuiz_content(String quiz_content) {
    this.quiz_content = quiz_content;
  }

  public String getOption1() {
    return option1;
  }

  public void setOption1(String option1) {
    this.option1 = option1;
  }

  public String getOption2() {
    return option2;
  }

  public void setOption2(String option2) {
    this.option2 = option2;
  }

  public String getOption3() {
    return option3;
  }

  public void setOption3(String option3) {
    this.option3 = option3;
  }

  public String getOption4() {
    return option4;
  }

  public void setOption4(String option4) {
    this.option4 = option4;
  }

  public String getOption5() {
    return option5;
  }

  public void setOption5(String option5) {
    this.option5 = option5;
  }

  public String getQuiz_answer() {
    return quiz_answer;
  }

  public void setQuiz_answer(String quiz_answer) {
    this.quiz_answer = quiz_answer;
  }

}
