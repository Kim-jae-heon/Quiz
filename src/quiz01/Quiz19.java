package quiz01;

import java.util.Scanner;

public class Quiz19 { // 반드시 복습

	public static void main(String[] args) {
		// 정수를 입력받으세요
		// 2중 for문을 이용하여 입력 받은 수 까지 소수들의 합을 구하세요.
		// 힌트) 입력 받은 수까지 반복, 내부 for문에서 외부 for문의 수까지 반복

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		System.out.print(">");
		int integer = scan.nextInt();

		int sum = 0;
		for (int i = 1; i <= integer; i++) {
			int count = 0; //count가 안쪽에 들어가니깐 바로되네..? 뭐냐ㅋㅋㅋㅋㅋ
			//count++ 이 빠져나오자마자 누적될 곳이 필요함에도 그 그릇이 없으니 길을 잃고 사라졌다고 해야하나..  
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	// Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		int count = 0;
//		System.out.println("정수 값을 입력하세요. 0부터 입력받은 정수까지 숫자 중 소수를 모두 더하는 프로그램입니다.");
//		System.out.print(">");
//		int integer = scan.nextInt();
//		for(int i = 1; i <= integer; i++) {
//			if(integer%i == 0) {
//				
//				count++;
//				
//				if(count == 2) {
//					sum += i;
//				}
//			}
//			System.out.println("입력받은 정수중 소수의 총합은 "+sum+"입니다");
//		}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("1부터 써주신 정수까지 소수만 구한뒤 더하는 프로그램입니다.");
//		System.out.println("정수를 써주세요");
//		int integer = scan.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= integer; i++) {
//			
//			int count = 0;
//			for (int j = 1; j <= i; j++) {
//				if (i >= j) {
//					if (i % j == 0) {
//						count++;
//					} 
//				}
//			}
//			if (count == 2) {
//				sum += i; //여기에서 또 다른 그릇이 필요하다는 점을 생각하지 못함.
//			}
//		}
//		System.out.println("1에서" + integer +"까지 소수의 합은" + sum + "입니다.");
//	}
}

