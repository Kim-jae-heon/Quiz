package quiz01;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		/*
		 * 1. Scanner를 이용하여 금액을 입력받기
		 * 2. 음료수를 선택하면 금액에서 차감하기
		 * 3. 금액이 부족하다면 "금액이 부족합니다"출력하기
		 * 4. 4를 입력받으면 반복문 종료하기
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("투입할 금액을 알려주세요");
		System.out.print(">");
		int cash = scan.nextInt();
//		boolean flag = false; //탈출을 위한 변수
		
		ex:while(cash >= 400) {
			System.out.println("[1]데미소다:400원, [2]밀키스:500원, [3]코카콜라:600원, [4]잔돈받기");
			System.out.print("음료수 선택>");
			int drink = scan.nextInt();

			switch(drink) {
			case 1:
				cash = cash - 400;
				System.out.println("데미소다를 받았습니다. 남은 잔돈은 "+cash+"원입니다.");
				break;
			case 2:
				cash = cash - 500;
				System.out.println("밀키스를 받았습니다. 남은 잔돈은 "+cash+"원입니다.");
				break;
			case 3:
				cash = cash - 600;
				System.out.println("코카콜라를 받았습니다. 남은 잔돈은 "+cash+"원입니다.");
				break;
			case 4:
				System.out.println("잔돈을 반환합니다. 반환할 잔돈은 "+cash+"원입니다.");
//				flag = true;
				break ex;
			default:
				System.out.println("잘못 입력했습니다");
				System.out.println("메뉴를 정확하게 입력하세요");
				break;
			}
			
//			if(flag) break; //true라면 탈출
			
		}
		System.out.println("어떤 음료수도 뽑을 수 없습니다. 잔돈 "+cash+"원을 반환합니다.");
		scan.close();
		
//		if(drink == 1) {
//			cash = cash - 400;
//			System.out.println("남은 금액은 "+cash+"입니다");
//			if(cash < 400) {
//				System.out.println("남은 금액이 부족합니다.");
//			}
//		} else if(drink == 2) {
//			cash = cash - 500;
//			System.out.println("남은 금액은 "+cash+"입니다");
//			if(cash < 400) {
//				System.out.println("남은 금액이 부족합니다.");
//			}
//		} else if(drink == 3) {
//			cash = cash - 600;
//			System.out.println("남은 금액은 "+cash+"입니다");
//			if(cash < 400) {
//				System.out.println("남은 금액이 부족합니다.");
//			}
//		} else {
//			System.out.println("잔돈을 반환합니다.");
//			if(cash < 400) {
//				System.out.println("남은 금액이 부족합니다.");
//			}
//		}
	}
}
