package org.java.variable;

public class Var03 {

	public static void main(String[] args) {

		System.out.println("<변수, 데이터 타입>");
		System.out.println("<< 자바의 기본 자료형(primitive) >>");

		// 정수형
		byte b = 10; // 정수형 데이터 1byte를 저장할 수 있는 변수 b를 선언하고 10으로 초기화
		short s = 10;
		int i = 10;
		long l = 10l;

		// 실수형 데이터
		float f = 1.12345678999f; // 8부터 잘리고 반올림
		/* double은 8바이트, float는 4바이트라 float타입의 수에 f 안붙이면 에러남 */
		double d = 1.12345678999;

		// 문자형 데이터
		char ch = 'a';

		// 논리형 데이터
		boolean bool = false;

		System.out.println("byte b = " + b);
		System.out.println("short s = " + s);
		System.out.println("int i = " + i);
		System.out.println("long l = " + l);
		System.out.println("float f = " + f);
		System.out.println("double d = " + d);
		System.out.println("char ch = " + ch);
		System.out.println("boolean bool = " + bool);

	}

}
