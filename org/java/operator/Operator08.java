package org.java.operator;

public class Operator08 {

	public static void main(String[] args) {

		System.out.println("<��Ʈ������>");
		/*
			& : 1,1 �� ���� 1
			| : 1�� �ϳ��� ������ 1
		*/

		System.out.println("<< & >>");
		System.out.println(10 & 12);
		System.out.println(20 & 30);

		System.out.println("<< | >>");
		System.out.println(10 | 12);
		System.out.println(20 | 30);

		System.out.println("<< ~ >>");
		System.out.println(~10);

		
		System.out.println("<����Ʈ������>");
		/*
			10 ~ 1010
			�����ʽ���Ʈ������ : �۾�����. �Ҽ��� �Ʒ� ���� ����
			10 >>2 --> 10.10
			���ʽ���Ʈ������ : Ŀ����. �� ������ 0���� ä����
			10 <<2 --> 101000.
		*/
		
		int i = 10;
		
		System.out.println(i + ", " + Integer.toBinaryString(i));  // i�� 2����
		System.out.println((i>>2) + ", " + Integer.toBinaryString(i>>2));  // i�� �����ʽ���Ʈ������ ����
		System.out.println((i<<2) + ", " + Integer.toBinaryString(i<<2));  // i�� ���ʽ���Ʈ������ ����
		/* integer(10������) .toBinaryString(2���� ���ڷ� �ٲ��ش�) */
		
		
		
		
		
		
		
		
	}

}
