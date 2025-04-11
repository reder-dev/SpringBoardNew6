package com.itwillbs.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.BoardVO;

/**
 *  BoardDAO 인터페이스 객체를 구현한 객체
 *   => 실제 처리되는 동작을 구현하는 객체 
 */
@Repository
public class BoardDAOImpl implements BoardDAO{
	
	

	private static final Logger logger = LoggerFactory.getLogger(BoardDAOImpl.class);

	// SqlSession 객체를 주입
	@Inject
	private SqlSession sqlSession;
	
	//boardMapper.xml 접근 이름
	private static final String NAMESPACE
	       ="com.itwillbs.mapper.BoardMapper.";
	
	@Override
	public String getServerTime() {
		// 디비연결
		// 해당 SQL구문 호출
		String time 
		  = sqlSession.selectOne(NAMESPACE + "getServerTime");
		
		return time;
	}

	@Override
	public void insertBoard(BoardVO vo) throws Exception {
		logger.info("insertBoard(BoardVO vo) 실행 ");
		logger.info(" 전달받은 정보를 사용해서 SQL구문 실행 (mapper 실행) ");
		
		// 디비 연결 객체를 사용해서 필요한 SQL구문 실행
		// com.itwillbs.mapper.BoardMapper.insert
		sqlSession.insert(NAMESPACE + "insertBoard", vo);
		
		logger.info(" mapper 실행 완료! => 결과를 서비스로 전달 ");
		
		
	}
	
	
	
	
}
