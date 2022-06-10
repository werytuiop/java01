package org.java.condition;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		
		/*
			국어,영어,수학 (0~100점) / 총점(정수) / 평균 (double)
			95이상 A+, 90이상 A, ... 60미만 F
		*/
		Scanner scn = new Scanner (System.in);
		System.out.println("국어 점수 입력");
		int g1 = scn.nextInt();
		System.out.println("영어 점수 입력");
		int g2 = scn.nextInt();
		System.out.println("수학 점수 입력");
		int g3 = scn.nextInt();
		
		int sum = g1 + g2 + g3;
		double avg = sum/3;
		System.out.println("총점 : " + sum + " / 평균 : " + avg);
		
		System.out.print("학점 : ");
		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A-");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B-");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C-");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
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
