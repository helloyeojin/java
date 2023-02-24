package whilecontrol;

public class P93_2 {

	public static void main(String[] args) {
		System.out.println("Start!");
		int cnt = 0;
		int sum = 0;
		double avg = 0.0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			cnt++;
		}
		avg = sum / (cnt*1.0);   
		// 만약 i의 범위가 변경되었을 때 avg가 실수형이 나올 수도 있음 -> cnt를 실수형으로 바꿔서 avg를 실수형으로 출력 
		System.out.printf("sum: %d, average: %4.2f \n", sum, avg);
		System.out.println("End!");
	}
}
