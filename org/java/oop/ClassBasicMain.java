package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {

		// Ŭ���� ��� : ��ü�� �������� �ʾƵ� ��� ����. ���� ������
		ClassBasic.projectYear = 2022;
		ClassBasic.classMethod();

		System.out.println();

		/* new : ��ü ���� ������ */

		// �ν��Ͻ�ȭ (��üȭ)
//		new ClassBasic(); // ���� ��Ű�� �ȿ����� import�� ���ص� ������ �� �� ����
		ClassBasic cb1 = new ClassBasic();
		// �ν��Ͻ� ��� : ��ü�� ������ �� ���� ����
		cb1.userId = "id1";
		cb1.userPw = "pw1";
		cb1.userAge = 10;
		System.out.println("cb1.userId : " + cb1.userId);
		System.out.println("cb1.userPw : " + cb1.userPw);
		System.out.println("cb1.userAge : " + cb1.userAge);
		cb1.instanceMethod();
		cb1.setProjectName("JAVAPROJECT2022");
		String projectName = cb1.getProjectName();
		System.out.println(projectName);

		System.out.println();

		// �ν��Ͻ�ȭ (��üȭ)
		ClassBasic cb2 = new ClassBasic();
		cb2.userId = "id2";
		cb2.userPw = "pw2";
		cb2.userAge = 20;
		System.out.println("cb2.userId : " + cb2.userId);
		System.out.println("cb2.userPw : " + cb2.userPw);
		System.out.println("cb2.userAge : " + cb2.userAge);
		cb2.instanceMethod();

	}

}
