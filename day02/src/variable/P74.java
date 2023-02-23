package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하십시오(10~100)");
		String cmd = sc.next();
		// 10~100 사이의 정수를 입력받는다.
		// 1부터 입력받은 숫자까지의 범위에서랜덤한 숫자를 발생시키시오 

		Random r = new Random();  
		int i = Integer.parseInt(cmd);
		int rndNum = r.nextInt(i)+1;  // r.nextInt(i) = 0 ~ (i-1)
		System.out.println(rndNum);
		sc.close();
	}

}
