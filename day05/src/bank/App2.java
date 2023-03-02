package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acct = null;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command(c,w,d,s,q)...");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Okay Bye...");
				break;
				
			} else if(cmd.equals("c")) {
				System.out.println("Create Account:");
				System.out.println("Input Name:");
				String name = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());
				
				acct = new Account(name, balance);
				System.out.println(acct);
				
			} else if(cmd.equals("w")) {
				System.out.println("Withdraw:");
				System.out.println("Input Withdraw Money..");
				double money =  Double.parseDouble(sc.next());
				acct.withdraw(money);
				System.out.println(acct);
				
			} else if(cmd.equals("d")) {
				System.out.println("Deposit:");
				System.out.println("Input Deposit Money..");
				double money =  Double.parseDouble(sc.next());
				acct.deposit(money);
				System.out.println(acct);
				
			} else if(cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acct);
			}	
		}
		sc.close();
	}
}


