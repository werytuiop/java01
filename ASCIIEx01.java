
public class ASCIIEx01 {

	public static void main(String[] args) {

		System.out.println('A');
		System.out.println((int) 'A');

		System.out.println();

		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);

		System.out.println();

		// �ҹ��� >> �빮��
		System.out.println('B' - 'A');
		System.out.println('a' - 'A');
		System.out.println('b' - 32);
		System.out.println('b');
		System.out.println((char) ('b' - 32));

		System.out.println();

		// �빮�� >> �ҹ���
		System.out.println('A');
		System.out.println('A' + 32);
		System.out.println((char) 'A' + 32);

	}

}
