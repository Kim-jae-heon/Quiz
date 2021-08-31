package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		// 1. 1~100까지 정수 중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력. 
		int a = 1;
		while (a <= 100) {
			if (a % 3 == 0) { //여기서 or을 써서 출력할 수도 있다.
				System.out.print(a + ",");
			} else if (a % 4 == 0) {
				if (a != 100) {
					System.out.print(a + ",");
				} else if (a == 100) {
					System.out.print(a);
				}
			}
			a++;
		}
		System.out.print("\n" + "========================================================" + "\n");
		// 2. 1~200까지 정수 중 5의 배수의 합.
		int b = 1;
		int sum = 0;
		while (b <= 200) { //작은 수일 때 맞으면 큰 수일 때도 맞다. 검사는 작은 수를 넣어서 해볼 것.
			if (b % 5 == 0) {
				sum = sum + b;
			} else {
				b++;
			}
			b++;
		}
		System.out.println(sum);
		System.out.println("========================================================");

		// 3. 1~200까지 정수 중 4의 배수이면서 8의 배수가 아닌 수의 갯수?
		int c = 1;
		int sumTwo = 0;
		while (c <= 200) { 
			if (c % 4 == 0) {
				if (c % 8 == 0) {
					c++;
				} else {
					sumTwo = sumTwo + 1;
				}
			}
			c++;
		}
		System.out.println(sumTwo);
		System.out.println("========================================================");
		// 4. 두 정수를 입력 받아서 두 정수 사이의 합(같은 경우는 없다고 가정)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두 개를 입력해주세요.");
		System.out.println("첫번째 정수");
		System.out.print(">");
		int integer01 = scan.nextInt();
		System.out.println("두번째 정수");
		System.out.print(">");
		int integer02 = scan.nextInt();
		int sumThree = 0;
		//힌트는 큰 수, 작은 수 먼저 구별 하고 반복문을 세우는 것.
		//값을 받을 때 앞 뒤에 어디에 큰 값이 들어올지 모르므로 일단 이 두가지를 고려할 필요가 있음. 적용할 수 있는 것은 if문
		//큰 수와 작은 수를 구별한 뒤에 만들어주면 되기 때문에!! 삼항연산자를 활용해보도록 한다. 
		//int max = integer01 > integer02 ? integer01 : integer02;
		//int min = integer01 < integer02 ? integer01 : integer02;
		//int result = 0;
		//while(min <= max){ //조건문이 반드시 이렇게 만들어질 필요는 없다. 참 거짓이기 때문에..!
		//	result += min;
		//	min++;
		//}
		if(integer01 > integer02) {
			while(integer01 >= integer02) {
				sumThree = sumThree + integer02;
				integer02 = integer02 + 1;
			}
			System.out.println(sumThree);
		} else if (integer01 < integer02) {
			while(integer01 <= integer02) {
				sumThree = sumThree + integer01;
				integer01 = integer01 + 1;
			}
			System.out.println(sumThree);
		}
		scan.close();
	}
}
