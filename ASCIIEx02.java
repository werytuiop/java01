import java.util.Scanner;

public class ASCIIEx02 {

	public static void main(String[] args) {
		System.out.println("�빮�� �Ǵ� �ҹ��ڸ� �Է��ϼ���. (65~90 && 97~122)");
		Scanner scn = new Scanner(System.in);
		int alpa = scn.nextInt();

		if (alpa > 64 && alpa < 91) {

			System.out.println("�Է°� : " + alpa);
			System.out.println("�빮�� : " + (char) alpa);

			int upAlpa = alpa + 32;
			System.out.println("���氪 : " + upAlpa);
			System.out.println("�ҹ��� : " + (char) upAlpa);

		} else if (alpa > 96 && alpa < 123) {

			System.out.println("�Է°� : " + alpa);
			System.out.println("�ҹ��� : " + (char) alpa);

			int downAlpa = alpa - 32;
			System.out.println("���氪 : " + downAlpa);
			System.out.println("�빮�� : " + (char) downAlpa);

		} else {
			System.out.println("�ٽ� 65~90 && 97~122 ������ �Է��ϼ���.");
		}

		scn.close();

	}

}
