package org.java.loof;

public class While02 {

	public static void main(String[] args) {

		System.out.println("<while��>");

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		int i2 = 0;
		while (true) {
			System.out.println(i2);
			// if���� ����ؼ� 0~9������ ��µǵ���
			if(i2>=9) break;
			i2++;
		}

	}

}
