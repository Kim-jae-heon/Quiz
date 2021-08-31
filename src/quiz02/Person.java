package quiz02;

public class Person {
	
	String name;
	int age;
	int tall;
	//생성자를 직접 만들게되면, 자바가 기본생성자를 자동으로
	//생성하지 않습니다.
	Person(){
		
	}
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	void info() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("신장:" + tall);
	}
	
}
