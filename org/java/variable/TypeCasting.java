package org.java.variable;

public class TypeCasting {

	public static void main(String[] args) {

		System.out.println("<����ȯ>");

		/*
		 	1. int�� �Ʒ� Ÿ�� ����� �ڵ����� int������ ����ȯ
		 	�ٽ� ���� ������ �ٲٰ� ������ ���� ����ȯ �ؾ���
		 */

		byte b1 = 10;
		byte b2 = 20;
		/* byte + byte = int + int */

//		byte b_sum = b1+b2;  //����
		byte b_sum = (byte) (b1 + b2);  // ��������ȯ
		int i_sum = b1 + b2;  // �����ȳ�

		System.out.println("b_sum = " + b_sum);
		System.out.println("i_sum = " + i_sum);

		
		/* 2. ū�� + ������ -> ū������ �ڵ� ����ȯ */

		int i = 10;
		double d = 1.1;
		/* int + double = double + double */

//		int i_sum2 = i+d;  //����
		int i_sum2 = (int) (i + d);  // ��������ȯ
		double d_sum = i + d;  // �����ȳ�
		int i_sum3 = i + (int) d;  // double ��������ȯ�� �� ����

		System.out.println("i_sum2 = " + i_sum2);
		System.out.println("d_sum = " + d_sum);
		System.out.println("i_sum3 = " + i_sum3);

	}

}
