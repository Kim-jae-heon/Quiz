package quiz01;

public class Quiz08 {
	public static void main(String[] args) {
		String[] arr = {"안녕하세요", "hi", "ni hao", "#$%"};
		//랜덤한 인덱스가 선택되도록 할 것. Math.random()을 이용하여 0~3까지 랜덤수를 발생. 해당 인덱스를 적용하여 선택된 값이
		//한국어, 영어, 중국어, 외계어인지 구별하면 됩니다.
		
		int ranNum = (int) (Math.random()* arr.length); //만약 배열에서 하나를 빼버리면 어떻게 될까? ranNum은 작동하지 않는다.
		//따라서 유동적으로 만들어주려면 arr.length를 응용하면 된다..! 기존에는 그냥 4를 곱했었음!
				
		switch(arr[ranNum]) { //여기에 ranNum이 들어가도 무방하다. 다만 그렇게 되면 case에 숫자를 써주어야 함.
		case "안녕하세요":
			System.out.println("한국어");
			break;
		case "hi":
			System.out.println("영어");
			break;
		case "ni hao":
			System.out.println("중국어");
			break;
		case "#$%":
			System.out.println("외계어");
			break;
		}
	}
}