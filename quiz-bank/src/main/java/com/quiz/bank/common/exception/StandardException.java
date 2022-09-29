package com.quiz.bank.common.exception;

import java.util.Map;

import com.quiz.bank.common.error.ErrorCode;

public class StandardException extends RuntimeException{

	private ErrorCode ec;
	
	String code;
	String message;
	
	private Map<String,String> req_param;
	
	private String[] args;
	public StandardException() {
		ec = ErrorCode.ETC;
	}
	
	public StandardException(ErrorCode ec) {
		this.ec = ec;
	}
	
}
