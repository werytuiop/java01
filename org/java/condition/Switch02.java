package org.java.condition;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		System.out.println("<switch��>");

		System.out.println("���ĺ��� �Է��ϼ���.");
		Scanner scn = new Scanner(System.in);
		String ch = scn.nextLine();

		switch (ch) {
		case "A":
		case "a":
			System.out.println("A�Դϴ�.");
			break;
		case "B":
		case "b":
			System.out.println("B�Դϴ�.");
			break;
		case "C":
		case "c":
			System.out.println("C�Դϴ�.");
			break;
		default:
			System.out.println("A,B,C�̿��� ���ĺ��Դϴ�.");
		}

		scn.close();

	}

}
