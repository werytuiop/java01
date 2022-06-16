package org.java.constructor;

public class Constructor01Main {

	public static void main(String[] args) {

		Constructor01 con1 = new Constructor01();

		con1.setUserId("id1");
		System.out.println(con1.getUserId());
		con1.setUserPw("pw1");
		System.out.println(con1.getUserPw());

		System.out.println();

		Constructor01 con2 = new Constructor01("id2");

		System.out.println(con2.getUserId());
		con2.setUserPw("pw2");
		System.out.println(con2.getUserPw());

		System.out.println();

		Constructor01 con3 = new Constructor01("id3", "pw3");

		System.out.println(con3.getUserId());
		System.out.println(con3.getUserPw());

	}

}
