package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		/*
		 * 버블정렬 - 기사시험에도 있다. 그러나 속도가 가장 느리기로 유명하다. 큰 값을 뒤로 밀어주는 역할을 한다. 1번째와 2번째 비교,
		 * 2번째와 3번째 비교, 3번째와 4번째 비교... 6번째와 7번째 비교하여 가장 큰 값을 뒤로 밀어 넣음으로 첫 번째 회전을 마무리한다.
		 * 총 length-1번째 회전 두 번째 회전은 어떻게 할 것인가? 가장 큰 값은 마지막에 들어가 있으니 마지막은 회전할 필요가 없다. 마지막
		 * 회전을 제외하므로 5번을 회전.
		 * 
		 * 바깥에 있는 반복문은 비교할 대상의 회전 수가 된다. 일반적인 경우 대비 조건문도 반대로, 증감식도 반대로 안쪽에 있는 반복문은 무엇이 될
		 * 것인가? j번째와 j+1번째 비교가 들어갈 수 있어야 한다.
		 */
		int[] arr = { 5, 23, 1, 43, 100, 200, 40 };
		for (int i = arr.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
//				System.out.println(i +"-"+j);
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		/*
		 * for(int i = arr.length-1; i > 0; i--){
		 * 	for(int j = 0; j < i; j++) {
		 * 		System.out.println(i + "-" + j);
		 * 		
		 * 		if(arr[j] > arr[j+1]){
		 * 			int temp = arr[j];
		 * 			arr[j] = arr[j+1];
		 * 			arr[j+1] = temp;
		 * 		}
		 * 	 }
		 * 	 System.out.println(Arrays.toString(arr));
		 * }
		 * 
		 * 나중에 공부하게 된다면 퀵 정렬 꼭 볼 것.
		 * 절반을 갈라서 중앙 수보다 작으면 왼쪽, 크면 오른쪽으로 몰아넣음. 이 로직을 계속 반복
		 * 복잡해보이지만 배열의 크기가 매우 큰 경우 엄청 빠르고 유용.
		 */
	
		System.out.println(Arrays.toString(arr));
	}
}
