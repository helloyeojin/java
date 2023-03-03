package inherit;

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
			// 여기서는 getIncentive라는 specialized된 함수가 표출되지 않아 사용할 수가 없음
			// Sales라는 객체를 Employee 타입으로 바꾸었기 때문에
			if(em instanceof Sales) {   
				// 여기서 Employee 타입의 객체를 끄집어냈는데 그게 sales 타입이면~~ 
				Sales s = (Sales)em;   //이거를 Sales 타입으로 바꿔서 사용하겠다 = 객체의 타입캐스팅! (껍데기의 모양만 다시 Sales로 바꿨다)
				System.out.println(s.getIncentive());
			}
		}
	}
}