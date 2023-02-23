package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";    // string pool에 abcdef가 들어감 
		str = str.toUpperCase();  // string pool에 ABCDEF 추가(abcdef 삭제X) -> 새로운 주소를 str에 연결
		System.out.println(str);
		
		String str2 = str.replace('A', 'Z');
		System.out.println(str2);
		
		int lng = str.length();
		System.out.println(lng);
		
		int t = str.indexOf('B');
		System.out.println(t);
		
		char c = str.charAt(0);
		System.out.println(c);
		
		String str3 = str.substring(1, 3);
		System.out.println(str3);
		
		String email = "bonubomb@gmail.com";
		
		String id = "";
		String domain = "";
		// TODO: id랑 domain 분리하기 
		
		System.out.printf("%s, %s",  id, domain);
	}

}
