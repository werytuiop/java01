package org.java.constructor;

public class Constructor01 {

	private String userId;
	private String userPw;

	public Constructor01() {
		this("userId");
		System.out.println("기본 생성자 1");
	}

	public Constructor01(String userId) {
		this.userId = userId;
		System.out.println("다른 생성자 2");
	}

	public Constructor01(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
		System.out.println("다른 생성자 3");
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

}
