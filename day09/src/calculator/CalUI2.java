package calculator;

import java.util.Scanner;

public class CalUI2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Innput 2 Number");
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double result = 0.0;
		
		try {
			result = Cal.div(a, b);
			System.out.println(result);
		} catch (InfinityException e) {  
			//Exception e로 해도 되기는 하지만 다양한 종류의 예외를 구분할 수 없어서 특정하게 작성하는게 가독성은 더 좋음 
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
