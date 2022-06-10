package org.java.operator;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {

		System.out.println("<대입연산자>");
		/*
			오른쪽의 연산의 결과를 왼쪽 변수에 대입
			연산의 마지막에 수행
		*/

		int num = 10;
		int sum = num + 200;

		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 정수입력: ");
		int num2 = scn.nextInt();
		System.out.println("두번째 정수입력: ");
		int num3 = scn.nextInt();

		System.out.println(num2 + num3);
		System.out.println(sum);
		
		scn.close();

	}

}
