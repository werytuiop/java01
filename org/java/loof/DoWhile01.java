package org.java.loof;

public class DoWhile01 {

	public static void main(String[] args) {

		System.out.println("<do~while��>");
		System.out.println("<<������ ���>>");

		int i = 2;
		do {
			System.out.println(i + "���Դϴ�.");

			int j = 1;
			do {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			} while (j < 10);
			System.out.println();

			i++;
		} while (i < 10);

	}

}
