package oop2;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee(); // 이렇게만 짜면 이거는 temporary한 상황
		System.out.println(e1.toString());
		
		Employee e2 = new Employee("어망고", 5000000);
		System.out.println(e2.toString());
		System.out.println(e2.getAnnSalary());
		System.out.println(e2.getTax());
		
		e2.setName("어키위");
		System.out.println(e2.toString());
	}

}
