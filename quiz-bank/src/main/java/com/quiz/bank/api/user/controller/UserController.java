package com.quiz.bank.api.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.bank.api.admin.vo.SubjectCategoryParamVO;
import com.quiz.bank.api.admin.vo.TestCategoryParamVO;
import com.quiz.bank.api.user.service.UserService;
import com.quiz.bank.common.vo.ResultVO;

@Controller(value = "/admin/quiz")
public class UserController {

	
	@Autowired
	UserService userService;
	
	
	
	
}
