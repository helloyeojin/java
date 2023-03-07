package com.kbstar.dto;

public class AccountDTO {
	private String accNum;
	private String accName;
	private double balance;
	public AccountDTO() {
	}
	
	public AccountDTO(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}

	public AccountDTO(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
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
