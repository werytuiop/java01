package org.java.print_scanner;

import java.util.Scanner;

/*
	<Scanner 클래스>
	- 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴
	- 키보드에 연결된 System.in에게 키를 읽게 하고 원하는 타입으로 변환하여 리턴
	- Scanner scn = new Scanner (System.in);
	- scn.next();       문자열 입력 -> String url = scn.next();  // 띄어쓰기 전까지만 받음
	- scn.nextInt();    정수 입력 -> int num1 = scn.nextInt();
	- scn.nextLine();   문자열 입력 (\n 포함)
 */

public class Scanner01 {

	public static void main(String[] args) {

		System.out.println("<Scanner 실습>");

		System.out.println("정수형 숫자를 입력하세요.");

		Scanner scn = new Scanner(System.in); // 콘솔에 입력
		// new : 객체 생성 연산자 (객체의 주소값 생성)

		System.out.println("첫번째 숫자 입력");
		int i1 = scn.nextInt(); // 정수형 data 입력
		System.out.println("첫번째 입력값: " + i1);

		System.out.println("두번째 숫자 입력");
		int i2 = scn.nextInt(); // 정수형 data 입력
		System.out.println("두번째 입력값: " + i2);

		System.out.println(i1 + "+" + i2 + "=" + (i1 + i2));

		System.out.println("연산자를 입력해보세요.");
		String str = scn.next(); // 문자열을 입력
		System.out.println("입력된 연산자: " + str);

		scn.close();

	}

}
