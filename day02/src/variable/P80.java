package variable;

public class P80 {

	public static void main(String[] args) {
		int credit = 900;  // 정수형 변수 초기화 
		String grade = (credit >= 800) ? "High" : "Low";  // (1)800이상 (2)이니? (3)맞아:아니
	
		System.out.println(grade);
	}
}
