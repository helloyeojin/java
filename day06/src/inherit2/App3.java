package inherit2;

import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		
		Object obj1 = new Employee();  
		// 자바의 모든 클래스는 public class Employee extends Object{}가 생략되어 있음 -> 모든 클래스는 Object를 상속하고 있음 
		// 이게 생략이 되어있지 않으면 다른 클래스 상속이 불가능하기 때문에 숨겨져 있는 것!
		// 따라서 아래도 가능하다
		Object obj2 = new Manager();
		Object obj3 = new Date();
	}

}
