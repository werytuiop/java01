package org.java.operator;

public class Operator02 {

	public static void main(String[] args) {

		System.out.println("<�񱳿�����>");
		/*
			������ ����
			����� true/false
			���ǹ��� ���� ���
		*/

		int num1 = 10;
		int num2 = 5;

		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

		
		System.out.println("<String(��ü) ��>");
		/*
			��ü==��ü : �ּҰ��� ��
			��ü.equal(��ü) : ����� ������ ��
		*/

		String str1 = new String();
		String str2 = new String();
		str1 = "java";
		str2 = "java";
		String str3 = "java";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

	}

}
