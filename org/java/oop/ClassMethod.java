package org.java.oop;

public class ClassMethod {

	// �޼ҵ� ����1
	public void method1() {
		// �޼ҵ� ȣ��(call)�� ����Ǵ� �ڵ� ��
		System.out.println("��ȯ���� ���� �Է°��� ����.");
		return; // ��ȯ���� ����(��������)
	}

	// �޼ҵ� ����2
						// �������� (�Ű�����)
	public void method2(int num1, int num2) {
		int sum = num1 + num2; // ��������(�޼ҵ� �ȿ� ���� ����)
		System.out.println(num1 + "+" + num2 + "=" + sum);
		// return;
	}

	// �޼ҵ� ����3
	// ��ȯŸ��
	public int method3() {
		int sum = 10 + 200;
		return sum;
	}

	// �޼ҵ� ����4
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	// Ŭ���� �޼ҵ�
	public static void staticMethod() {
		System.out.println("Ŭ���� �޼ҵ�");
	}

	public static void staticMethod2(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}
