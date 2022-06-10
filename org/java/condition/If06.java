package org.java.condition;

import java.util.Scanner;

public class If06 {

	public static void main(String[] args) {

		System.out.println("<if문>");
		System.out.println("<<다중if문>>");

		/*
			grade가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 60 미만이면 F
			-- 95이상 A+, 95미만 90이상 A, ...
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int grade = scn.nextInt();
		
		if (grade >= 90) {
			if (grade >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A-");
			}
		} else if (grade >= 80) {
			if (grade >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B-");
			}
		} else if (grade >= 70) {
			if (grade >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C-");
			}
		} else if (grade >= 60) {
			if (grade >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D-");
			}
		} else {
			System.out.println("F");
		}
		
		scn.close();

	}

}
