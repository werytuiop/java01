package org.java.array;

public class Array05 {

	public static void main(String[] args) {

		System.out.println("<�迭>");
		System.out.println("<<������ �迭>>");

		int[][] arr1 = new int[4][3];
		System.out.println("�� ���� : " + arr1.length); // �� ����
		System.out.println("�� ���� : " + arr1[0].length); // �� ����

		// �迭 arr1�� 1~12�� �ʱ�ȭ
		int a = 1;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(i + "�� >> ");
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = a++;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===========\n");

		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}

	}

}
