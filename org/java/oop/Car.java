package org.java.oop;

public class Car {

	// 인스턴스 멤버 (필드)
	public String carName;
	public int carPrice;
	public int carYear;
	public int carWidth;
	private String option1;
	private String option2;
//	public static final String CITY = "Seoul";
	public static String CITY;

	// 인스턴스 멤버 (메소드)
	public void instanceMethod1() {
		System.out.println("자동차 이름 : " + this.carName);
	}

	public void instanceMethod2() {
		System.out.println("자동차 가격 : " + this.carPrice);
	}

	public void instanceMethod3() {
		System.out.println("자동차 연식 : " + this.carYear);
	}

	public void instanceMethod4() {
		System.out.println("자동차 너비 : " + this.carWidth);
	}

	// setters, getters
	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption1() {
		return this.option1;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption2() {
		return this.option2;
	}

}
