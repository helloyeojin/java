package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		// 짝수만 구하시오
		// i%2 ==0
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("Start!");
		int cnt = 0;
		for(int i=1; i<=100; i++) { 
			if (i % 2 == 0 ) {
				sum += i;
				cnt++;   // 1부터 10까지 
			}
		if(i == 8) {
			break;
		}
		}

		avg = (sum * 1.0) / cnt;
		
		System.out.printf("sum = %d, average = %4.2f \n", sum, avg);
		System.out.println("End!");
	}

}
