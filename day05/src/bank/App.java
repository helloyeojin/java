package bank;

public class App {

	public static void main(String[] args) {
		Account acct = new Account("어렌지", 10000);
		System.out.println(acct);
		
		acct.withdraw(20000);
		acct.deposit(30000);
		System.out.println(acct);
	}

}
