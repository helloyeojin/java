package com.kbstar.hrd.app;

import com.kbstar.hrd.Manager;

public class App2 {

	public static void main(String[] args) {
		Manager mngrs[] = new Manager[3];
		mngrs[0] = new Manager("301", "채밤빵", 500, 50);
		mngrs[1] = new Manager("302", "장덕배", 500, 50);
		mngrs[2] = new Manager("303", "서마롱", 500, 50);

		for(Manager m:mngrs) {
			System.out.println(m);
			System.out.println(m.getTax());
			System.out.println(m.getAnnSalary());
			System.out.println(m.getAnnTax());
		}
	}

}
