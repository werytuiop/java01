package org.java.inheritance;

public class Parent {

	public int num1;
	public int num2;
	protected int num3;

	public Parent() {
		System.out.println("Parent - �⺻ ������");
	}

	public Parent(int num2) {
		System.out.println("Parent - �ٸ� ������");
		this.num2 = num2;
	}

	public void parentMethod() {
		System.out.println("Parent Ŭ����");
	}

	public void parentMethod2() {
		System.out.println("Parent Ŭ���� 2");
	}

}
