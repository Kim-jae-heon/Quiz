package quiz01;

import java.util.Arrays;

public class Quiz15 {
	public static void main(String[] args) {
		//변수의 스왑
//		int x = 50;
//		int y = 100;
//		//하나의 가짜상자를 이용하면 내용물을 그대로 둔 상태로 x와 y를 스왑할 수 있다.
//		//가상의 상자 temp(가짜)작성
//		int temp;
//		
//		temp = y;
//		y = x;
//		x = temp;
//		
//		System.out.println("x값은 " + x + " " + "y값은 " + y);
//		어떤 값을 바꾸고싶다면 위와같은 방식을 이용하면 된다.
		
		//절대 중복되지 않는 값을 3개 추출해서 새로운 배열을 만드는 과정을 보일 것.
		int[] arr = {1,2,3,4,5,6,7,8,9};
		//랜덤 인덱스값을 이용하여 뽑는다면 같은 수가 뽑힐 수 있음. 따라서, 배열 자체를 섞어서 뽑을 필요. 섞어서 가장 앞에 있는 것 3개를
		//뽑는다.
		
		//1. 랜덤수를 생성하고 랜덤 index번째 값과 위치를 변경.
		//이해가 잘 안되어서 우선 하나만 잡고 했는데, 이마저도 결과가 이상함. 왜 그럴까? 이유를 모르겠음.. arr[ran]의 그릇을 만들면
		//오류가남. 왜그럴까?
		int ran = (int)(Math.random()*9);
		System.out.println("랜덤값은: "+ran);
		int temp = 0;
		//이렇게 하면 중복이 생김... 중복을 해결해야 함.
		//0자체도 고정이 아님. 0도 바뀌어야 함. 어떻게 바뀌어야 하는데? 랜덤하게.
		temp = arr[ran];
		arr[ran] = arr[0];
		arr[0] = temp;
		//랜덤의 정의자체를 모르겠음. 어떻게 만들어야 랜덤이 되는지
		
		System.out.println(Arrays.toString(arr));
		
		
				
		/*
		 * for(int i = 0; i < arr.length; i++) {
		 * 
		 * 	int ran = (int)(Math.random() * arr.length);
		 *	
		 *	int temp = arr[i];
		 *	arr[i] = arr[ran];
		 *	arr[ran] = temp;
		 *	System.out.println(Arrays.toString(arr)); 
		 * }
		 * 
		 */
		
		
		//2. 0~2번째 까지의 값을 길이가 3인 배열에 담아주면 된다.
		/*
		 * int[] newArr = new int[3];
		 * for(int i = 0; i < newArr.length; i++) {
		 * 	newArr[i] = arr[i];
		 * }
		 * 
		 * System.out.println(Arrays.toString(newArr));
		 */
	}
}
