package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		// 100 ~ 95 또는 90 ~ 85 VIP
		// 80 ~ 75 또는 65 ~ 60 GOLD
		// 나머지 NORMAL
		
		double grade = 75.0;
		
		if((grade <= 100 && grade >= 95) || (grade <= 90 && grade >= 85)) {
			System.out.println("VIP");
		} else if((grade <= 80 && grade >= 75) || (grade <= 65 && grade >= 60)) {
			System.out.println("GOLD");
		} else {
			System.out.println("NORMAL");
		};
	}
}

