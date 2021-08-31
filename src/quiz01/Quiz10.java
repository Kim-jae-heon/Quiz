package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		// 구구단 출력하기
		// 구구단 단수 입력받은 뒤 구구단 실행
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 단수를 입력하세요");
		System.out.print(">");
		int integer = scan.nextInt();
		System.out.println("랜덤 구구단 "+integer+"단");
		
		System.out.println("===================");
		int a = 1;
		while (a < 10) {
			System.out.println(integer + " x " + a + " = " + integer * a);
			a++;
		}
		scan.close();
	}
}