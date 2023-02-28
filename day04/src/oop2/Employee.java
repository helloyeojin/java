package oop2;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Employee {
	private String id;  
	// private -> capsulation 생성자를 정의할 때만 이거를 가져다 쓰고 그 다음에는 수정하지 못하게 막는 접근 제어자 
	// 이렇게 되면 Employee.java 파일에서 salary라는 것을 가져다 쓸 수가 없음 
	private String name;
	private int salary;

	public Employee() { // 임시직 같은 사람들의 정보를 입력하기 위한 생성자
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) { // 아이디, 이름, 급여를 입력하면 만들어지는 생성자
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
	}

	public Employee(String name, int salary) { // 이름과 급여를 입력하면 자동으로 아이디가 만들어지는 생성자
		this("10000", name, salary); // 이 생성자에서 다른 생성자를 호출할 때 this를 사용
		// 이 생성자에서 이름과 샐러리를 받아서 바로 위의 Employee 생성자를 호출 -> 샐러리가 0인지 아닌지를 검증 
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;   
		// capsulation을 시키되 필요하면 name을 변경할 수 있게 함!
		// 우클릭 -> source -> getter & setter(setter를 막으면 변경은 못함) 
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.1;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
