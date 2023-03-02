package com.kbstar.hrd;

public class Employee {
	private String id;  //객체 
	private String name;
	private int salary;
	
	public Employee() {
	}

	public Employee(String id, String name, int salary) {
		this.id = id;  //입력된 값을 우리가 만들어놓은 객체에 넣는 것 
		this.name = name;
		this.salary = salary;
	}
	
	// getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}
	
	
	public double getTax() {  //이 함수는 호출되면 double값이 리턴됨 
		double result = 0.0;
		result = this.salary * 0.17;
		return result;
	}
	public int getAnnSalary() {  //이 함수 내부의 result는 위의 result와는 다름 -> 이 함수 내부에서만 정의되는 local variable 
		int result = 0;
		result = this.salary * 12;
		return result;
	}
	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary() * 0.17;  //"이 객체(this)"가 갖고 있는 연봉을 먼저 계산하고 거기에 세율 곱하기 
		// (this.salary * 12) * 0.17로 할 수도 있겠으나 그런 경우 월급 계산하는 방식이 바뀌면 이 함수까지 수정을 일일히 해줘야함 
		return result;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
