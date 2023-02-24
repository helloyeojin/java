package ifcontrol;

public class P91 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		
		// 세 수의 최댓값과 최솟값을 구하시오
		int max = 0;
		int min = 0;
		
		if (a > b) {
			if (b > c) {
				max = a;
				min = c;
			} else {
				if (a > c) {
					max = a;
					min = b;
				} else {
					max = c;
					min = b;
				}
			}
		} else {
			if (b < c) {
				max = c;
				min = a;
			} else {
				if (a > c) {
					max = b;
					min = c;
				} else {
					max = b;
					min = a;
				}
			}
		}
		
		System.out.printf("MAX: %d, MIN: %d", max, min);
	}
}