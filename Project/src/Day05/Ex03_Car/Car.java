package Day05.Ex03_Car;

public class Car {
	
	String model; //모델명
	private int speed; //속도

	
	//생성자
	//alt shift s :  o
	//-기본
	public Car() {
		this("모델", 0);
	}
	//model 매개변수 생성자
	public Car(String m) {
		
	}
	//-전체 매개변수 생성자
	public Car(String model, int speed) {
	
	}
	//getter & setter
	
	//-getter : 변수의 값을 가져온다
	//-setter : 변수의 값을 지정한다
	// 게터/세터 : getXXX(), setXXX(값)
	//
	// alt shift s - getter setter 선택
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			speed=0;
			System.err.println("속도는 음수가 될 수 없습니다");
			}
		if(speed>350) {
			speed=350;
			System.err.println("최대 속도는 350 km/h 입니다");
			}
		this.speed = speed;
	}
	
	
	
	


	
}








