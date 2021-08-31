package quiz02;

public class Tv {
	
	String company = "LG";
	int channel;
	boolean power;
	
	int changeChannel(int ch) {
		//채널 값 바꾸기
		channel = ch;
		System.out.println(channel + "변경");
		return channel;
	}
	
	String power() {
		//멤버 변수를 메서드 안에서 자유자재로 사용할 수 있어야 한다.
		if(power) {
			System.out.println("전원을 껐습니다.");
			power = false;
			return "끄다";
		} else {
			System.out.println("전원을 켰습니다.");
			power = true;
			return "켜다";
		}
	}
	
	void info() {
		System.out.println("모델:" + company);
		System.out.println("채널:" + channel);
	}
	
	
}
