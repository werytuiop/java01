package org.java.array;

public class Array04 {

	public static void main(String[] args) {

		System.out.println("<배열>");
		System.out.println("<<char형 배열>>");

		int i;
		char[] ch = { 'C', 'A', 'F', 'E' };
		String s1 = new String(ch); // char배열 -> String 변환
		System.out.println(s1);

		String[] binary = { "0000", "0001", "0010", "0011",
							"0100", "0101", "0110", "0111",
							"1000", "1001", "1010", "1110",
							"1100", "1101", "1110", "1111" };

		String result = "";

		// C=67 A=65 F=70 E=69
		for (i = 0; i < ch.length; i++) {
			if ('0' <= ch[i] && ch[i] <= '9') { // 0=48, 9=57
				result += binary[ch[i] - '0'];
			} else {
				result += binary[ch[i] - 'A' + 10];
			}
		}

		System.out.println("ch = " + new String(ch));
		System.out.println(result);

	}

}
