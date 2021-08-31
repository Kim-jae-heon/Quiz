package quiz02;

import java.util.Arrays;

public class Squirrel {
	
	String squirrel;
	int height;
	String[] food;
	
	void info() {
		System.out.println("다람쥐 이름 : "+squirrel);
		System.out.println("다람쥐 키 : "+height+"cm");
		System.out.println("다람쥐 먹이 : "+Arrays.toString(food));
	}
}
