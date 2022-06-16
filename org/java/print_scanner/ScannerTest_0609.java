package org.java.print_scanner;
import java.util.Scanner;

public class ScannerTest_0609 {

	/*
		1) 국어, 영어, 수학 점수를 입력하여 총점, 평균을 콘솔에 출력
		2) 입력값은 정수. 총점과 평균은 적절한 타입으로 설정 Scanner
		클래스 이용
	*/
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요.");
		int g1 = scn.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int g2 = scn.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int g3 = scn.nextInt();

		int sum = g1 + g2 + g3;
		double avg = (double) sum / 3;

		System.out.println("총점 : " + sum + " 점");
		System.out.println("평균 : " + avg + " 점");

		scn.close();

	}

}
