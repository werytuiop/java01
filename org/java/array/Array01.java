package org.java.array;

public class Array01 {

	public static void main(String[] args) {

		System.out.println("<�迭>");

		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		System.out.print(arr1[0] + " ");
		System.out.print(arr1[1] + " ");
		System.out.print(arr1[2] + " ");
		System.out.print(arr1[3] + " ");
		System.out.print(arr1[4] + " ");
		System.out.println();

		System.out.println("�迭�� �� ���� : " + arr1.length);
		System.out.println("�迭�� ������ �ε��� : " + (arr1.length - 1));

		/* for���� �̿��ؼ� arr1�� 01234�� �ʱ�ȭ�ϰ� �ֿܼ� �� ������ ���� ��� */
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

		/* int�� �����͸� ������ �� �ִ� �迭 arr3�� �����ϰ� int�� 12345�� �ʱ�ȭ */
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
