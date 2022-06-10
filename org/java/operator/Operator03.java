package org.java.operator;

public class Operator03 {

	public static void main(String[] args) {

		System.out.println("<논리연산자>");

		String userId = "idid";
		String userPw = "pwpw";

		System.out.println(userId == "idid" && userPw == "pwpw");
		System.out.println(userId == "idid" && userPw == "pppp");
		System.out.println(userId == "iiii" && userPw == "pwpw");
		System.out.println(userId == "iiii" && userPw == "pppp");

		if (userId == "idid" && userPw == "pwpw") {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		System.out.println(userId == "idid" || userPw == "pwpw");
		System.out.println(userId == "idid" || userPw == "pppp");
		System.out.println(userId == "iiii" || userPw == "pwpw");
		System.out.println(userId == "iiii" || userPw == "pppp");

		if (userId != "idid" || userPw != "pwpw") {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}

	}

}
