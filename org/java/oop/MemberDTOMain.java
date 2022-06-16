package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDTOMain {

	public static void main(String[] args) {

		MemberDTO member1 = new MemberDTO();

		member1.setUserId("root");
		member1.setUserPw("1111");
		member1.setUserName("name");
		member1.setUserAge(20);
		member1.setUserAddr("����� �����");
		member1.setUserPhone("010-1234-5678");
		member1.setDay(new Date());

		SimpleDateFormat sDay = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String now = sDay.format(member1.getDay());

		String userId = member1.getUserId();
		String userPw = member1.getUserPw();
		String userName = member1.getUserName();
		int userAge = member1.getUserAge();
		String userAddr = member1.getUserAddr();
		String userPhone = member1.getUserPhone();
		Date day = member1.getDay();

		System.out.println("���̵�: " + userId);
		System.out.println("��й�ȣ: " + userPw);
		System.out.println("�̸�: " + userName);
		System.out.println("����: " + userAge);
		System.out.println("�ּ�: " + userAddr);
		System.out.println("��ȣ: " + userPhone);
		System.out.println("��¥: " + now);
		
		System.out.println("===================================");
		
		System.out.println(member1.toString());
		
		System.out.println("===================================");
		
		MemberDTO member2 = new MemberDTO();

		Scanner scn = new Scanner(System.in);

		System.out.println("���̵� �Է��ϼ���");
		member2.setUserId(scn.next());
		System.out.println("��й�ȣ�� �Է��ϼ���");
		member2.setUserPw(scn.next());
		System.out.println("�̸��� �Է��ϼ���");
		member2.setUserName(scn.next());
		System.out.println("���̸� �Է��ϼ���");
		member2.setUserAge(scn.nextInt());
		System.out.println("�ּҸ� �Է��ϼ���");
		member2.setUserAddr(scn.next());
		System.out.println("��ȣ �Է��ϼ���");
		member2.setUserPhone(scn.next());
		member2.setDay(new Date());
		
		System.out.println("-----------------------------------");
		System.out.println("���̵�: " + member2.getUserId());
		System.out.println("��й�ȣ: " + member2.getUserPw());
		System.out.println("�̸�: " + member2.getUserName());
		System.out.println("����: " + member2.getUserAge());
		System.out.println("�ּ�: " + member2.getUserAddr());
		System.out.println("��ȣ: " + member2.getUserPhone());
		System.out.println("��¥: " + sDay.format(member2.getDay()));
		System.out.println("-----------------------------------");

		scn.close();

	}

}
