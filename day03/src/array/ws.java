package array;

public class ws {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		double avg = 0.0;
		
//		for(int i=0; i< a.length; i++) {
//			sum += a[i];
//		}
		
		for(int data:a) {
			sum += data;
		}
		
		avg = (sum * 1.0) / a.length;
		
		System.out.printf("sum = %d, average = %4.2f", sum, avg);
	}

}
