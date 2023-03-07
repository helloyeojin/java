package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num...");
		int num = 0;   // 이 부분이 빠지면 밑에 result 파트의 num이 빨간불이 뜬다 
		
		
//		try {
//			num = Integer.parseInt(sc.next());
//			int result = 10 / num;
//			System.out.println(result);
//		} catch(Exception e) {
//			System.out.println("잘못 입력하셨습니다");
//		}
		
//		try {
//			num = Integer.parseInt(sc.next());
//			int result = 10 / num;
//			System.out.println(result);
//		} catch(ArithmeticException | NumberFormatException e) {
//			System.out.println("잘못 입력하셨습니다");
//		}
		
		
		// 에러메시지를 상세하게 쓰려면 이 방법으로 하는 게 맞다 
		try {
			num = Integer.parseInt(sc.next());   // 이 부분이 정상적일 때만 result 출력 
			int result = 10 / num;
			System.out.println(result);
		} catch(ArithmeticException e1) {   //arithmetic exception이 발생하면 e1으로 들어와라~
			System.out.println("분모가 0입니다");
			return;
		} catch(NumberFormatException e2) {
			System.out.println("숫자를 입력하세요");
			return;
		} finally {   //만약에 finally 없이 sc.close를 밖에다 쓰면 sc.close까지 안 가고 그냥 위에서 코드가 끝나버림!
			System.out.println("반드시 실행...");
			sc.close();
		}
		
		System.out.println("End Application...");
	}
}
