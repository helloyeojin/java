package bank;

public class Account {
	private String accNo;
	private double balance;
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNo();
	}
	
	public Account(double balance) throws Exception {
		this();
		if(balance < 0) {
			throw new Exception("ER01");
		}
		this.balance = balance;
	}

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void withdraw(double money) throws Exception {
		if(money <= 0) {
			throw new Exception("ER02");
		}
		if(balance < money) {
			throw new Exception("ER03");
		}
		balance -= money;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
