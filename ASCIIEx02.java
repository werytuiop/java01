import java.util.Scanner;

public class ASCIIEx02 {

	public static void main(String[] args) {
		System.out.println("대문자 또는 소문자를 입력하세요. (65~90 && 97~122)");
		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();

		if (alpa > 64 && alpa < 91) {

			System.out.println("입력값 : " + alpa);
			System.out.println("대문자 : " + (char) alpa);

			int upAlpa = alpa + 32;
			System.out.println("변경값 : " + upAlpa);
			System.out.println("소문자 : " + (char) upAlpa);

		} else if (alpa > 96 && alpa < 123) {

			System.out.println("입력값 : " + alpa);
			System.out.println("소문자 : " + (char) alpa);

			int downAlpa = alpa - 32;
			System.out.println("변경값 : " + downAlpa);
			System.out.println("대문자 : " + (char) downAlpa);

		} else {
			System.out.println("다시 65~90 && 97~122 정수를 입력하세요.");
		}

		scn.close();

	}

}
