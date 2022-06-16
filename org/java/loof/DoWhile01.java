package org.java.loof;

public class DoWhile01 {

	public static void main(String[] args) {

		System.out.println("<do~while문>");
		System.out.println("<<구구단 출력>>");

		int i = 2;
		do {
			System.out.println(i + "단입니다.");

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
