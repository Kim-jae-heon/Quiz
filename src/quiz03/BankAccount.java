package quiz03;

public class BankAccount {
	/* 1.멤버 변수 - 예금주 이름(name: String), 비밀번호(password: String), 잔액(balance: int)로 선언
	 * 2.생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자를 선언하세요.
	 * 3. 메서드 입금기능 메서드(deposit: void),  출금기능 메서드(withDraw: void), 잔액 조회 메서드(getBalance: int)
	 */
	String name;
	String password;
	int balance;
	
	BankAccount(String pName, String pPassword, int pBalance){
		name = pName;
		password = pPassword;
		balance = pBalance;
		
		System.out.println(name + " " + password + " " + balance);
	}
	
	void deposit(int a) {
		balance += a;
		System.out.println(a+"원 입금합니다");
	}
	
	void withDraw(int a) {
		balance -= a;
		System.out.println(a+"원 출금합니다");
	}
	
	int getBalace() {
		
		return balance;
	}
}
