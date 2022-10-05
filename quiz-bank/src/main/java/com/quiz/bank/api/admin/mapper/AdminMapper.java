package com.quiz.bank.api.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.bank.api.admin.vo.MainStatisticTestCRVO;
import com.quiz.bank.api.admin.vo.QuizParamVO;
import com.quiz.bank.api.admin.vo.QuizResultVO;
import com.quiz.bank.api.admin.vo.QuizSolveParamVO;
import com.quiz.bank.api.admin.vo.SubjectCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestParamVO;

@Mapper
public interface AdminMapper {

  void registTestCategory(TestCategoryParamVO param);

  void registSubjectCategoryList(SubjectCategoryParamVO param);

  List<TestCategoryParamVO> readTestCategoryList();

  List<SubjectCategoryParamVO> readSubjectCategoryList(int param);

  void registTest(TestParamVO param);

  void registQuiz(QuizParamVO quizParamVO);

  String readAnswer(int quiz_no);

  void registQuizSolve(QuizSolveParamVO param);

  QuizResultVO readQuiz(int param);

  List<QuizParamVO> quizListByTest_no(int category_no);

  List<QuizParamVO> quizListBySubject_no(int category_no);

  List<MainStatisticTestCRVO> MainStatisticTestCR();

}
