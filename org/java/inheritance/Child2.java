package org.java.inheritance;

public class Child2 extends Parent {

	public int num4;

	public Child2() {
		super(200); // �θ��� �ٸ������ڸ� ����
	}

	@Override
	public void parentMethod() {
		System.out.println("Child2 Ŭ����");
	}

}
