package org.java.variable;

// Ŭ���� VarSub
public class VarSub {

	/* ���: �ʵ�, �޼ҵ�, ������ */

	// �ʵ�
	public int num1; // �ν��Ͻ� ��� (����)
	public static int num2; // Ŭ���� ��� (����)
	public int num3;

	public void sum() {
		System.out.println(num1 + num2);
	}

	// �ν��Ͻ� �޼ҵ� method
	public void method(int num1, int num2) { //

		// �������� (�޼ҵ�) num1, num2, num3
		int num3 = num1 + num2;
		System.out.println(num3);

	}

}
