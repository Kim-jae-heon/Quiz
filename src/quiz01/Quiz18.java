package quiz01;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		/*
		 * 가로, 세로를 입력받아서 직사각형을 출력합니다.
		 * 단, 윤곽만 출력하면 됩니다.
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
//				System.out.println(i + "-" + j);
				if(j==5) {
					System.out.print("*\n");
				} else {
					System.out.print("*");
					if(i < 5 && i > 1) {
						if(j < 5 && j > 1) {
							System.out.print(" "); //이게 delete의 의미가 아니니깐.. 이런 방식으로 하면 안됨.
							//삭제를 못하니 추가와 점프밖에 없는데, 추가와 점프만으로 해야함.
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("직사각형을 만들기 위한 가로, 세로 길이 입력");
//		System.out.print("가로>");
//		int integer01 = scan.nextInt();
//		System.out.print("세로>");
//		int integer02 = scan.nextInt();
//		
//		for(integer01 = integer01; integer01 > 0; integer01--) {
//			System.out.println("*");
//		}
		
		/*
		 * for(int i = 1; i <= integer01; i++) {
		 *  for(int j = 1; j <= integer02; j++) {
		 *  	if(i==1 || i==h) {
		 *  		System.out.print("*");
		 *  	} else {
		 *			if(j == 1 || j == w) {
		 *				System.out.print("*");
		 *  		} else {
		 *  			System.out.print(" ");
		 *  		}
		 *   	}
		 *  }
		 *}
		 */
//		scan.close();
	}
}
