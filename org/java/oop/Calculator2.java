package org.java.oop;

public class Calculator2 {

	private int num1;
	private int num2;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum1() {
		return this.num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum2() {
		return this.num2;
	}

	public void add() {
		System.out.println("더하기");
		System.out.println(this.num1 + "+" + this.num2 + "=" + (this.num1 + this.num2));
	}

	public void sub() {
		System.out.println("빼기");
		System.out.println(this.num1 + "-" + this.num2 + "=" + (this.num1 - this.num2));
	}

	public int multi() {
		System.out.println("곱하기");
		return this.num1 * this.num2;
	}

	public int div() {
		System.out.println("나누기");
		return this.num1 / this.num2;
	}

}
