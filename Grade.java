
public class Grade {

	// �ʵ�, ������Ƽ
	private int kor; // �ν��Ͻ� ���
	private int eng;
	private int math;

	// method (�޼ҵ�)
	// constructor (������)
	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// method (�޼ҵ�)
	public void sumGrade() {
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		int sum = kor + eng + math;
		System.out.println("���� : " + sum);
	}

	// method (�޼ҵ�)
	public void avgGrade() {
		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);
	}

	// method (�޼ҵ�)
	public double avgGet() {
		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		return avg;
	}

}
