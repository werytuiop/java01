package org.java.oop;

public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car();

		Car.CITY = "Busan";
		System.out.println(Car.CITY);

//		c1.instanceMethod1(); // 값을 넣기 전 기본값은 null, 0

		c1.carName = "aCar";
		c1.carPrice = 10000;
		c1.carYear = 2020;
		c1.carWidth = 150;

		c1.instanceMethod1();
		c1.instanceMethod2();
		c1.instanceMethod3();
		c1.instanceMethod4();

		c1.setOption1("색상 : Red");
		c1.setOption2("오토");
		System.out.println(c1.getOption1());
		System.out.println(c1.getOption2());

		System.out.println("=================\n");

		Car c2 = new Car();

		Car.CITY = "Daegu";
		System.out.println(Car.CITY);

		c2.carName = "bCar";
		c2.carPrice = 20000;
		c2.carYear = 2022;
		c2.carWidth = 300;

		c2.instanceMethod1();
		c2.instanceMethod2();
		c2.instanceMethod3();
		c2.instanceMethod4();

		c1.setOption1("색상 : Black");
		c1.setOption2("스틱");
		System.out.println(c1.getOption1());
		System.out.println(c1.getOption2());

	}

}
