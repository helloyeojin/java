package ifcontrol;

public class P91_2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		
		int max = 0;
		int min = 0;
		
		// 세 수의 최댓값과 최솟값을 구하시오
		if (a > b) {
			max = Math.max(a, c);
			min = Math.min(b, c);
		} else {
			max = Math.max(b, c);
			min = Math.min(a, c);
		}
		
		System.out.printf("MAX: %d, MIN: %d", max, min);
	}
}