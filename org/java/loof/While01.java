package org.java.loof;

public class While01 {

	public static void main(String[] args) {

		System.out.println("<while��>");
		System.out.println("<<������ ���>>");

		int i = 2;
		while (i < 10) {
			System.out.println(i + "���Դϴ�");

			int j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}

		}

	}

}
