package org.java.oop;

public class Overloading {

	// 선언부
	public void method() {
		// 구현부
		System.out.println("메소드");
	}

	/* 메소드 반환타입 다름 -> 불가능 */
//	public int method() {
//		return 0;
//	}

	/* 메소드 이름/반환타입 같음. 매개변수 개수/타입 다름 -> 가능 */
	public void method(int num1) {
		System.out.println(num1);
	}

	/* 메소드 이름/반환타입 같음. 매개변수 개수/타입 다름 -> 가능 */
	public void method(int num1, String name) {
		System.out.println(name + num1);
	}

	/* 매개 변수 이름이 달라도 매개 변수 타입이 같으므로 -> 불가능 */
//	public void method(int num2, String name) {
//		System.out.println(name + num1);
//	}

	/* 매개 변수 개수/타입 같지만 순서 다름 -> 가능 */
	public void method(String name, int num1) {
		System.out.println(name + num1);
	}

}
