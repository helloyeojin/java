package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		//String s1 = 10;   이렇게는 당연히 못 씀! 타입이 다르니까
		String s1 = "10";
		int s2 = Integer.parseInt(s1);
		int a = 10;
		System.out.println(s2+a);
		
		int n1 = 10;
		String n2 = String.valueOf(n1);   // 자바에서 제공하는 API.. 기능적으로 이런거 가져다 쓰라고...?
		// String n2 = n1+"";도 같은 결과가 나오긴 합니다 
		
		Random r = new Random();   // JAVA.lang에 있는 거는 임포트를 하지 않아도 쓸 수 있지만 그 외의 API는 임포트를 하고 사용해야
		int rndNum = r.nextInt(10);   // .nextInt(i)면 0 이상 i 미만 숫자 범위에서 
		System.out.println(rndNum);
		
		Random i = new Random();   
		int rnd = i.nextInt(45)+1;   // 이렇게 하면 1~45	
		System.out.println(rnd);
	}

}
