package variable;

public class P54 {

	public static void main(String[] args) {
		// boolean
		boolean b1 = 10 > 5;  //boolean b1 = true
		
		// 정수(default는 int)
		int n1 = 10;
		long n2 = 200000000000000L;   // 정수형은 int가 기본이기 때문에 long 뒤에도 int로 표현 가능한 범위를 초과하면 빨간 줄이 뜸 
		// long n2 = 0L;
		// n2 = 22222222222222L;
		
		double d1 = 1.0;
		float f1 = 1.0F; // 실수형은 기본이 double이기 때문에 뒤에 f를 써줘야
		
//		double d2 = 1/2;
//		System.out.println(d2);
		
//		double d3 = 10.0/3.0;
//		System.out.println(d3);
//		
//		float f2 = 10.0F/3.0F;
//		System.out.println(f2);
		
		// char
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2);
		
		int n3 =10;
		double n4 = 10.0;
		//int result = n3 + n4; 이렇게 하면 n4를 int로 변환할 수 없어서 에러가 남 BUT 그런 경우 값이 바뀌는 리스크가 생길 수 있음 
		double result = n3 + n4; // 변수명에 생기는 하이라이트는 선언만 되고 써먹지를 않은 경우에 뜸 -> 실제 개발 시에는 쓰레기가 
	}

}
