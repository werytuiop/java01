package org.java.print_scanner;
import java.util.Scanner;

public class ScannerTest_0609 {

	/*
		1) ����, ����, ���� ������ �Է��Ͽ� ����, ����� �ֿܼ� ���
		2) �Է°��� ����. ������ ����� ������ Ÿ������ ���� Scanner
		Ŭ���� �̿�
	*/
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("���� ������ �Է��ϼ���.");
		int g1 = scn.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int g2 = scn.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int g3 = scn.nextInt();

		int sum = g1 + g2 + g3;
		double avg = (double) sum / 3;

		System.out.println("���� : " + sum + " ��");
		System.out.println("��� : " + avg + " ��");

		scn.close();

	}

}
