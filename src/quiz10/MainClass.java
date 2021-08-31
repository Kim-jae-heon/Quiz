package quiz10;

public class MainClass {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.getMonitor().info();
		
		//위의 방법을 풀어서 써놓으면 아래와 같다.
		Monitor monitor = computer.getMonitor();
		monitor.info();
	}
}
