package Day07.Ex01_Shape;

public class Circle extends Shape {
	// 멤벼변수 반지름
	double radius;

	// 기본 생성자
	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		//원의 넓이 구하는 공식
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	double round() {
		return 2 * radius * Math.PI;
	}

	// getter setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
