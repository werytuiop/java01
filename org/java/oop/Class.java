package org.java.oop;

public class Class {

	public int num1;
	public int num2;
	private String key;
	public static final String PROJECTNAME = "JAVAPROJECT";

	public void instanceMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �޼ҵ�");
	}

	public int instanceMethod2() {
		System.out.println("return���� int�� �ν��Ͻ� �޼ҵ�");
		return this.num1 + this.num2;
	}

	public static void classMethod() {
		System.out.println("Ŭ���� �޼ҵ�");
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
