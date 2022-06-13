

public class MathRandom {

	public static void main(String[] args) {

		System.out.println("Math.random(난수) 0 <= Math.random() < 1");

		// 랜덤한 double형 data가 출력
		System.out.println(Math.random()); // double

		// 0 <= Math.random() < 1

		// 0*10 <= Math.random()*10 < 1*10 (0 <= < 10)

		double rad = Math.random() * 10;
//		System.out.println("난수 (0이상 10미만)\n" + Math.random() * 10 + "\nintgud : " + (int) (Math.random() * 10)); // 실행할때마다다름
		System.out.println("난수 (0이상 10미만)\n" + rad + "\nint형 : " + (int) rad);

		for (int i = 0; i < 10; i++) {
			double rad2 = Math.random() * 10;
			System.out.println((int) rad2 + " ");
		}

	}

}
