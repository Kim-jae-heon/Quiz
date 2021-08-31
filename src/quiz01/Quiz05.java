package quiz01;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		// 1. 양의 정수를 입력 받아 짝수라면 "x는 짝수입니다", 홀수라면 "x는 홀수입니다"를 출려하세요.
		// 2. 0이라면 "0입니다"
		// 3. 음수 라면 "음수 입니다"를 출력하세요
		Scanner scan = new Scanner(System.in); // 입력받는 법 외우기.
		System.out.println("양의 정수를 입력해주세요");
		System.out.print("양의 정수>");
		int integer01 = scan.nextInt();
		//만약 else if만 쓰겠다하면 어떻게 해야할까?도 생각해보아야 함. 
		if (integer01 > 0) {
			if (integer01 % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		} else if (integer01 == 0) {
			System.out.println("0은 짝수도 홀수도 아닌 0입니다");
		} else {
			System.out.println("음수입니다...");
		}

		scan.close();
	}
}
