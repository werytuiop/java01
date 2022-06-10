package org.java.condition;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		
		System.out.println("<if문>");
		System.out.println("<<조건이 한 개일 때>>");

		// Scanner 이용해서 정수 입력받고 100보다 크면 콘솔에 "100보다 큼" 출력
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 입력");
		int key = scn.nextInt();
		if (key > 100) {
			System.out.println("100보다 큼");
		}

		// Scanner로 아이디를 입력받고 아이디가 root이면 "즐거운 쇼핑 되세요~" 출력
		System.out.println("아이디 입력");
		String userId = scn.next();
		if (userId.equals("root")) {
			System.out.println("즐거운 쇼핑 되세요~");
		}
		
		scn.close();

	}

}
