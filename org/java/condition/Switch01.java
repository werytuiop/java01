package org.java.condition;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		System.out.println("<switch문>");

		System.out.println("권한을 입력하세요.");
		Scanner scn = new Scanner(System.in);
		int key = scn.nextInt();

		switch (key) {
		case 1:
			System.out.println("최고 관리자입니다.");
			break;
		case 2:
			System.out.println("중간 관리자입니다.");
			break;
		case 3:
			System.out.println("일반 사원입니다.");
			break;
		case 4:
			System.out.println("신입 사원입니다.");
			break;
		default:
			System.out.println("권한이 없습니다.");
		}

		scn.close();

	}

}
