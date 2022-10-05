package com.quiz.bank.api.admin.vo;

public class MainStatisticTestCRVO {

  private int test_category_no;
  private String test_category;
  private float correct_wrong_per;

  public int getTest_category_no() {
    return this.test_category_no;
  }

  public void setTest_category_no(int test_category_no) {
    this.test_category_no = test_category_no;
  }

  public String getTest_category() {
    return this.test_category;
  }

  public void setTest_category(String test_category) {
    this.test_category = test_category;
  }

  public float getCorrect_wrong_per() {
    return this.correct_wrong_per;
  }

  public void setCorrect_wrong_per(float correct_wrong_per) {
    this.correct_wrong_per = correct_wrong_per;
  }

}
