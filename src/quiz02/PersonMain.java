package quiz02;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 180);
		p1.info();
		
		Person p2 = new Person();
		p2.name = "김길동";
		p2.age = 30;
		p2.tall = 170;
		
		//2. 일상생활에서 있을 법한 사물, 동물을 클래스
		//로 표현하고 객채로 생성하기!
	}
}
