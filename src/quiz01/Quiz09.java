package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		//간단한 사칙연산이 되는 프로그램
		//정수를 받고, 연산을 받은 뒤 또다른 정수를 받고 결과를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("사칙연산 프로그램입니다. 원하는 정수를 입력해주세요.");
		
		System.out.println("첫 번째 정수");
		System.out.print(">");
		int integer01 = scan.nextInt();
		
		System.out.println("사칙연산[+,-,*,/]중 하나를 골라주세요.");
		String cal = scan.next();
		
		System.out.println("두 번째 정수를 골라주세요");
		System.out.print(">");
		int integer02 = scan.nextInt();
		
		switch(cal) {
		case "+":
			System.out.println(integer01 + integer02);
			break;
		case "-":
			System.out.println(integer01 - integer02);
			break;
		case "*":
			System.out.println(integer01 * integer02);
			break;
		case "/":
			System.out.println(integer01 / integer02);
			break;
		default:
			System.out.println("사칙연산 기호 중 하나를 입력해주세요.");
			break;
		}
	scan.close();
	}
}
