package org.java.condition;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {

		System.out.println("<switch문>");

		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력");
		int num1 = scn.nextInt();
		System.out.println("두 번째 정수 입력");
		int num2 = scn.nextInt();
		System.out.println("연산 기호 입력 (+-*/)");
		String op = scn.next();

		switch (op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
			break;
		default:
			System.out.println("연산자 입력 오류");
		}

		scn.close();

	}

}
