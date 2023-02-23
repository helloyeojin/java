package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.printf("%d, %d\n", a, b);
		
		int result = ++a + b++;
		System.out.printf("%d, %d\n", a, b);
		System.out.println(result);
		
		System.out.println(5 == 5);
		
		int aa = 10;
		int bb = 10;
		
		System.out.println( (aa++ >= 0) | (bb++ >= 0) );   
		// || 이렇게 쓰면 첫번째 거를 연산해보고 참이면 뒤에 것을 볼 필요가 없으니 연산을 하지 않음 
		// 그래서 밑에서 출력을 할 때 bb++를 하지 않은 값을 출
		System.out.printf("%d, %d\n", aa, bb);
	}

}
