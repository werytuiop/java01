package org.java.constructor;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("����1 �Է�");
		int num1 = scn.nextInt();
		System.out.println("����2 �Է�");
		int num2 = scn.nextInt();
		System.out.println("������ �Է�");
		String op = scn.next();

		// �⺻ ������ - setter�� �ʱ�ȭ
		Calculator cal1 = new Calculator();
		cal1.setNum1(num1);
		cal1.setNum2(num2);
		cal1.setOp(op);
		cal1.cal();

		// �ٸ� ������ - ������ ���ÿ� �ʱ�ȭ
		Calculator cal2 = new Calculator(num1, num2, op);
		cal2.cal();

		scn.close();

	}

}
