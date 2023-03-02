package cthis;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("어키위", 500);
		System.out.println(e);
		Employee e2= new Employee("어망고", 500);
		System.out.println(e2);
		
		Date d = new Date();
		java.sql.Date dd = new java.sql.Date(0); 
		//위에서 java.util의 date를 이미 임포트해왔기 때문에
		//java.sql에 있는 date를 쓰고 싶은 경우 하나 더 임포트해오는 것은 안되고, 이런 식으로 앞에 패키지명까지 같이 써야함
	}
}
