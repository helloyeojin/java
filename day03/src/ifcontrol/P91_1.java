package ifcontrol;

public class P91_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		
		// 세 수의 최댓값과 최솟값을 구하시오
		int max = a;
		
		if (b >= max) {
			max = b;
		} else if (c >= max) {
			max = c;
		}
		
		int min = a;
		
		if (b <= min) {
			min = b;
		} else if (c <= min) {
			min = c;
		}
		
		
		System.out.printf("MAX: %d, MIN: %d", max, min);
	}
}