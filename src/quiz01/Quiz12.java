package quiz01;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		// 정수를 입력받음. 근데 계속 받을 수 있음.
		// 0을 사용자가 입력할 때까지 계속 입력받았음. 그리고 입력받은 수들의 합을 구해줌. 한 번만 받는 것이 아닌 0 입력 받을 때까지 계속
		// 값을 받는 방법? 반복문을 이용할 것

		Scanner scan = new Scanner(System.in);
		System.out.println("0을 입력하면 총합을 계산하게 됩니다.");
		System.out.print("정수 입력>");
		int integer = scan.nextInt();
		int sum = 0; //합계변수

		if (integer != 0) {
			while (integer != 0) {
				sum += integer;
				System.out.print("정수 입력>");
				integer = scan.nextInt();
			}
		}

		if (integer == 0) {
			System.out.println("총합은" + sum + "입니다");
			scan.close();
		}
		/*
		 * int a = 1;
		 * while (a != 0) {
		 * 		
		 * 		System.out.println(">")
		 * 		a = scan.nextInt();
		 * 		sum += a;
		 * 		
		 *}
		 *
		 *System.out.println("합:" + sum);
		 *scan.close();
		 */
	}
}
