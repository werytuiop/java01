package org.java.oop;

public class ClassMethod {

	// 메소드 유형1
	public void method1() {
		// 메소드 호출(call)시 실행되는 코드 블럭
		System.out.println("반환값이 없고 입력값이 없다.");
		return; // 반환값이 없다(생략가능)
	}

	// 메소드 유형2
						// 지역변수 (매개인자)
	public void method2(int num1, int num2) {
		int sum = num1 + num2; // 지역변수(메소드 안에 선언 변수)
		System.out.println(num1 + "+" + num2 + "=" + sum);
		// return;
	}

	// 메소드 유형3
	// 반환타입
	public int method3() {
		int sum = 10 + 200;
		return sum;
	}

	// 메소드 유형4
	public int method4(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	// 클래스 메소드
	public static void staticMethod() {
		System.out.println("클래스 메소드");
	}

	public static void staticMethod2(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}
