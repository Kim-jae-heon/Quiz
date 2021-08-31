package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		//1. 키(double)와 나이(int)를 입력 받으세요
		Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키>");
		double cm = scan.nextDouble();
		
		System.out.print("나이>");
		int age = scan.nextInt();
		
		System.out.println("===============");
		
		//2. 키가 140이상이고, 나이가 8세 이상이라면 "놀이기구 탑승 가능" 아니라면, "놀이기구 탑승불가"를 출력
		if(cm >= 140 && age>= 8) {
			System.out.println("놀이기구 탑승 가능");
		} else {
			System.out.println("놀이기구 탑승 불가");
		}
		
		scan.close();
	}
}
