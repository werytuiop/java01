package org.java.variable;

import java.util.Scanner;

public class VarTest_0608 {

	/*
	 	������(����)�� �Է��ؼ� ���� ���̸� ���ϼ���
	 	����� �ֿܼ� ���
	 	������ PI=3.14 (final ���)
	 	������ radius
	 	���� ���� = ������*������*PI Scanner, nextInt �̿�
	 */

	public static void main(String[] args) {

		final double PI = 3.14;

		Scanner scn = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���.");
		int radius = scn.nextInt();

		double d_area = radius * radius * PI; // �Ҽ��� �Ʒ� ����
		int i_area = (int) (radius * radius * PI); // �Ҽ��� �Ʒ� �ȳ��� (�� �ս�)

		System.out.println("�������� " + radius + "�� �� ���� ����: (double) " + d_area);
		System.out.println("�������� " + radius + "�� �� ���� ����: (int) " + i_area);
		
		scn.close();

	}

}
