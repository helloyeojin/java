package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		// 100 ~ 90 VIP
		// 89 ~ 80 GOLD
		// 79 ~ 70 SILVER
		// 69 ~ 60 BRONZE
		// 59 이하 NORMAL
		double grade = 75.0;
		
		if(grade >= 90) {
			System.out.println("VIP");
		} else if(grade >= 80) {
			System.out.println("GOLD");
		} else if(grade >= 70) {
			System.out.println("SILVER");
		} else if(grade >= 60) {
			System.out.println("BRONZE");
		} else {
			System.out.println("NORMAL");
		};
	}
}