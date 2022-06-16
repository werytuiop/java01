package org.java.condition;

import java.util.Scanner;

public class If07 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("쿼리문을 입력하세요.(insert/update/select/delete)");
		String query = scn.nextLine();

		if (query.equals("insert")) {
			System.out.println(">> 회원가입 페이지로 이동합니다.");
		} else if (query.equals("update")) {
			System.out.println(">> 회원수정 페이지로 이동합니다.");
		} else if (query.equals("select")) {
			System.out.println(">> 회원조회 페이지로 이동합니다.");
		} else if (query.equals("delete")) {
			System.out.println(">> 회원탈퇴 페이지로 이동합니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}

		scn.close();
		
		/*
		<CRUD>
		대부분의 컴퓨터 소프트웨어가 가지는 기본적인 데이터 처리 기능
		Create(생성), Read(읽기), Update(갱신), Delete(삭제)
		사용자 인터페이스가 갖추어야 할 기능(정보의 참조/검색/갱신)을 가리키는 용어로서도 사용된다.
		*/

	}

}
