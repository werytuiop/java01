package org.java.operator;

public class Operator09 {

	public static void main(String[] args) {

		System.out.println("<���׿�����>");
		
		int i1 = 10;
		System.out.println(i1++);  // println ���� �����ϰ� ���� ����
		System.out.println(i1);
		System.out.println();
		
		int i2 = 10;
		System.out.println(++i2);
		System.out.println(i2);
		System.out.println();
		
		int i3 = 10;
		System.out.println(i3--);
		System.out.println(i3);
		System.out.println();
		
		int i4 = 10;
		System.out.println(--i4);
		System.out.println(i4);
		System.out.println();
		
		
		for (int i=0; i<10; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i=0; i<10; ++i) {
			System.out.print(i);
		}
		/* �ݺ��������� i++, ++i�� ���� (�׳� �ѵ����� ����) */
		
	}

}
