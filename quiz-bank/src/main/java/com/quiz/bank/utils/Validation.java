package com.quiz.bank.utils;

public class Validation {

	public static void notNull(Object object) throws Exception {
		
		if (null == object) {
			//throw new Exception();
			throw new Exception();			
		}
		
		if (object instanceof String) {
			String value = (String) object;
			if (value.isEmpty()) {
				throw new Exception();
			}
		}
		
	}
	

	
}
