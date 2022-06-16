package org.java.operator;

public class Operator10 {

	public static void main(String[] args) {

		System.out.println("<삼항연산자>");

		int i = 9;

		System.out.println(i > 10 ? true : false);

		boolean b = i > 10 ? true : false;
		System.out.println(b);

		String s = i > 10 ? "10보다 크다" : "10보다 작다";
		System.out.println(s);

		int in = i > 10 ? 1 : 0;
		System.out.println(in);

		double d = i > 10 ? 1.1 : 0.1;
		System.out.println(d);

		char ch = i > 10 ? 'a' : 'b';
		System.out.println(ch);

		/* 삼항연산자를 변수에 담을 때는 결과 값의 타입으로 지정 */

	}

}
