package org.java.variable;

public class Var03 {

	public static void main(String[] args) {

		System.out.println("<����, ������ Ÿ��>");
		System.out.println("<< �ڹ��� �⺻ �ڷ���(primitive) >>");

		// ������
		byte b = 10; // ������ ������ 1byte�� ������ �� �ִ� ���� b�� �����ϰ� 10���� �ʱ�ȭ
		short s = 10;
		int i = 10;
		long l = 10l;

		// �Ǽ��� ������
		float f = 1.12345678999f; // 8���� �߸��� �ݿø�
		/* double�� 8����Ʈ, float�� 4����Ʈ�� floatŸ���� ���� f �Ⱥ��̸� ������ */
		double d = 1.12345678999;

		// ������ ������
		char ch = 'a';

		// ���� ������
		boolean bool = false;

		System.out.println("byte b = " + b);
		System.out.println("short s = " + s);
		System.out.println("int i = " + i);
		System.out.println("long l = " + l);
		System.out.println("float f = " + f);
		System.out.println("double d = " + d);
		System.out.println("char ch = " + ch);
		System.out.println("boolean bool = " + bool);

	}

}
