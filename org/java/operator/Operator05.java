package org.java.operator;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {

		System.out.println("<���Կ�����>");
		/*
			�������� ������ ����� ���� ������ ����
			������ �������� ����
		*/

		int num = 10;
		int sum = num + 200;

		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° �����Է�: ");
		int num2 = scn.nextInt();
		System.out.println("�ι�° �����Է�: ");
		int num3 = scn.nextInt();

		System.out.println(num2 + num3);
		System.out.println(sum);
		
		scn.close();

	}

}
