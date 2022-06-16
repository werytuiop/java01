package org.java.print_scanner;

import java.util.Scanner;

/*
	<Scanner Ŭ����>
	- ���� ����Ʈ�� ����, ����, �Ǽ�, �Ҹ�, ���ڿ� �� �پ��� Ÿ������ ��ȯ�Ͽ� ����
	- Ű���忡 ����� System.in���� Ű�� �а� �ϰ� ���ϴ� Ÿ������ ��ȯ�Ͽ� ����
	- Scanner scn = new Scanner (System.in);
	- scn.next();       ���ڿ� �Է� -> String url = scn.next();  // ���� �������� ����
	- scn.nextInt();    ���� �Է� -> int num1 = scn.nextInt();
	- scn.nextLine();   ���ڿ� �Է� (\n ����)
 */

public class Scanner01 {

	public static void main(String[] args) {

		System.out.println("<Scanner �ǽ�>");

		System.out.println("������ ���ڸ� �Է��ϼ���.");

		Scanner scn = new Scanner(System.in); // �ֿܼ� �Է�
		// new : ��ü ���� ������ (��ü�� �ּҰ� ����)

		System.out.println("ù��° ���� �Է�");
		int i1 = scn.nextInt(); // ������ data �Է�
		System.out.println("ù��° �Է°�: " + i1);

		System.out.println("�ι�° ���� �Է�");
		int i2 = scn.nextInt(); // ������ data �Է�
		System.out.println("�ι�° �Է°�: " + i2);

		System.out.println(i1 + "+" + i2 + "=" + (i1 + i2));

		System.out.println("�����ڸ� �Է��غ�����.");
		String str = scn.next(); // ���ڿ��� �Է�
		System.out.println("�Էµ� ������: " + str);

		scn.close();

	}

}
