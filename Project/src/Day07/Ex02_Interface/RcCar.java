package Day07.Ex02_Interface;

import Day07.RemoteControl;

// 클래스를 상속하는 키워드		: extends
// 인터페이스를 구현하는 키워드	: implements
public class RcCar implements RemoteControl{
	int speed;
	@Override
	public void turnOn() {
		System.out.println("Rc카 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Rc카 전원을 끕니다");

	}

	@Override
	public void setSpeed(int speed) {
		//최대 최소 사이의 값으로 조건을 설정하고 
		if(speed>RemoteControl.MAX_SPEED) {
			this.speed=RemoteControl.MAX_SPEED;
			System.err.println("최고속도 !");
		}
		if(speed<RemoteControl.MIN_SPEED) {
			this.speed=RemoteControl.MIN_SPEED;
			System.err.println("최저속도 !");
		}
		else 
			this.speed=speed;
		System.out.println("현재 속도 : "+ this.speed);
	}

}
