package org.java.condition;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		
		System.out.println("<if��>");
		System.out.println("<<������ �� ���� ��>>");

		// Scanner �̿��ؼ� ���� �Է¹ް� 100���� ũ�� �ֿܼ� "100���� ŭ" ���
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �Է�");
		int key = scn.nextInt();
		if (key > 100) {
			System.out.println("100���� ŭ");
		}

		// Scanner�� ���̵� �Է¹ް� ���̵� root�̸� "��ſ� ���� �Ǽ���~" ���
		System.out.println("���̵� �Է�");
		String userId = scn.next();
		if (userId.equals("root")) {
			System.out.println("��ſ� ���� �Ǽ���~");
		}
		
		scn.close();

	}

}
