package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		double sum = 90.0;
		
		String grade = (sum >= 90.0) ? "VIP" : (sum >= 70.0) ? "GOLD" : "SILVER";
		System.out.println(grade);
	}
}
