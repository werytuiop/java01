package org.java.oop;

public class ClassMain {

	public static void main(String[] args) {

		// �ν��Ͻ�ȭ 1
		Class c1 = new Class();

		c1.num1 = 10;
		c1.num2 = 20;
		c1.setKey("key1");

		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(c1.getKey());

		System.out.println();
		

		// �ν��Ͻ�ȭ 2
		Class c2 = new Class();

		c2.num1 = 100;
		c2.num2 = 200;
		c2.setKey("key2");

		System.out.println(c2.num1);
		System.out.println(c2.num2);
		System.out.println(c2.getKey());

		System.out.println();
		

		// Ŭ���� ��� ȣ�� (��üȭ ���� ȣ�� ����)
		String pName = Class.PROJECTNAME;
		System.out.println("ProjectName : " + pName);
		Class.classMethod();

	}

}
