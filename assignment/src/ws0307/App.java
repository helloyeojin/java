package ws0307;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Account acc = null;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command: (c, w, d, s, q)");
			String cmd = sc.next();
			
			//프로그램 종료 
			if(cmd.equals("q")) {
				System.out.println("Exit the program");
				break;
				
			//계좌 개설 	
			} else if(cmd.equals("c")) {
				System.out.println("Create Account: ");
				System.out.println("Input Account Number: ");
				String accNo = sc.next();
				System.out.println("Input Product Type: ");
				String name = sc.next();
				System.out.println("Input Your Name: ");
				String accHolder = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());
				
				try {
					acc = new Account(accNo, name, accHolder, balance);
					System.out.println(acc);
				} catch (MinusException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}	
			
			// 계좌 출금 
			} else if(cmd.equals("w")) {
				System.out.println("Withdraw: ");
				System.out.println("Input Withdrawl Amount: ");
				double money =  Double.parseDouble(sc.next());
				try {
					acc.withdraw(money);
					System.out.println(acc);
				} catch (MinusException | BalanceInsufficientException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			
			// 계좌 입금 
			} else if(cmd.equals("d")) {
				System.out.println("Deposit:");
				System.out.println("Input Deposit Amount: ");
				double money =  Double.parseDouble(sc.next());
				try {
					acc.deposit(money);
					System.out.println(acc);
				} catch (MinusException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			
			// 계좌 조회 
			} else if(cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acc);
			}
		}
		sc.close();
	}

}
