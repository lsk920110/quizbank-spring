package com.quiz.bank.common.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;

import com.quiz.bank.common.exception.StandardException;

public enum ErrorCode {

	SUCCESS("0000","message.success"),
	
	PARAM_NOT_FOUND("0001","message.param.invalid_type");
	
	private final String code;
	private final String key;
	private static final Map<String, ErrorCode> map;

	static {
		map = new HashMap<String, ErrorCode>();
		for (ErrorCode v : ErrorCode.values()) {
			map.put(v.code, v);
		}
	}
	
	public static Map<String, ErrorCode> getErrorCodeMap() {
		return map;
	}

	public static ErrorCode findByCode(String i) {
		return map.get(i);
	}
	
//	public static ErrorCode findByException(Exception ex) {
//		if (ex instanceof StandardException) {
//			StandardException se = (StandardException) ex;
//			return ErrorCode.findByCode(se.getCode());
//		} else if (ex instanceof MethodArgumentNotValidException
//				|| ex instanceof BindException) {
//			return ErrorCode.PARAM_INVALID_TYPE;
//		} else {
//			return ErrorCode.ETC;
//		}
//	}

	private ErrorCode(String code, String key) {
		this.code = code;
		this.key = key;
	}

	public String getCode() {
		return code;
	}

	public String getKey() {
		return key;
	}

	@Override
	public String toString() {
		return code + ": " + key;
	}
}
