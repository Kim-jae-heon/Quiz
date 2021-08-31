package quiz02;

public class SquirrelMain {
	
	public static void main(String[] args) {
		
		Squirrel squir = new Squirrel();
		squir.squirrel = "다람";
		squir.height = 18;
		squir.food = new String[] {"도토리","군밤"};
		
		squir.info();
		
		System.out.println("-----------------");
		
		Squirrel squirTwo = new Squirrel();
		squirTwo.squirrel = "돼람";
		squirTwo.height = 21;
		squirTwo.food = new String[] {"도토리"};
		
		squirTwo.info();
	}
}
