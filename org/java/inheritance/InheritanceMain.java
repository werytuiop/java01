package org.java.inheritance;

public class InheritanceMain {

	public static void main(String[] args) {

		Child1 ch1 = new Child1();
		ch1.num1 = 10;
		ch1.parentMethod();
		ch1.parentMethod2();

		System.out.println();

		Child2 ch2 = new Child2();
		ch2.num2 = 20;
		ch2.parentMethod();
	}

}
