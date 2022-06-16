package org.java.array;

public class Array01 {

	public static void main(String[] args) {

		System.out.println("<배열>");

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

		System.out.println("배열의 총 개수 : " + arr1.length);
		System.out.println("배열의 마지막 인덱스 : " + (arr1.length - 1));

		/* for문을 이용해서 arr1을 01234로 초기화하고 콘솔에 각 번지의 값을 출력 */
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

		/* int형 데이터를 저장할 수 있는 배열 arr3을 선언하고 int형 12345로 초기화 */
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
