package org.java.oop;

import java.util.Scanner;

public class Calculator1Main {

	public static void main(String[] args) {

		Calculator1 cal = new Calculator1();

		cal.add(200, 100);
		cal.sub(200, 100);
		cal.multi(200, 100);
		cal.div(200, 100);

		System.out.println();

		Scanner scn = new Scanner(System.in);

		System.out.println(">> 숫자1 입력");
		int num1 = scn.nextInt();
		System.out.println(">> 숫자2 입력");
		int num2 = scn.nextInt();

		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.multi(num1, num2);
		cal.div(num1, num2);

		scn.close();

	}

}
