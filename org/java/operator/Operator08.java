package org.java.operator;

public class Operator08 {

	public static void main(String[] args) {

		System.out.println("<비트연산자>");
		/*
			& : 1,1 일 때만 1
			| : 1이 하나라도 있으면 1
		*/

		System.out.println("<< & >>");
		System.out.println(10 & 12);
		System.out.println(20 & 30);

		System.out.println("<< | >>");
		System.out.println(10 | 12);
		System.out.println(20 | 30);

		System.out.println("<< ~ >>");
		System.out.println(~10);

		
		System.out.println("<시프트연산자>");
		/*
			10 ~ 1010
			오른쪽시프트연산자 : 작아진다. 소수점 아래 숫자 삭제
			10 >>2 --> 10.10
			왼쪽시프트연산자 : 커진다. 빈 공간은 0으로 채워짐
			10 <<2 --> 101000.
		*/
		
		int i = 10;
		
		System.out.println(i + ", " + Integer.toBinaryString(i));  // i와 2진수
		System.out.println((i>>2) + ", " + Integer.toBinaryString(i>>2));  // i에 오른쪽시프트연산자 적용
		System.out.println((i<<2) + ", " + Integer.toBinaryString(i<<2));  // i에 왼쪽시프트연산자 적용
		/* integer(10진수를) .toBinaryString(2진수 문자로 바꿔준다) */
		
		
		
		
		
		
		
		
	}

}
