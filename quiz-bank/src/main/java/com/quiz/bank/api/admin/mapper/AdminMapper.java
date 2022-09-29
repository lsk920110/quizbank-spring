package com.quiz.bank.api.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quiz.bank.api.admin.vo.QuizParamVO;
import com.quiz.bank.api.admin.vo.SubjectCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestParamVO;

@Mapper
public interface AdminMapper {

	void registTestCategory(TestCategoryParamVO param);

	void registSubjectCategoryList(SubjectCategoryParamVO param);

	List<TestCategoryParamVO> selectTestCategoryList();

	List<SubjectCategoryParamVO> selectSubjectCategoryList(SubjectCategoryParamVO param);

	void registTest(TestParamVO param);

	void registQuizzes(String my_answer_list);

}
