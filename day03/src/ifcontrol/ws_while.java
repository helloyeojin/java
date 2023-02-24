package ifcontrol;

public class ws_while {

	public static void main(String[] args) {
		int i = 1;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt7 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum7 = 0;
		double avg3 = 0.0;
		double avg4 = 0.0;
		double avg7 = 0.0;
		
		while(i<=100) {
			if(i%3 == 0) {
				sum3 += i;
				cnt3++;
			}
			i++;
		} 
		avg3 = (sum3 * 1.0) / cnt3;
		i = 1;
		
		while(i<=100) {
			if(i%4 == 0) {
				sum4 += i;
				cnt4++;
			}
			i++;
		}
		avg4 = (sum4 * 1.0) / cnt4;
		i = 1;
		
		while(i<=100) {
			if(i%7 == 0) {
				sum7 += i;
				cnt7++;
			}
			i++;
		}
		avg7 = (sum7 * 1.0) / cnt7;
		
		
		
		
		System.out.printf("<3의 배수> 합계 = %d, 평균 = %4.2f \n", sum3, avg3);
		System.out.printf("<4의 배수> 합계 = %d, 평균 = %4.2f \n", sum4, avg4);
		System.out.printf("<7의 배수> 합계 = %d, 평균 = %4.2f \n", sum7, avg7);

	}

}
