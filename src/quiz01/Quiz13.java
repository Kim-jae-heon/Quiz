package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {

		// 1. 17520원을 줄 때 1000원짜리 17개 500원짜리 1개 10월짜리 2개를 줄 수 있도록 개발해볼 것.
		int[] arr = { 1000, 500, 100, 50, 10 }; // 동전
		int money = 18650; // 금액
		int total = 0;
		while (total < arr.length) {
			if (money / arr[total] > 0) {
				System.out.println("1000원짜리" + money / arr[total] + "장");
				money = money - (money / arr[total]) * arr[total];
				total++;
			} else {
				total++;
			}
			if (money / arr[total] > 0) {
				System.out.println("500월짜리" + money / arr[total] + "개");
				money = money - (money / arr[total]) * arr[total];
				total++;
			} else {
				total++;
			}
			if (money / arr[total] > 0) {
				System.out.println("100원짜리" + money / arr[total] + "개");
				money = money - (money / arr[total]) * arr[total];
				total++;
			} else {
				total++;
			}
			if (money / arr[total] > 0) {
				System.out.println("50원짜리" + money / arr[total] + "개");
				money = money - (money / arr[total]) * arr[total];
				total++;
			} else {
				total++;
			}
			if (money / arr[total] > 0) {
				System.out.println("10원짜리" + money / arr[total] + "개");
				money = money - (money / arr[total]) * arr[total];
			} else {
				total++;
			}
		}
		System.out.println("계산 완료");

		// 2. 양수를 입력 받아, 입력 받은 수만큼의 크기에 해당하는 배열을 생성하세요.
		// 배열에 1~입력 받은 수 까지 차례대로 값을 넣어보세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수를 입력해주세요.");
		System.out.print(">");
		int integer = scan.nextInt();
		int[] arr02 = new int[integer];
		int sum = 0;
		while (sum < integer) {
			arr02[sum] = sum + 1;
			sum++;
		}
		System.out.println(Arrays.toString(arr02));
		// 아 좀만 더 생각했으면 됐는데 왜 생각을 못했을까... 아쉽..
	}
}
