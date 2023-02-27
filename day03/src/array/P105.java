package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Random r = new Random();
		
		for(int i=0; i< arr.length; i++ ) {
			arr[i] = r.nextInt(9)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 배열의 합과 평균을 구하시오
		// 홀수 번째의 합과 평균을 구하시오 
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		for(int a:arr) {
			sum += a;
		}
		avg = (sum*1.0)/(arr.length);
		
		int sumOdd = 0;
		int sumOdd2 = 0;
		double avgOdd = 0.0;
		double avgOdd2 = 0.0;
		
		for(int i=0; i< arr.length; i+=2) {    /////////////CHECK///////////////
			sumOdd += arr[i];
		}
		avgOdd = (sum*1.0) / ((int)(arr.length/2) + (arr.length%2));
		System.out.printf("<Type1> sum = %d, average = %4.2f \n", sumOdd, avgOdd);
		
		for(int i=0; i< arr.length; i++) {
			if(i%2 == 0) {     // i%2 == 1로 쓰면 i를 0부터 시작했기 때문에 짝수번째 수들의 합이 출력
				sumOdd2 += arr[i];
				cnt++;
			}
		}
		avgOdd2 = (sum*1.0) / cnt;
		System.out.printf("<Type2> sum = %d, average = %4.2f", sumOdd2, avgOdd2);
	}

}
