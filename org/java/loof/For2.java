package org.java.loof;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {

		System.out.println("<for문>");
		System.out.println("<<구구단 입력>>");
		Scanner scn = new Scanner(System.in);

		System.out.println("시작 단 입력");
		int startNum = scn.nextInt();
		System.out.println("끝 단 입력");
		int endNum = scn.nextInt();

		System.out.println(startNum + "단 ~ " + endNum + "단\n");
		if (startNum <= endNum) {
			for (int i = startNum; i < endNum + 1; i++) {
				System.out.println(i + "단입니다.");
				// i단 출력 (반복)
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
				System.out.println();
			}
		}

		scn.close();

	}

}
