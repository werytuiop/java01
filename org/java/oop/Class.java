package org.java.oop;

public class Class {

	public int num1;
	public int num2;
	private String key;
	public static final String PROJECTNAME = "JAVAPROJECT";

	public void instanceMethod() {
		System.out.println("return이 없는 인스턴스 메소드");
	}

	public int instanceMethod2() {
		System.out.println("return값이 int인 인스턴스 메소드");
		return this.num1 + this.num2;
	}

	public static void classMethod() {
		System.out.println("클래스 메소드");
	}

	// setters
	public void setKey(String key) {
		this.key = key;
	}

	// getters
	public String getKey() {
		return this.key;
	}

}
