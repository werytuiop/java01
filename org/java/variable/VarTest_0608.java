package org.java.variable;

import java.util.Scanner;

public class VarTest_0608 {

	/*
	 	반지름(정수)을 입력해서 원의 넓이를 구하세요
	 	결과값 콘솔에 출력
	 	원주율 PI=3.14 (final 상수)
	 	반지름 radius
	 	원의 넓이 = 반지름*반지름*PI Scanner, nextInt 이용
	 */

	public static void main(String[] args) {

		final double PI = 3.14;

		Scanner scn = new Scanner(System.in);
		System.out.println("반지름을 입력하세요.");
		int radius = scn.nextInt();

		double d_area = radius * radius * PI; // 소수점 아래 나옴
		int i_area = (int) (radius * radius * PI); // 소수점 아래 안나옴 (값 손실)

		System.out.println("반지름이 " + radius + "일 때 원의 넓이: (double) " + d_area);
		System.out.println("반지름이 " + radius + "일 때 원의 넓이: (int) " + i_area);
		
		scn.close();

	}

}
