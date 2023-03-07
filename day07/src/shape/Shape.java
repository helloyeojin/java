package shape;

public abstract class Shape {
	protected int x;
	protected int y;
	 
	public Shape() {
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// getter setter 필요시 추가
	
	// Abstract Method = 함수의 모양이 없음
	// 추상클래스의 자식클래스는 아래의 함수를 반드시 구현해야만 함 
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x+" , "+y; // x와 y의 값을 String으로 만들어서 리턴한다
	}
}
