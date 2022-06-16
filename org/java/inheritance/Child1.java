package org.java.inheritance;

public class Child1 extends Parent {

	public int num4;

	public Child1() {
		super(); // 부모의 기본생성자를 생성 (자동)
	}

	public Child1(int num1) {
		super(num1); // 부모의 다른생성자를 생성
	}

	@Override
	public void parentMethod() {
		System.out.println("Child1 클래스");
	}

	@Override
	public void parentMethod2() {
		super.parentMethod2();
		System.out.println("Child1 클래스 2");
	}

}
