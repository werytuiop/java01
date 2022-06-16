package org.java.inheritance2;

import java.util.Scanner;

public class ExcuteController {

	public static void main(String[] args) {

		// scanner이용
		// 쿼리문입력
		// while
		// insert입력하면 insertcommand insertDo() 실행 ...
		// exit 종료

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println(">> 쿼리문 입력");
			String query = scn.nextLine();

			if (query.equals("insert")) {
				InsertCommand insert = new InsertCommand();
				insert.insertDo();
			} else if (query.equals("select")) {
				SelectCommand select = new SelectCommand();
				select.selectDo();
			} else if (query.equals("update")) {
				UpdateCommand update = new UpdateCommand();
				update.updateDo();
			} else if (query.equals("delete")) {
				DeleteCommand delete = new DeleteCommand();
				delete.deleteDo();
			} else if (query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다\n");
			}

		}

		scn.close();

	}

}
