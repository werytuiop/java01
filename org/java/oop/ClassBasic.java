package org.java.oop;

// class : 사용자 정의 타입
public class ClassBasic {

	/* 필드(속성) */

	// 인스턴스 멤버
	public String userId;
	public String userPw;
	public int userAge;
	private String projectName; // private 캡슐화 
	// 클래스 멤버 (static)
	public static int projectYear;

	// 객체 생성시 필요한 특수 메소드
	public ClassBasic() {
		System.out.println("생성자(constructor)");
	}

	
	/* 메소드 */

	// 인스턴스 메소드
	public void instanceMethod() {
		System.out.println("인스턴스 메소드");
	}

	// 클래스 메소드
	public static void classMethod() {
		System.out.println("클래스 메소드");
	}

	
	/* getters, setters */

	// private 멤버(필드)를 초기화 set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	// private 멤버(필드)를 get
	public String getProjectName() {
		return this.projectName;
	}	
	

}
