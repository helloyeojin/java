package com.kbstar.hrd.app;

import cthis.Employee;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "어망고", 500);
		System.out.println(e);
		System.out.println(e.getSalary());
		System.out.println(e.getTax());
		System.out.println(e.getAnnSalary());
		System.out.println(e.getAnnTax());
		
		System.out.println("=========================================");
		
		Employee emps[] = new Employee[3];
		emps[0] = new Employee("201", "어키위", 400);
		emps[1] = new Employee("202", "어렌지", 450);
		emps[2] = new Employee("203", "어베리", 480);
		
		for (Employee em:emps) {
			System.out.println(em);
			System.out.println(em.getTax());
			System.out.println(em.getAnnSalary());
			System.out.println(em.getAnnTax());
		}
	}

}
