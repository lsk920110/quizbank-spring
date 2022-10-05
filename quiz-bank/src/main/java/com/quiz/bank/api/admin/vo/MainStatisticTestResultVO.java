package com.quiz.bank.api.admin.vo;

import java.util.List;

import com.quiz.bank.common.vo.ResultVO;

public class MainStatisticTestResultVO extends ResultVO {
  private List<MainStatisticTestCRVO> list;

  public List<MainStatisticTestCRVO> getList() {
    return this.list;
  }

  public void setList(List<MainStatisticTestCRVO> list) {
    this.list = list;
  }

}
