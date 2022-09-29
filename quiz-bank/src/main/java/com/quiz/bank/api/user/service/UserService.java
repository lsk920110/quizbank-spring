package com.quiz.bank.api.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.bank.api.admin.vo.TestCategoryParamVO;
import com.quiz.bank.api.user.mapper.UserMapper;
import com.quiz.bank.common.vo.ResultVO;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

}
