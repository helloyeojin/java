package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2345;   // primitive 타입 
		String str1 = "abc";  // reference 타입 
		String str2 = "abc";
		System.out.printf("%d %4.2f %s \n",a,d,str1);  // \n을 안 쓰면 뒤에까지 계속되기 때문에 개행 문자 추가한 것 
		// %4.2f -> 소수점 앞에는 4자리까지 소수점 뒤에는 2자리까지 출력해라~ 그런데 앞자리가 네자리를 넘어서도 그냥 출력
		if(str1 == str2) {         // 주소 비교 
			System.out.println("ok");
		}
		if(str1.equals(str2)) {    // 이거는 진짜 string과 string 비교 
			System.out.println("okok");
		}
		String str3 = new String("abc");
		String str4 = new String("abc");
		if(str1 == str3) {
			System.out.println("OKDK");
		}
		else {
			System.out.println("notOK");
		}
	}

}
