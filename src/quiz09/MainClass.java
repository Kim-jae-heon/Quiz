package quiz09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("-----------문제1------------");
		/* 문제1
		 * 클래스 User를 생성하세요
		 * 멤버변수 name: String, rrn : int, int age를 선언 후 은닉 처리합니다.
		 * User클래스에는 기본생성자, 모든 멤버변수를 초기화하는 생성자 2개를 생성하세요.
		 * main에서 User객체를 생성 후
		 *  (홍길동, 123123, 20)을 저장하고 값을 확인하세요
		 */
		
		User user = new User();
		user.setName("홍길동");
		user.setRrn(123123);
		user.setAge(20);
		System.out.println(user.getName());
		System.out.println(user.getRrn());
		System.out.println(user.getAge());
		
		System.out.println("-----------문제2------------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다)
		 * 2. 두번째 User객체를 생성하세요 ("김길동, 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 for문을 사용하여 모든변수를 출력하세요
		 */
		
		User[] arr = new User[2];
		User userTwo = new User();
		userTwo.setName("김길동");
		userTwo.setRrn(456456);
		userTwo.setAge(30);
		arr[0] = user;
		arr[1] = userTwo;
		
		for(User a : arr) {
			System.out.println(a.getName());
			System.out.println(a.getRrn());
			System.out.println(a.getAge());
		}
				
		
//		for(User[] a: arr) {
//			System.out.println(a);
//		}
		
		System.out.println("-----------문제3------------");
		/* 문제3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요
		 * 2. 5번 회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age를 입력받으세요
		 * 3. while문 안에서 User 객체를 생성하고, 입력받은 name과 rrn, age를 저장하세요
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명)을 이용하여 저장되는 값을 확인하세요.
		 */
		
		User[] arrTwo = new User[5]; //User배열의 장점? 묶어서 한방에 저장이 가능하다. 
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i <= 5) {
			
			User userThree = new User(); 
			
			System.out.println("이름을 입력하세요.");
			System.out.print(">");
			String name = scan.next();
			
			System.out.println("6자리 숫자를 입력하세요.");
			System.out.print(">");
			int rrn = scan.nextInt();
			
			System.out.println("나이를 입력하세요.");
			System.out.print(">");
			int age = scan.nextInt();
			
			userThree.setName(name); //이걸 User userThree = new User(name, rrn, age)로 만들 수 있음
			userThree.setRrn(rrn);
			userThree.setAge(age);
			
			arrTwo[i-1] = userThree;
			
			i++;
		}
		scan.close();
		System.out.println(Arrays.toString(arrTwo));
		
	}

}
