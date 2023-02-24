package ifcontrol;

public class P90 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		// 두 가지 수의 최댓값과 최솟값을 구하시오
		int max = 0;
		int min = 0;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		System.out.printf("MAX: %d, MIN: %d", max, min);
	}
}