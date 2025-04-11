package com.itwillbs.persistence;

import com.itwillbs.domain.BoardVO;

/**
 *	 DB의 정보를 처리하는 객체
 *    => DB에서 수행해야하는 동작(메서드)을 정의 
 */
public interface BoardDAO {

	// 디비서버의 시간정보를 가져오기
	public String getServerTime();
	
	// 게시판에 글정보를 저장하는 동작(글쓰기)
	public void insertBoard(BoardVO vo) throws Exception;
	
	
}
