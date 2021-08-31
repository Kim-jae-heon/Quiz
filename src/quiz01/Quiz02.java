package quiz01;

public class Quiz02 {
	public static void main(String[] args) {
		//1. 1~100까지 랜덤한 수를 만들고 짝, 홀수를 판별
		int ranNum = (int)(Math.random()*100)+1;
		if(ranNum % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		//삼항 연산식으로 쓰기
		System.out.println(ranNum%2 == 0? "짝수" : "홀수");
		
		System.out.println("===============");
		//2. -5~5까지 랜덤한 수를 만들고, 절대값으로만 출력
		int ranNumTwo = (int)(Math.random()*11)-5;
		//좋은 방법으로 ~부터 ~미만을 활용하는 방법을 사용해도 된다.
		//int ranNumTwo = 5 - (int)(Math.random()*11);
		//System.out.println("랜덤값" + ranNumTwo);
		//System.out.println(ranNumTwo < 0 ? -r2 : r2);
		//결과가 잘 나오면 과정이 달라도 맞는 것이다. 
		if(ranNumTwo < 0) {
			System.out.println(ranNumTwo * -1);
		} else {
			System.out.println(ranNumTwo);
		}
		
		System.out.println("===============");
		//삼항연산자 안에는 삼항연산자가 들어갈 수 있다. 중첩으로 들어갈 수 있다는 것. 소괄호만 잘 쳐주면 된다. 
		//3. 1~150까지 랜덤한 수를 사과의 개수로 가정.
		//bucket이라는 변수는 사과를 담을 수 있는 양
		//필요한 bucket의 갯수를 구하라. 상자는 10개의 사과를 담을 수 있다.
		int apple = (int)(Math.random()*150)+1;
		int bucket = (int) apple/10;
		System.out.println(apple);
		if(apple%10 > 0) {
			System.out.println(bucket +1);
		} else {
			System.out.println(bucket);
		}
		
		/* 아래와 같은 방법도 있다. 
		 * int bucket = 10;
		 * int apple = (int)(Math.random() * 150)+1;
		 * System.out.println("사과의 개수" +apple);
		 * 
		 * System.out.println("바구니의 개수: " + (apple % bucket == 0? apple / bucket : apple / bucket + 1)
		 */
		//한줄로 써보는 연습을 해보자!
	}
}
