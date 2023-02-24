package ifcontrol;

public class P85 {

	public static void main(String[] args) {
		String grade = "VIP";
		System.out.println("Start");
		if(grade.equals("VIP")) {    
			System.out.println("VIP 카드는 이 기기에서 사용 불가합니다");
			return;
		}
	System.out.println("End");
	}

}
