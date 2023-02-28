package oop1;

public class App2 {

	public static void main(String[] args) {
		Car car1 = new Car("k2", "blue", 2000);  // =이라는 연산자는 항상 오른쪽에서 시작해서 왼쪽으로 가는 구
		car1.go();
		car1.stop();
		System.out.println("--------------------------");
		Car car2 = new Car("k3", "white", 3000);
		car2.go();
		car2.stop();
	}

}
