package inherit2;

public class App2 {

	public static void main(String[] args) {
		// Manager is a Employee
		Employee e = new Manager("100", "uhrange", 500, 50);
		// Manager m = new Employee("100", "uhrange", 550)은 사용 불가!

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "uhberry", 500);
		ea[1] = new Employee("101", "uhmango", 500);
		ea[2] = new Manager("102", "uhkiwi", 500, 50);
		ea[3] = new Manager("103", "uhnapple", 500, 50);
		ea[4] = new Sales("104", "uhcherry", 500, "Seoul", 0.35);
		
		for (Employee em:ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			System.out.println(em.getIncentive());
		}
		System.out.println("----------------------------------");
		
		TaxCal t = new TaxCal();
		
		for (Employee em:ea) {
		double result = t.getTax(em);
		System.out.println(result);
		}
	}
}