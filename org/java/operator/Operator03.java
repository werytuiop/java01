package org.java.operator;

public class Operator03 {

	public static void main(String[] args) {

		System.out.println("<��������>");

		String userId = "idid";
		String userPw = "pwpw";

		System.out.println(userId == "idid" && userPw == "pwpw");
		System.out.println(userId == "idid" && userPw == "pppp");
		System.out.println(userId == "iiii" && userPw == "pwpw");
		System.out.println(userId == "iiii" && userPw == "pppp");

		if (userId == "idid" && userPw == "pwpw") {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

		System.out.println(userId == "idid" || userPw == "pwpw");
		System.out.println(userId == "idid" || userPw == "pppp");
		System.out.println(userId == "iiii" || userPw == "pwpw");
		System.out.println(userId == "iiii" || userPw == "pppp");

		if (userId != "idid" || userPw != "pwpw") {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

	}

}
