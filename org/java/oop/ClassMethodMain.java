package org.java.oop;

public class ClassMethodMain {

	public int s1;
	public int s2;
	public static int s3;

	public void m1() {
		s1 = 10;
		s2 = 20;
		s3 = 30;
		// static이 안 붙은 메소드에서는 인스턴스 멤버 사용 가능
	}

	public static void main(String[] args) {

//		s1 = 100; // static이 아닌 인스턴스 멤버는 사용할 수 없다
		s3 = 300;

		ClassMethod c1 = new ClassMethod();

		c1.method1();

		c1.method2(2, 3);
		c1.method2(4, 5);

		System.out.println(c1.method3());
		int m3 = c1.method3();
		System.out.println(m3);

		System.out.println(c1.method4(11, 22));
		int m4 = c1.method4(33, 44);
		System.out.println(m4);

		ClassMethod.staticMethod();
		ClassMethod.staticMethod2(100, 200);

	}

}
