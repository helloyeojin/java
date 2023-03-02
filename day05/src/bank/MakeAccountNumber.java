package bank;

import java.util.Calendar;

public class MakeAccountNumber {
	
	public static String makeAcctNum() {
		String acctNum = "";
		Calendar cal = Calendar.getInstance();
		acctNum = "" + cal.get(Calendar.YEAR) 
					+ (cal.get(Calendar.MONTH)+1) 
					+ cal.get(Calendar.DAY_OF_MONTH) 
					+ cal.get(Calendar.MILLISECOND);
		return acctNum;
	}
}
