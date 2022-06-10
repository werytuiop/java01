package org.java.condition;

public class If03 {

	public static void main(String[] args) {

		System.out.println("<if문>");
		System.out.println("<<조건이 두 개일 때>>"); // 삼항 연산자

		int num1 = 10;
		int num2 = 20;

		if (num1 > 10) {
			System.out.println("10보다 큼");
		} else {
			System.out.println("10보다 작거나 같음");
		}

		if (num1 >= 10 && num2 <= 20) {
			System.out.println("조건을 만족합니다");
		} else {
			System.out.println("조건을 충족하지 못했습니다");
		}

	}

}
