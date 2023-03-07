package calculator;

public class Cal {
	public static double div(int a, int b) throws Exception{
		double result = 0.0;
		try {
			result = a / b;   //Arithmetic Exception이 발생하는 라인 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// System.out.println("잘못 입력하셨습니다");라고 여기서 출력하는 거는 의미가 없음 -> 실제 화면에는 출력되지 않기 때문 
			throw e;
		}   
		return result; 
	}
	public static double div(double a, double b) throws InfinityException {  //오버로딩: 예외상황에서는 이러한 에러가 던져질 수 있습니다~ 
		double result = 0.0;
		if(b == 0.0) {   //b가 0이면 "우리가 만든" 에러를 던진다 
			throw new InfinityException("B0001");   //여기서 던지고 나면 밑에는 실행 안됨 
		}
		result = a / b;
		return result; 
	}
}
