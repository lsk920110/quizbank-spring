package com.quiz.bank.api.page;

import org.apache.catalina.connector.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    //메인페이지
    @GetMapping(value="/")
    public ModelAndView main() {
        ModelAndView mav = new ModelAndView("main");
        
        return mav;
    }
    
    
	//카테고리 등록 페이지로 이동
	@GetMapping(value="regist/category")
	public ModelAndView categoryRegistPage() {
		
		ModelAndView mav = new ModelAndView("regist/category");
		
		return mav;
	}
	
	//문제등록 페이지로 이동
	@GetMapping(value="regist/quiz")
	public ModelAndView quizregistPage() {
		
		ModelAndView mav = new ModelAndView("regist/quiz");
		
		return mav;
	}
	//문제등록 페이지
//	@GetMapping(value="quiz")
//	public ModelAndView quiz() {	
//	    ModelAndView mav = new ModelAndView("regist/quiz");
//	    return mav;
//	}
//	
	//문제풀기 위해 카테고리 선택페이지로 이동
	@GetMapping(value="solve/selectCategory")
	public ModelAndView quizSelect() {
	    ModelAndView mav = new ModelAndView("solve/selectCategory");
	    return mav;
	}

	
	//
	@GetMapping(value="solve/{category}/{no}")
	public ModelAndView quizSolve(@PathVariable String category, @PathVariable int no) {
		
		ModelAndView mav = new ModelAndView("solve/quiz");
		

		return mav;
	}
}
