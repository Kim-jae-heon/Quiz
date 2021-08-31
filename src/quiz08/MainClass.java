package quiz08;

public class MainClass {
	
	public static void main(String[] args) {
	
		SuperSonicAp sonic = new SuperSonicAp("F-33");
		
		sonic.info();
		sonic.fly();
		sonic.flyMode = 1;
		sonic.fly();
	}
}
