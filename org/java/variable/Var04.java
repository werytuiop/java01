package org.java.variable;

public class Var04 {

	public static void main(String[] args) {

		System.out.println("<����, ������ Ÿ��>");
		System.out.println("<< �ڹ��� ������ >>");

		ClassBasic cb = new ClassBasic();

		// ��������� Ÿ�� (Ŭ����)
		// �ν��Ͻ�ȭ (��üȭ)
		VarSub v1 = new VarSub();
		v1.num1 = 100;
		v1.num2 = 200;
		v1.sum();
		v1.method(200, 500);

		String str1 = new String();
		str1 = "���ڿ� ��ü�� �ڷ���";
		System.out.println(str1);

	}

}
