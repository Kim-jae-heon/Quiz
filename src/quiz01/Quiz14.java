package quiz01;

public class Quiz14 {
	public static void main(String[] args) {
		// 1. 랜덤수 2~9까지 랜덤 정수를 만들고, for문으로 구구단 출력
		int num = (int) (Math.random() * 8) + 2;
		for (int a = 1; a <= 9; a++) {
//			System.out.println(num * a);
		//출력의 형태를 다르게 뽑아보자. printf문을 이용하기.
			System.out.printf("%d x %d = %d \n", num, a, num*a);
		}
		System.out.println("============================");
		// 2. 50부터 100까지의 합.
		int sum = 0;
		for (int b = 50; b <= 100; b++) {
			sum += b;
		}
		System.out.println(sum);
		System.out.println("============================");
		// 3. A~Z까지 문자를 가로로 출력하기 (A=65, Z=90) char형도 숫자를 기반으로 하기 때문에 반복문이 돌아갈 수 있다.
		//숫자를 적어도 되지만 문자를 그대로 적어도 가능하다.
		for (char c = 65; c <= 90; c++) {
			System.out.print(c + " ");
		}
		System.out.println("\n" + "============================");
		// 4. 200까지의 정수 중 if문을 사용하지 않고 짝수만 출력
		// d = d + 2를 d += 2로 바꾸어 쓸 수 있다는 점!
		for (int d = 2; d <= 200; d = d + 2) {
			System.out.println(d);
		}
	}
}
