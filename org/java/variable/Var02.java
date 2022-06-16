package org.java.variable;

public class Var02 {

	public static void main(String[] args) {

		System.out.println("<상수>");

		// 리터럴 상수
		int i = 100;
		char ch = 'a';

		// final 상수
		final int STARTNUMBER = 0;
		final int ENDNUMBER = 0;
		// STARTNUMBER=100; // 에러남 (final상수는 재정의 불가능)

		System.out.println("int i = " + i);
		System.out.println("char ch = " + ch);
		System.out.println("final int STARTNUMBER = " + STARTNUMBER);
		System.out.println("final int ENDNUMBER = " + ENDNUMBER);

	}

}
