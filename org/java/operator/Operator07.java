package org.java.operator;

public class Operator07 {

	public static void main(String[] args) {

		System.out.println("<XOR연산자>");
		/* 서로 다르면 true */

		int num1 = 10;
		int num2 = 20;

		boolean result1 = num1 == 10 ^ num2 == 20;
		boolean result2 = num1 == 20 ^ num2 == 20;
		boolean result3 = num1 == 10 ^ num2 == 30;
		boolean result4 = num1 == 20 ^ num2 == 30;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
