package org.java.oop;

import java.util.Date;

public class BoardMain {

	public static void main(String[] args) {

		BoardDto boardDto = new BoardDto();

		boardDto.setNo(1);
		boardDto.setTitle("제목");
		boardDto.setMemo("내용");
		boardDto.setDay(new Date());

		System.out.println(boardDto.toString());

	}

}
