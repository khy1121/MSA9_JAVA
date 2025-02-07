package Day08.Ex01_AnonymousObject;

public interface RemoteControl {
	int MAX_SPEED=300;
	int MIN_SPEED=0;
	
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	default void Parking(boolean check) {
		if(check) {
			System.out.println("주차 모드");
			setSpeed(MIN_SPEED);
		}
		else {
			System.out.println("주행 모드");
			setSpeed(10);
		}
	}
	
	static void changeBt() {
		System.out.println("배터리를 교체했습니다");
	}
	
	
}
