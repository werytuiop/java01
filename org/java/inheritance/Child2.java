package org.java.inheritance;

public class Child2 extends Parent {

	public int num4;

	public Child2() {
		super(200); // 부모의 다른생성자를 생성
	}

	@Override
	public void parentMethod() {
		System.out.println("Child2 클래스");
	}

}
