package Day07.Ex01_Shape;

public class Point {
	
	//멤버변수
	int x;
	int y;
	
	
	
	public Point() {
		this(0,0);
	}

	// 매개변수를 갖는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
