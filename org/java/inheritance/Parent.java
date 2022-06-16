package org.java.inheritance;

public class Parent {

	public int num1;
	public int num2;
	protected int num3;

	public Parent() {
		System.out.println("Parent - 기본 생성자");
	}

	public Parent(int num2) {
		System.out.println("Parent - 다른 생성자");
		this.num2 = num2;
	}

	public void parentMethod() {
		System.out.println("Parent 클래스");
	}

	public void parentMethod2() {
		System.out.println("Parent 클래스 2");
	}

}
