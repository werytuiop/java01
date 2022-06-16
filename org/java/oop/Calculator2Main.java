package org.java.oop;

import java.util.Scanner;

public class Calculator2Main {

	public static void main(String[] args) {

		Calculator2 cal = new Calculator2();

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println(">> num1 �Է�");
			int num1 = scn.nextInt();
			cal.setNum1(num1);

			System.out.println(">> num2 �Է�");
			int num2 = scn.nextInt();
			cal.setNum2(num2);

			System.out.println(">> ������ �Է� (+ - * /)");
			String op = scn.next();

			if (op.equals("+")) {
				cal.add();
			} else if (op.equals("-")) {
				cal.sub();
			} else if (op.equals("*")) {
				cal.multi();
				System.out.println(cal.getNum1() + "*" + cal.getNum2() + "=" + (cal.getNum1() * cal.getNum2()));
			} else if (op.equals("/")) {
				cal.div();
				System.out.println(cal.getNum1() + "/" + cal.getNum2() + "=" + (cal.getNum1() / cal.getNum2()));
			} else if (op.equals("z")) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}

		}

		scn.close();

//		cal.add();
//		cal.sub();
//		cal.multi();
//		cal.div();

	}

}
