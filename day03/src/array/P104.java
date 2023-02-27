package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Random r = new Random();
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = r.nextInt(99)+1;
		}
		
		System.out.println(Arrays.toString(arr));   // 이렇게 출력하면 배열에 뭐가 들어가있는지 정보 확인가능 
		
		for(int a:arr) {
			System.out.printf("%d \t", a);
		}
		
		// 배열의 합과 평균을 구하시오 
		
		int sum = 0;
		double avg = 0.0;
		
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
		for(int a:arr) {
			sum += a;
		}
		avg = (sum*1.0)/(arr.length);
		
		System.out.printf("\nsum = %d, average = %4.2f", sum, avg);
	}

}
