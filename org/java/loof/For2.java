package org.java.loof;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		System.out.println("<for��>");
		System.out.println("<<������ �Է�>>");
		Scanner scn = new Scanner(System.in);

		System.out.println("���� �� �Է�");
		int startNum = scn.nextInt();
		System.out.println("�� �� �Է�");
		int endNum = scn.nextInt();

		System.out.println(startNum + "�� ~ " + endNum + "��\n");
		if (startNum <= endNum) {
			for (int i = startNum; i < endNum + 1; i++) {
				System.out.println(i + "���Դϴ�.");
				// i�� ��� (�ݺ�)
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				System.out.println();
			}
		}

		scn.close();

	}

}
