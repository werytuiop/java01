package org.java.condition;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {

		System.out.println("<if��>");
		System.out.println("<<������ ���� ���� ��>>");

		/*
			grade�� 90 �̻��̸� A, 80 �̻��̸� B, 70 �̻��̸� C, 60 �̻��̸� D, 60 �̸��̸� F
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
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
