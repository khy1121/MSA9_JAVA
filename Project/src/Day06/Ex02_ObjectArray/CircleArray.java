package Day06.Ex02_ObjectArray;


/**
 * 반지름이 1~5인 circle 객체를 5개 가지는 객체 배열을 생성하고,
 * 배열 요소에 있는 모든 circle  객체의 넓이를 출력하세요 
 * 
 */

class Circle{
	int radius;
	
	//기본 생성자

	//생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	//toString 메소드 
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	// final double PI=3.141592;
	//	MATH.PI 로 대체 가능
	//원의 넓이를 구하는 메소드
	public double cExtent() {
		//double extent = radius * radius * Math.PI;
		// Math.pow ( 숫자 , 제곱)
		double extent = Math.pow(radius, 2)* Math.PI;
		return extent;
	}
	
}
public class CircleArray {
	
	public static void main(String[] args) {
		//반지름 1~5가지는 객체 배열 생성 
		Circle [] cArray =new Circle[5];
		for (int i = 0; i < cArray.length; i++) {
			cArray[i]= new Circle(i+1);
		}
		
		for (Circle circle : cArray) {
			System.out.printf(" 넓이 : " + "%.2f",circle.cExtent());
			System.out.println();
		}
		
	}
}
