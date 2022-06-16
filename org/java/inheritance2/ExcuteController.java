package org.java.inheritance2;

import java.util.Scanner;

public class ExcuteController {

	public static void main(String[] args) {

		// scanner�̿�
		// �������Է�
		// while
		// insert�Է��ϸ� insertcommand insertDo() ���� ...
		// exit ����

		Scanner scn = new Scanner(System.in);

		while (true) {

			System.out.println(">> ������ �Է�");
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
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�\n");
			}

		}

		scn.close();

	}

}
