package quiz08;

public class SuperSonicAp extends Airplane {

	/* ************부모클래스는 수정하지 않습니다***********
	    * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	    * 2. flyMode int형 변수를 선언하세요
	    * 3. fly() 메서드를 오버라이딩합니다
	    * fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	    * flyMode 0이라면, super를 통해 부모님의 메서드를 호출
	      4. info() - 부모의 메서드를 이용해서, 비행기의 이름을 반환하는 메서드
	    */
	SuperSonicAp(String name){
		super(name);
	}
	
	int flyMode;
	void fly() {
		if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		} else {
			super.fly();
		}
	}
	
	void info() {
		System.out.println(super.name);
	}

}
