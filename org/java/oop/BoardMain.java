package org.java.oop;

import java.util.Date;

public class BoardMain {

	public static void main(String[] args) {

		BoardDto boardDto = new BoardDto();

		boardDto.setNo(1);
		boardDto.setTitle("����");
		boardDto.setMemo("����");
		boardDto.setDay(new Date());

		System.out.println(boardDto.toString());

	}

}
