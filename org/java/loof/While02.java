package org.java.loof;

public class While02 {

	public static void main(String[] args) {

		System.out.println("<while문>");

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		int i2 = 0;
		while (true) {
			System.out.println(i2);
			// if문을 사용해서 0~9까지만 출력되도록
			if(i2>=9) break;
			i2++;
		}

	}

}
