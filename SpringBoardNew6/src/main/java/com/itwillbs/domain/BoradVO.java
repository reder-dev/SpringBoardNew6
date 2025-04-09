package com.itwillbs.domain;

import java.sql.Timestamp;

/**
 * 
 * tbl_board
 *
 */

@Data
public class BoradVO {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private int viewcnt;
	private Timestamp regdate;
	
}
