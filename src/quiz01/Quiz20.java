package quiz01;

import java.util.Arrays;

public class Quiz20 {
	public static void main(String[] args) { //한 번 더!
		//중첩반복문을 이용해서 정렬
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		//정렬이라는 것을 하려면 변수의 스왑이라는 것을 알아야 한다. 
		//두 번째는 정렬의 방법 알고리즘을 알고 있어야 함. 알고리즘은 10개가 있음. 가장 쉬운 것을 본다.
		//가장 기본이 되는 알고리즘으로는 선택 정렬, 가장 느린 정렬로 버블, 가장 빠른 친구로는 퀵 정렬이 있다.
		//선택과 버블 정렬은 지금 할 수 있다.
		//정렬을 왜 알아야 할까? 값을 찾을 때 가장 빠르게 탐색을 하려면 정렬이 되어야함. 값을 찾기 전 차순 정렬이 되어있다면 값을 찾기가
		//쉽다. 
		
		//가장 쉬운 선택정렬의 방법은?
		//첫 번째 값이랑 그 다음 값과 비교한 뒤 큰 값을 뒤로 보낸다. 그 다음 값이 크다면 내비둠. 첫 번째 값과 세 번째 값을 비교한다.
		
		//버블형식과 유사하게 푼 로직. 
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = arr.length - i; j <= 6 ; j++) {
				System.out.println(i+"-"+j);
				if(arr[arr.length - 1 - i] > arr[j]) {
					int temp = arr[arr.length - 1 - i];
					arr[arr.length - 1 - i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		//여기는 묶음에 대한 개념을 생각한 것이 아닌 첫번째 수 고정하고 나머지 비교의 형식을 이용하였다.
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i+1; j < arr.length; j++) {
				
				System.out.println(i + "-" + j);
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
			}
		}
		
//		Arrays.sort(arr); //자바에서 제공해주는 자동정렬 기능이라는데 내 컴퓨터에서는 안뜨네..? 오름차순은 이 방법을 사용.
		//복잡한 경우의 수를 가진 것은 전부 다 인간이 만들어야 한다. 
		
//		System.out.println(Arrays.toString(arr));
	}
}
