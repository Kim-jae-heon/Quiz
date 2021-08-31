package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {
	public static void main(String[] args) {
		/*
		 * 정수를 매개변수로 받아서,
		 * 1~매개변수 까지의 값을 배열에 랜덤하게 넣어서 반환해주는 함수 seat을 생성하세요.
		 * 
		 * 조건
		 * 1. 숫자는 중복되지 않습니다.
		 * 2. swap을 이용하지 않습니다.
		 * 
		 * 입력 - 5
		 * 출력 - [1~5가 랜덤하게 섞여있는 길이가 5인 배열]
		 * 
		 * 입력 - 10
		 * 출력 - [1~10가 랜덤하게 섞여있는 길이가 10인 배열]
		 */
		
		System.out.println(Arrays.toString(seat(3)));
		System.out.println(Arrays.toString(seat1(10)));
		
	}
	
	static int[] seat(int a) {
		//Math.random()을 이용하여 랜덤한 숫자를 뽑되, 중복되지 않아야 함.
//		int ran = (int)(Math.random()*a+1); //random수 자체도 반복문에 들어가서 생성되어야함 + 중복안되어야함.
		int[] arr = new int[a];
		//배열 안 요소의 합이 a까지의 총합이어야한다고 설정해보자.
		int sum = 0;
		for(int i = 0; i < a; i++) { //Math.random()이 중복이 안되게끔 해야함.
			arr[i] = (int)(Math.random()*a+1);
		}
		
		
		
		return arr;
		
	}
	
	/*
	 * 스왑을 이용하면 로또번호(45개의 숫자)가 배열보다 크므로 로또번호 추출을 못한다.
	 * 중복하지 않기위해 집어넣기 전에 그 앞자리 번호를 찾아보는 방법을 사용해야한다.
	 */
	
	static int[] seat1(int size) {
		int[] arr = new int[size];
		int index = 0;
		
		int count = 0;
		start: while(true) {
			
			int ran = (int)(Math.random()*size)+1;
			//중복검사
			for(int i = 0; i < index; i++) {
				count++;
				
				if(arr[i] == ran) { //실패의 경우
					continue start;
				}
			}
			
			arr[index] = ran;
			index++;
			
			if(index == size) {
				break; //탈출
			}
			System.out.println(count);
		}
		return arr;
	}
}
