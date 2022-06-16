package org.java.constructor;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("숫자1 입력");
		int num1 = scn.nextInt();
		System.out.println("숫자2 입력");
		int num2 = scn.nextInt();
		System.out.println("연산자 입력");
		String op = scn.next();

		// 기본 생성자 - setter로 초기화
		Calculator cal1 = new Calculator();
		cal1.setNum1(num1);
		cal1.setNum2(num2);
		cal1.setOp(op);
		cal1.cal();

		// 다른 생성자 - 생성과 동시에 초기화
		Calculator cal2 = new Calculator(num1, num2, op);
		cal2.cal();

		scn.close();

	}

}
