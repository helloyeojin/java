package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		String grade = "VIP";
		String gender = "F";
		double sum = 95.0;
		
		System.out.println("Start");
	
		if(gender.equals("M")) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
	
		if (gender.equals("M")) {
			if(sum >= 90) {
				System.out.println("MVIP");
			} else if(sum >= 80) {
				System.out.println("MGOLD");
			} else {
				System.out.println("MNORMAL");
			}
		} else {
			if(sum >= 90) {
				System.out.println("FVIP");
			} else if(sum >= 80) {
				System.out.println("FGOLD");
			} else {
				System.out.println("FNORMAL");
			}
		}
		
		switch(grade) {
		case "FVIP":
		case "MVIP":
			sum += 100;
			break;
		case "FGOLD":
		case "MGOLD":
			sum += 90;
			break;
		default: sum += 10;
		}
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		System.out.println("End");
	}
}