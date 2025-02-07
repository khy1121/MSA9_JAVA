package Day07.Ex02_Interface;

import Day07.RemoteControl;

public class Driver {
	
	public static void main(String[] args) {
		// 인터페이스를 구현한 클래스 객체를 만드는법
		// - 인터페이스 타입 객체명 = new 구현 클래스명();
		
		//
		RemoteControl carRc = new  RcCar();
		carRc.turnOn();
		carRc.parking(false);
		carRc.setSpeed(50);
		carRc.parking(true);
		carRc.turnOff();
		
		//static 메소드이기 때문에 객체없이 바로 호출이 가능하다
		RemoteControl.changeBattery();
		System.out.println();
		
		//드론 
		RemoteControl drRc = new  Drone();
		drRc.turnOn();
		
		//디폴트 메소드는 구현하지 않아도(오버라이딩 안해도) 바로 호출 가능
		drRc.parking(false);
		drRc.setSpeed(20);
		drRc.parking(true);
		drRc.turnOff();
		System.out.println();
		
	}
}
