package org.java.array;

public class Array03 {

	public static void main(String[] args) {

		System.out.println("<�迭>");
		System.out.println("<<char�� �迭>>");

		char[] ch = { 'a', 'b', 'c', 'd', 'e' };

		System.out.println("1) ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println("\n");

		// forEach��
		System.out.println("2) ");
		for (char ch1 : ch) {
			System.out.print(ch1 + " ");
		}
		System.out.println("\n");

		int[] arrInt = new int[10];
		for (int i : arrInt) {
			System.out.print(i + " ");
		}

	}

}
