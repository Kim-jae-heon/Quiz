package quiz01;

public class MethodQuiz02 {
	public static void main(String[] args) {
		//프로그래머스 난이도 1번
		//java 함수 는 매개변수 로 숫자를 받습니다.
		//매개변수 숫자길이만큼 패턴"자바자바자바...."를 리턴하는 함수를 완성하세요.
		//1이면 자, 2이면 자바, 3이면 자바자, 4이면 자바자바
		
		System.out.println(method1(5));
		System.out.println(method2(5));
		System.out.println(primeNum(5));
		System.out.println(sumNum(8,1));
		System.out.println(sumNn(1234));
	}
	
	static String method1(int a) {
		String str = "";
		for(int i = 1 ; i <= a ; i++) {
			if(i%2==1) {
				str = str + "자";
			} else {
				str = str + "바";
			}
		}
		return str;
	}

	//1.자연수 n을 입력 받아 n의 약수를 모두 더한 값을 리턴하는 함수를 완성하세요.
	static int method2(int n) {
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	//1. 1부터 입력 받은 숫자 a사이에 있는 소수의 개수를 반환하는 함수 primeNum을 완성하세요.
	//2. 소수는 1과 자기 자신으로만 나누어지는 수
	static int primeNum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count==2) {
				sum++;
			}
		}
		return sum;
	}

	//1. sumNum은 매개변수 2개를 받습니다.
	//2. 두 매개변수 사이에 속한 모든 정수의 합을 구하는 sumNum을 완성하세요
	//3. 두 매개변수 사이의 크기는 정해지지 않았습니다.
	static int sumNum(int a, int b) {
		int sum = 0;
		if(a < b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		} else if (a > b) {
			for(int j = b; j <= a; j++) {
				sum += j;
			}
		}
		return sum;
	}
	/*
	 * 자연수 자리수의 합 구하기
	 * 자연수 n이 매개변수로 주어지면 n자리수의 합을 구해서 return하는 메서드
	 * 조건
	 * n은 1억 이하의 자연수
	 * n의 자료형을 바꾸면 안된다. 숫자를 문자로 바꾸지말라는 소리이다.
	 */
	
	static int sumNn(int a) {
		int sum = 0;
		for(int i = 100000000; i >= 1; i = i/10) {
			int quotient = a/i;
			if(a/i > 0) {
				sum += quotient;
				a = a - quotient*i;
			} 
		}
		return sum;
	} 
	//아래는 코드테스트의 1난이도 정도이다. 2~3난이도 정도 되면 10시간 씩 걸릴 수 있음. 
	
	/*static int sumNn(int a){
	 * 
	 * int sum = 0;
	 * for(int i = 100000000; i >= 1; i /= 10) {
	 * 	if(a/i != 0){
	 * 		sum += (a / i);
	 * 		a %= i;
	 * 	}
	 * }
	 * return 0;
	 *}
	 * 
	 */

}
