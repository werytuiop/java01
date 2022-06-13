package org.java.array;

public class Array06 {

	public static void main(String[] args) {

		System.out.println("<배열>");
		System.out.println("<<다차원 배열>>");

		int[][] score = {
				{ 100, 66, 77 },
				{ 88, 66, 88 },
				{ 80, 46, 97 },
				{ 70, 88, 80 },
				{ 100, 90, 88 }
		};
		int kor = 0;
		int math = 0;
		int eng = 0;
		double avg = 0.0;
		int num = 0;
		int totalSum = 0;

		System.out.println("==중간고사 성적표==");
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균");
		System.out.println("==============================================");

		for (int i = 0; i < score.length; i++) {

			int sum = 0;
			kor += score[i][0]; // score 배열의 0번지 합계 (국어)
			math += score[i][1]; // score 배열의 1번지 합계 (수학)
			eng += score[i][2]; // score 배열의 2번지 합계 (영어)

			System.out.print(" " + ++num + "\t"); // 번호

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j]; // 총점
				totalSum += score[i][j];
			}
			avg = Math.round((double) sum / score[i].length);
			System.out.println(sum + "\t" + avg);
		}

		System.out.println("==============================================");
		System.out.println("총점\t" + kor + "\t" + math + "\t" + eng + "\t" + totalSum);
	}

}
