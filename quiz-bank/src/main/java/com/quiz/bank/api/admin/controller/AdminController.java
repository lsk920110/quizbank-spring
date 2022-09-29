package com.quiz.bank.api.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.bank.api.admin.service.AdminService;
import com.quiz.bank.api.admin.vo.SubjectCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestCategoryParamVO;
import com.quiz.bank.common.controller.BaseController;
import com.quiz.bank.common.vo.ResultVO;
import com.quiz.bank.utils.Validation;

@Controller(value = "/admin/quiz/")
public class AdminController extends BaseController {

	@Autowired
	AdminService adminService;
	
	
	@RequestMapping(value="/test")
	public String test() {
		logger.info("asd");
		
		
		return "registQuiz.html";
	}
	
	@PostMapping(value="regist/testCategory")
	@ResponseBody
	public ResultVO registTestCategory(@RequestBody TestCategoryParamVO param) throws Exception {
		Validation.notNull(param);

		
		ResultVO rv = adminService.registTestCategory(param);
		return rv;
	}
	
	@PostMapping(value="regist/subjectCategory")
	@ResponseBody
	public ResultVO registSubjectCategory(@RequestBody SubjectCategoryParamVO param) throws Exception {
		Validation.notNull(param);

		ResultVO rv = adminService.registSubjectCategory(param);
		
		
		return rv;
	}
	
	@GetMapping(value="select/testCategoryList")
	@ResponseBody
	public ResultVO selectTestCategoryList() {
		
		ResultVO rv = adminService.selectTestCategoryList();
		
		return rv;
	}
	
	@GetMapping(value="select/subjectCategoryList")
	@ResponseBody
	public ResultVO selectSubjectCategoryList(@RequestBody SubjectCategoryParamVO param) {
		
		ResultVO rv = adminService.selectSubjectCategoryList(param);
		
		return rv;
	}
	
}
