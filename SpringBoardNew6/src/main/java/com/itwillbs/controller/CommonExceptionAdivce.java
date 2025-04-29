package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * AOP 개념 사용
 * 보조 기능을 구현
 * 
 *  => 공통의 예외를 처리하는 객체
 */


//@ControllerAdvice
// => 컨트롤러에서 발생한 예외(보조기능)를 처리하는 객체 선언


@ControllerAdvice
public class CommonExceptionAdivce {
	
	

	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdivce.class);
	
	//@ExceptionHandler(예외처리 객체)
	@ExceptionHandler(Exception.class)
	public String common(Model model, Exception e) {
		
		logger.info(" CommonExceptionAdivce_common 샐행");
		logger.info(" 예외 발생!!!");
		
		logger.info(""+ e.toString());
		
		model.addAttribute("e", e);
		
		//ModelAndView 객체 사용해서 전달
		//ModelAndView mav = new ModelAndView();
		//mav.setView(viewName);
		//mav.addObject(attributeValue);
		
		return "ITWILL";
	}
	
	//@ExceptionHandler(Exception.class)
	public String common2() {
		
		logger.info(" CommonExceptionAdivce_common2 샐행");
		logger.info(" NumberFormatExcetion 예외 발생 1!!ㅣㅣ ");
		
		return "ITWILL";
	}
	
	

}
