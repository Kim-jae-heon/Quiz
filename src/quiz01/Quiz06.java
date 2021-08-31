package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 정수를 3개 순서대로 입력받도록 하기. 
		 * 가장 큰 값, 중간 값, 가장 작은 값을 구해서 max, mid, min변수에 저장하고 출력하면 된다.
		 */
		int max = 0, mid = 0, min = 0; // if문 안에서 필요한 경우에 변수값을 바꾸기 위해서 선언을 한 것.

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 차례로 입력해주세요");
		System.out.print("첫 번째 정수: ");
		int integer01 = scan.nextInt();
		System.out.print("두 번째 정수: ");
		int integer02 = scan.nextInt();
		System.out.print("세 번째 정수: ");
		int integer03 = scan.nextInt();

		if ((integer01 > integer02) & (integer01 > integer03)) {
			if (integer02 > integer03) {
				System.out.println("max 값은" + integer01);
				System.out.println("mid 값은" + integer02);
				System.out.println("min 값은" + integer03);
			} else {
				System.out.println("max 값은" + integer01);
				System.out.println("mid 값은" + integer03);
				System.out.println("min 값은" + integer02);
			}
		}
		if ((integer02 > integer03) & (integer02 > integer01)) {
			if (integer01 > integer03) {
				System.out.println("max 값은" + integer02);
				System.out.println("mid 값은" + integer01);
				System.out.println("max 값은" + integer03);
			} else {
				System.out.println("max 값은" + integer02);
				System.out.println("mid 값은" + integer03);
				System.out.println("min 값은" + integer01);
			}
		}
		if ((integer03 > integer01) & (integer03 > integer02)) {
			if (integer01 > integer02) {
				System.out.println("max 값은" + integer03);
				System.out.println("mid 값은" + integer01);
				System.out.println("min 값은" + integer02);
			} else {
				System.out.println("max 값은" + integer03);
				System.out.println("mid 값은" + integer02);
				System.out.println("min 값은" + integer01);
			}
		}
		scan.close();
	}
}
