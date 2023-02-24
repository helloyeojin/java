package whilecontrol;

public class P93_2_while {

	public static void main(String[] args) {
		System.out.println("Start!");
		int i = 1;
		int sum = 0;
		double avg = 0.0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		avg = (sum * 1.0) / (i-1); 
		System.out.printf("sum: %d, average: %4.2f \n", sum, avg);
		System.out.println("End!");
	}

}
