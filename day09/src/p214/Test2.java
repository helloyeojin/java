package p214;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int num = 0;   //try 안에서 선언한 변수는 그 안에서밖에 못 씀 
		try(Scanner sc = new Scanner(System.in)) {  
		//try-catch 구문 내에 스캐너를 사용하면 이 메소드 자체에 close가 포함되어 있기 때문에 해당 구문이 끝날 때 자동으로 닫히게 됨
		//BUT 잘 되어도 close 못 되어도 close가 되기 때문에 경우에 따라 세세한 예외처리를 하거나 대처를 할 수가 없게 됨  
			System.out.println("Input num...");
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("End Application...");
	}
}
