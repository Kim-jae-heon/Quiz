package quiz01;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		// 1. 두 수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램입니다.
		// 2. 2가지의 정수를 1~100 사이의 난수를 발생시켜 지속적으로 문제를 출제한 후 정답이면 정답 카운트를 +1씩, 틀리면 오답카운트
		// 를 +1씩 올려주는 프로그램을 만드세요. 또한 프로그램은 0을 입력받으면 반복을 중단(탈출) 합니다.

		int rCount = 0;
		int wCount = 0;
		while (true) {
			int integer01 = (int) (Math.random() * 201) - 100;
			int integer02 = (int) (Math.random() * 201) - 100;
			
			if(integer02 >= 0) {
				System.out.print(integer01 + " + " + integer02 + " = " + "?" + "\n" + ">");
			} else if (integer02 < 0) {
				System.out.print(integer01 + " - " + (integer02*-1) + " = " + "?" + "\n" + ">");
			}
			
			Scanner scan = new Scanner(System.in);
			int answer = scan.nextInt();
			if (answer == integer01 + integer02) {
				System.out.println("정답입니다");
				rCount++;
			} else if (answer != integer01 + integer02) {
				if (answer == 0) {
					System.out.println("계산프로그램을 종료합니다.");
					System.out.println("맟춘 갯수" + rCount + "\n틀린 갯수" + wCount);
					scan.close();
					break;
				} else {
					System.out.println("오답입니다");
					wCount++;
				}
			}
		}
	}
}
