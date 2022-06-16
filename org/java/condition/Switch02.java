package org.java.condition;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		System.out.println("<switch문>");

		System.out.println("알파벳을 입력하세요.");
		Scanner scn = new Scanner(System.in);
		String ch = scn.nextLine();

		switch (ch) {
		case "A":
		case "a":
			System.out.println("A입니다.");
			break;
		case "B":
		case "b":
			System.out.println("B입니다.");
			break;
		case "C":
		case "c":
			System.out.println("C입니다.");
			break;
		default:
			System.out.println("A,B,C이외의 알파벳입니다.");
		}

		scn.close();

	}

}
