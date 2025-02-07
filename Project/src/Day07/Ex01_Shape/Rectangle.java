package Day07.Ex01_Shape;

public class Rectangle extends Shape {
	
	// -멤버 변수로 가로, 높이 길이를 저장할 변수를 선언하시오
	double width, height;
	
	// - 생성자를 정의하시오
	public Rectangle() {
		this(0.0, 0.0);
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 추상 메소드 오버라이딩
	@Override
	double area() {
		//사각형 넓이 구하기
		return width * height;
	}

	@Override
	double round() {
		//사각형 둘레 구하기
		return (width + height) * 2 ;
	}
	
	//getter setter 
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
	

}
