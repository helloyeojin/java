package shape;

public class Rectangle extends Shape {
	private double width;
	private double height;
	// x, y도 갖고 있음!
	

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	// Shape 클래스에서 상속된 메소드 = 필수! 생략 불가! 
	@Override
	public double getArea() {
		return width * height;
	}


	@Override
	public double getCircumn() {
		return (width + height) * 2;
	}

}
