package com.itwillbs.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.itwillbs.service.boardService;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//BoardService 객체 주입
	@Inject
	private boardService bService;
	
	
	// http://localhost:8088/board/time
	@RequestMapping(value="/time", method = RequestMethod.GET)
	public void getServerTimeGET() {
		logger.info(" DB서버의 시간정보를 가져오기 ");
		
		String time = bService.getServerTime();
		logger.info(" time : {}", time);
		
		model.addAttribute("time", time);
		logger.info(" 연결된 뷰페이지에 정보전달");
	}
	
	// http://localhost:8088/board/regist
	// 게시판 글쓰기 - GET
	@RequestMapping(value="/regist", method = RequestMethod.GET)
	public void registGET() throws Exception{
		logger.info(" registGET() 실행 ");
		logger.info(" 글쓰기 뷰페이지(/board/regist.jsp)를 연결해서 보여줌 ");
		
		
		
	}
	
	
	
	// 게시판 글쓰기 - POST
	
	
	
	

}// BoardController
