package org.java.oop;

// class : ����� ���� Ÿ��
public class ClassBasic {

	/* �ʵ�(�Ӽ�) */

	// �ν��Ͻ� ���
	public String userId;
	public String userPw;
	public int userAge;
	private String projectName; // private ĸ��ȭ 
	// Ŭ���� ��� (static)
	public static int projectYear;

	// ��ü ������ �ʿ��� Ư�� �޼ҵ�
	public ClassBasic() {
		System.out.println("������(constructor)");
	}

	
	/* �޼ҵ� */

	// �ν��Ͻ� �޼ҵ�
	public void instanceMethod() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}

	// Ŭ���� �޼ҵ�
	public static void classMethod() {
		System.out.println("Ŭ���� �޼ҵ�");
	}

	
	/* getters, setters */

	// private ���(�ʵ�)�� �ʱ�ȭ set
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	// private ���(�ʵ�)�� get
	public String getProjectName() {
		return this.projectName;
	}	
	

}
