package inherit2;

public class Manager extends Employee{
	private double bonus;

	public Manager() {   // "generate constructors from superclass"
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary, double bonus) {
		// "generate constructors using fields" -> "select super constructor to invoke"
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {   // getter
		return bonus;
	}

	public void setBonus(double bonus) {   // setter
		this.bonus = bonus;
	}


	
	////// 함수 재정의(overriding) -> override/implement methods //////

	@Override  // annotation
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.bonus * 12);  
		// private이면 this.salary로는 접근 불가
		// Manager클래스에서도 this.salary로 접근 가능하게 하려면 Employee클래스의 salary는 protected로 변경해야함
		// 그러나 protected로 변경하면 안되는 경우 -> Employee클래스에 getter를 추가하여 사용하면 됨!
		return result;
	}

//	@Override
//	public String toString() {
//		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
//	}
	
	@Override
	public String toString() {
		return super.toString() + " " + bonus;
	}
	
}
