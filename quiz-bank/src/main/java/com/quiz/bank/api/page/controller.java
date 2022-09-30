package com.quiz.bank.api.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

	
	@GetMapping(value="category")
	public ModelAndView categoryRegistPage() {
		
		ModelAndView mav = new ModelAndView("registQuiz");
		
		return mav;
	}
	
	@GetMapping(value="quizregist")
	public ModelAndView quizregistPage() {
		
		ModelAndView mav = new ModelAndView("quizregist");
		
		return mav;
	}
	
	@GetMapping(value="quiz")
	public ModelAndView quiz() {
		
		ModelAndView mav = new ModelAndView("quiz");
		
		return mav;
	}
}
