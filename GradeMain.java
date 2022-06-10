import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		System.out.println("<<����, ����, ���� ������ �Է�. ����/���/���� ���>>");

		Scanner scn = new Scanner(System.in);
		System.out.println("> ���� ���� �Է�");
		int kor = scn.nextInt();
		System.out.println("> ���� ���� �Է�");
		int eng = scn.nextInt();
		System.out.println("> ���� ���� �Է�");
		int math = scn.nextInt();

		Grade grade = new Grade(kor, eng, math);

		grade.sumGrade();
		grade.avgGrade();
		double avg = grade.avgGet(); // ��հ� ��ȯ

		System.out.print("���� : ");
		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A-");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B-");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C-");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D-");
			}
		} else {
			System.out.println("F");
		}

		scn.close();

	}

}
