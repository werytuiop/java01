package org.java.array;

public class Array02 {

	public static void main(String[] args) {

		System.out.println("<배열>");
		System.out.println("<<Lotto 프로그램 -난수 생성>>");

		int[] lotto = new int[45];
		int lottoSize = lotto.length;
		for (int i = 0; i < lottoSize; i++) {
			lotto[i] = i + 1;
		}
		int box = 0;
		for (int i = 0; i < 100; i++) {
			int idx = (int) (Math.random() * 45);
			box = lotto[idx];
			lotto[idx] = lotto[0];
			lotto[0] = box;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
