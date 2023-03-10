package ws0307;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {
		
	}
	public BalanceInsufficientException(String msgcode) {
		super(msgcode);
	}
}
