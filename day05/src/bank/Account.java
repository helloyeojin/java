package bank;

public class Account {
	private String acctNum;
	private String acctName;
	private double balance;
	public Account() {
		this.acctNum = MakeAccountNumber.makeAcctNum();
	}
	
	public Account(String acctName, double balance) {
		this();
		this.acctName = acctName;
		this.balance = balance;
	}

	public Account(String acctNum, String acctName, double balance) {
		this.acctNum = acctNum;
		this.acctName = acctName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acctNum=" + acctNum + ", acctName=" + acctName + ", balance=" + balance + "]";
	}
	
	public double getBalance() {  //잔액조회 
		return balance;
	}
	
	public void withdraw(double money) {
		if(money <= 0) {
			System.out.println("출금금액을 잘못 입력하셨습니다.");
			return;
		}
		if(this.balance < money ) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.balance -= money;
	}
	
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("입금 금액이 잘못되었습니다.");
			return;
		}
		this.balance += money;
	}
	
}
