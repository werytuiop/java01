package org.java.oop;

public class Overloading {

	// �����
	public void method() {
		// ������
		System.out.println("�޼ҵ�");
	}

	/* �޼ҵ� ��ȯŸ�� �ٸ� -> �Ұ��� */
//	public int method() {
//		return 0;
//	}

	/* �޼ҵ� �̸�/��ȯŸ�� ����. �Ű����� ����/Ÿ�� �ٸ� -> ���� */
	public void method(int num1) {
		System.out.println(num1);
	}

	/* �޼ҵ� �̸�/��ȯŸ�� ����. �Ű����� ����/Ÿ�� �ٸ� -> ���� */
	public void method(int num1, String name) {
		System.out.println(name + num1);
	}

	/* �Ű� ���� �̸��� �޶� �Ű� ���� Ÿ���� �����Ƿ� -> �Ұ��� */
//	public void method(int num2, String name) {
//		System.out.println(name + num1);
//	}

	/* �Ű� ���� ����/Ÿ�� ������ ���� �ٸ� -> ���� */
	public void method(String name, int num1) {
		System.out.println(name + num1);
	}

}
