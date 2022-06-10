package org.java.variable;

public class TypeCasting {

	public static void main(String[] args) {

		System.out.println("<형변환>");

		/*
		 	1. int형 아래 타입 연산시 자동으로 int형으로 형변환
		 	다시 원래 형으로 바꾸고 싶으면 강제 형변환 해야함
		 */

		byte b1 = 10;
		byte b2 = 20;
		/* byte + byte = int + int */

//		byte b_sum = b1+b2;  //에러
		byte b_sum = (byte) (b1 + b2);  // 강제형변환
		int i_sum = b1 + b2;  // 에러안남

		System.out.println("b_sum = " + b_sum);
		System.out.println("i_sum = " + i_sum);

		
		/* 2. 큰형 + 작은형 -> 큰형으로 자동 형변환 */

		int i = 10;
		double d = 1.1;
		/* int + double = double + double */

//		int i_sum2 = i+d;  //에러
		int i_sum2 = (int) (i + d);  // 강제형변환
		double d_sum = i + d;  // 에러안남
		int i_sum3 = i + (int) d;  // double 강제형변환한 뒤 연산

		System.out.println("i_sum2 = " + i_sum2);
		System.out.println("d_sum = " + d_sum);
		System.out.println("i_sum3 = " + i_sum3);

	}

}
