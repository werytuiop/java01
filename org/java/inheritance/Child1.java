package org.java.inheritance;

public class Child1 extends Parent {

	public int num4;

	public Child1() {
		super(); // �θ��� �⺻�����ڸ� ���� (�ڵ�)
	}

	public Child1(int num1) {
		super(num1); // �θ��� �ٸ������ڸ� ����
	}

	@Override
	public void parentMethod() {
		System.out.println("Child1 Ŭ����");
	}

	@Override
	public void parentMethod2() {
		super.parentMethod2();
		System.out.println("Child1 Ŭ���� 2");
	}

}
