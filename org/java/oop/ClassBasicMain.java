package org.java.oop;

public class ClassBasicMain {

	public static void main(String[] args) {

		// 클래스 멤버 : 객체를 생성하지 않아도 사용 가능. 공용 데이터
		ClassBasic.projectYear = 2022;
		ClassBasic.classMethod();

		System.out.println();

		/* new : 객체 생성 연산자 */

		// 인스턴스화 (객체화)
//		new ClassBasic(); // 같은 패키지 안에서는 import를 안해도 가져다 쓸 수 있음
		ClassBasic cb1 = new ClassBasic();
		// 인스턴스 멤버 : 객체를 생성한 후 접근 가능
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

		// 인스턴스화 (객체화)
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
