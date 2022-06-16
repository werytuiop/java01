package org.java.operator;

public class Operator02 {

	public static void main(String[] args) {

		System.out.println("<비교연산자>");
		/*
			왼쪽이 기준
			결과는 true/false
			조건문과 많이 사용
		*/

		int num1 = 10;
		int num2 = 5;

		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

		
		System.out.println("<String(객체) 비교>");
		/*
			객체==객체 : 주소값을 비교
			객체.equal(객체) : 대상의 내용을 비교
		*/

		String str1 = new String();
		String str2 = new String();
		str1 = "java";
		str2 = "java";
		String str3 = "java";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));

	}

}
