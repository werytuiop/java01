package org.java.condition;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		
		/*
			����,����,���� (0~100��) / ����(����) / ��� (double)
			95�̻� A+, 90�̻� A, ... 60�̸� F
		*/
		Scanner scn = new Scanner (System.in);
		System.out.println("���� ���� �Է�");
		int g1 = scn.nextInt();
		System.out.println("���� ���� �Է�");
		int g2 = scn.nextInt();
		System.out.println("���� ���� �Է�");
		int g3 = scn.nextInt();
		
		int sum = g1 + g2 + g3;
		double avg = sum/3;
		System.out.println("���� : " + sum + " / ��� : " + avg);
		
		System.out.print("���� : ");
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
