package Day07.Ex01_Shape;


// 추상 - 대상으로부터 공통된 특징을 뽑아내는 것
// 추상클래스 : 여러가지 클래스 중 공통된 특징을 뽑아내는 것

// 목적: 추상클래스는 서브클래스에서 구현할 메소드를 명료하게 알려주는 인터페이스 역할
// : 설계 와 구현을 분리하여 사용하는 용도

/**
 * 객체 생성 불가
 * 추상 메소드가 있다면 반드시 추상 클래스로 선언
 * 추상클래스 상속한 서브클래스에서 구현해서 사용 가능
 * (구현없이 상속만 받으면 서브클래스도 추상클래스)
 * 
 *  ** 추상클래스를 상속한 구현 클래스는 반드시 추상 메소드 오버라이딩 해야 한다.
 */


public abstract class Shape {
	
	/**
	 * 추상 메소드는 구현 불가
	 * 클래스가 가져야할 인터페이스에 대한 원형 정의
	 * 서브클래스가 가져야 할 인터페이스 정의
	 */
	Point point;
	//넓이와 둘레를 구하는 추상 메소드를 정의하시오
	// 추상메소드: abstract 반환타입 메소드명(매개변수);
	abstract double area();
	abstract double round();
	
	//getter setter 
	public Point getPoint() {
		return point;
	}
	
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
}
