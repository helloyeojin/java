package inherit2;

public class TaxCal {
	
	// Employee e = new Manager();
	
	public double getTax(Employee e) {
		double result = 0.0;
		result = e.getAnnSalary() * 0.17;
		return result;
	}
}
