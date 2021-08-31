package quiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		//1.정수 2개를 입력 받으세요
		Scanner scan = new Scanner(System.in);
		System.out.println("비교할 정수 2개를 입력해주세요");
		System.out.print("첫번째 정수>");
		int integer01 = scan.nextInt();
		System.out.print("두번째 정수>");
		int integer02 = scan.nextInt();
		//2. 두 수를 비교해서 "x가 큰 수 입니다"를 출력, 같은 수라면 "같은 수 입니다"를 출력
		if(integer01 > integer02) {
			System.out.println("첫 번째 정수가 두 번째 정수보다 큽니다.");
		} else if (integer02 > integer01) {
			System.out.println("두 번째 정수가 첫 번째 정수보다 큽니다.");
		} else {
			System.out.println("두 정수는 같습니다.");
		}
		
		scan.close();
	}
}
