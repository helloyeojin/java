package bank;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;
	
	// Constructor - 음수 예외 상황 
	public Account() {
	}
	
	public Account(String accNo, String name, String accHolder, double balance) throws MinusException {
		if (balance < 0) {
			throw new MinusException("M01_입력금액 오류");
		}
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	
	// 입금 - 음수 예외 상황 
	public void deposit(double money) throws MinusException {
		if (money <= 0) {
			throw new MinusException("M01_입력금액 오류");
		}
		this.balance += money;
	}
	
	
	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황 
	public void withdraw(double money) throws MinusException, BalanceInsufficientException {
		if (money <= 0) {
			throw new MinusException("M01_입력금액 오류");
		}
		if (this.balance < money) {
			throw new BalanceInsufficientException("I02_잔고 부족: " + (money-balance) + "원이 부족합니다.");
		}
	}
}
