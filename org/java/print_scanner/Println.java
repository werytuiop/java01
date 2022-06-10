package org.java.print_scanner;

public class Println {

	public static void main(String[] args) {

		System.out.println(10 + 10); // 20
		System.out.println(10 + "10"); // 1010
		System.out.println(10 + 10 + "10"); // 2010
		System.out.println(10 + "10" + 10); // 101010
		System.out.println(10 + 10 + ""); // 20

		System.out.print("띄어쓰기 없음");
		System.out.printf("%d", 1000);

		System.out.println();

		int num1 = 10;
		int num2 = 10;

		System.out.println(num1 + "+" + num1 + "=" + (num1 + num2));

	}

}
