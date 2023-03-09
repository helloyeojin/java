package com.kbstar.dto;

import com.kbstar.frame.MakeAccountNumber;

public class TransactionDTO {
	private String date;
	private String accNo;
	private double balance;
	private String type;  // in / out
	private String desc;  // 적요 
	
	public TransactionDTO() {
		this.date = MakeAccountNumber.makeTrNum();
	}

	public TransactionDTO(String date, String accNo, double balance, String type, String desc) {
		this();
		this.accNo = accNo;
		this.balance = balance;
		this.type = type;
		this.desc = desc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "TransactionDTO [date=" + date + ", accNo=" + accNo + ", balance=" + balance + ", type=" + type
				+ ", desc=" + desc + "]";
	}
}
