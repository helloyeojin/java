package bank;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {
		
	}
	public BalanceInsufficientException(String msgcode) {
		super(msgcode);
	}
}
