package org.java.condition;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {

		/*
			Scanner �̿��ؼ� ���̵�, ��й�ȣ �Է¹��� ('root', '1111')
			���̵�� ��й�ȣ ������ "��ſ� ���εǼ���~", �ϳ��� Ʋ���� "ȸ���� �ƴմϴ�" ���
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("���̵� �Է�");
		String userId = scn.nextLine();
		System.out.println("��й�ȣ �Է�");
		String userPw = scn.nextLine();

		if (userId.equals("root") && userPw.equals("1111")) {
			System.out.println("��ſ� ���εǼ���~");
		} else {
			System.out.println("ȸ���� �ƴմϴ�");
		}

		if (userId.equals("root") || userPw.equals("1111")) {
			System.out.println("��ſ� ���εǼ���~");
		} else {
			System.out.println("ȸ���� �ƴմϴ�");
		}
		
		scn.close();

	}

}
