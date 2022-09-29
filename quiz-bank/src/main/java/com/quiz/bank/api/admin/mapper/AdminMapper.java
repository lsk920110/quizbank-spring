package com.quiz.bank.api.admin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.quiz.bank.api.admin.vo.SubjectCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestCategoryParamVO;

@Repository
public interface AdminMapper {

	void registTestCategory(TestCategoryParamVO param);

	void registSubjectCategoryList(SubjectCategoryParamVO param);

	List<TestCategoryParamVO> selectTestCategoryList();

	List<SubjectCategoryParamVO> selectSubjectCategoryList(SubjectCategoryParamVO param);

}
