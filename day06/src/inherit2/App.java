package inherit2;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "uhmango", 500);
		System.out.println(e);
		System.out.println(e.getAnnSalary());
		
		Manager m = new Manager("200", "uhkiwi", 500, 50);
		System.out.println(m);
		System.out.println(m.getAnnSalary());  // getAnnSalary 메소드를 manager클래스에서 정의하지 않았지만 사용 가능 
		
	}
}
