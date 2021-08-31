package quiz10;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	private KeyBoard keyBoard;
	private Mouse mouse;
	private Monitor monitor;
	
	public Computer() {
		// TODO Auto-generated constructor stub
		//밑에 친구들이 없다면 main에 있는 코드들은 에러가 난다.
		//new Computer();의 값이 null이기 때문에.
		this.keyBoard = new KeyBoard();
		this.mouse = new Mouse();
		this.monitor = new Monitor();
	}

	public Computer(KeyBoard keyBoard, Mouse mouse, Monitor monitor) {
		super();
		this.keyBoard = keyBoard;
		this.mouse = mouse;
		this.monitor = monitor;
	}
	
	public void computerInfo() {
		keyBoard.info();
		mouse.info();
		monitor.info();
	}

	public KeyBoard getKeyBoard() {
		return keyBoard;
	}

	public void setKeyBoard(KeyBoard keyBoard) {
		this.keyBoard = keyBoard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
}
