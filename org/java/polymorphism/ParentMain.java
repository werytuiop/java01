package org.java.polymorphism;

public class ParentMain {

	public static void main(String[] args) {

		System.out.println("´ÙÇü¼º");

		Parent p1 = new Parent();
		p1.num1 = 10;
		p1.num2 = 20;
		p1.parentMethod();

		Parent p2 = new Sub1();
		p2.num1 = 10;
		p2.num2 = 20;
		p2.parentMethod();

		Parent p3 = new Sub1Sub();
		p3.num1 = 10;
		p3.num2 = 20;
		p3.parentMethod();

		Parent p4 = (Parent) new Sub1Sub(); // auto-upcasting

		Sub1 s1 = new Sub1();
//		Sub1 s2 = new Parent(); // ¿¡·¯³²
		s1.num1 = 10;
		s1.num2 = 20;
		s1.num3 = 30;
		s1.num4 = 40;
		s1.parentMethod();
		s1.sub1Method();
		// ParentÀÇ ¸â¹ö¿Í Sub1ÀÇ ¸â¹ö°¡ ¸ðµÎ ³ª¿È

		Sub1 s2 = new Sub1Sub();
		s2.num1 = 10;
		s2.num2 = 20;
		s2.num3 = 30;
		s2.num4 = 40;
		s2.parentMethod();
		s2.sub1Method();
		// Parent ¸â¹ö, Sub1 ¸â¹ö

		Sub1Sub s3 = new Sub1Sub();
		s3.num1 = 10;
		s3.num2 = 20;
		s3.num3 = 30;
		s3.num4 = 40;
		s3.num5 = 50;
		s3.parentMethod();
		s3.sub1Method();
		s3.sub1SubMethod();
		// Parent ¸â¹ö, Sub1 ¸â¹ö, Sub1Sub ¸â¹ö

	}

}
