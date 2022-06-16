package org.java.condition;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {

		/*
			Scanner 이용해서 아이디, 비밀번호 입력받음 ('root', '1111')
			아이디와 비밀번호 맞으면 "즐거운 쇼핑되세요~", 하나라도 틀리면 "회원이 아닙니다" 출력
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("아이디 입력");
		String userId = scn.nextLine();
		System.out.println("비밀번호 입력");
		String userPw = scn.nextLine();

		if (userId.equals("root") && userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑되세요~");
		} else {
			System.out.println("회원이 아닙니다");
		}

		if (userId.equals("root") || userPw.equals("1111")) {
			System.out.println("즐거운 쇼핑되세요~");
		} else {
			System.out.println("회원이 아닙니다");
		}
		
		scn.close();

	}

}
