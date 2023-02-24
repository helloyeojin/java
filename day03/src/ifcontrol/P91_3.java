package ifcontrol;

public class P91_3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		
		// 세 수의 최댓값과 최솟값을 구하시오
		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		
		System.out.printf("MAX: %d, MIN: %d", max, min);
	}
}