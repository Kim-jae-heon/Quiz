package quiz03;

public class BankAccountMain {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("홍길동","1234",3600);
		
		account.deposit(800);
		account.withDraw(1900);
		
		int bal = account.getBalace();
		System.out.println(account.name + "님의 잔액은:" + bal + "원 입니다");
	}
}
