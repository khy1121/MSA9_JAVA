package Day07.Ex01_Shape;

public class Triangle extends Shape{

	double width,height;
	
	//생성자
	public Triangle() {
		this(0,0);
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	//메소드
	@Override
	double area() {
		//삼각형의 넓이 가로 * 세로 / 2
		return width * height / 2;
	}

	@Override
	double round() {
		//정삼각형의 둘레 
		return width *3;
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
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	

}
