package aggregation;

public class Car {
	public String name; 
	public String color;
	public int size; //배기량 
	
	// 생성자(constructor)
	public Car() {
		this.name = "k1";
		this.color = "red";
		this.size = 1000;
		}
	
	public Car(String name, String color, int size) {   // 생성자는 같은 이름으로도 쓸 수 있음...오버로드...? 괄호 안에가 argument
		this.name = name;  // 선택한 메모리 상의 특정 주소를 가진 객체의 이름에 니가 선택한 이름을 넣어
		this.color = color;
		this.size = size;
	}
	
	public void go() {
		System.out.println(this.name + " Go Car");
	}
	public void stop() {
		System.out.println(this.name + " Stop Car");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}
}
