package org.java.condition;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {

		System.out.println("<if문>");
		System.out.println("<<조건이 여러 개일 때>>");

		/*
			grade가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 60 미만이면 F
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int grade = scn.nextInt();
		
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		scn.close();

	}

}
