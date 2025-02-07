package Day08.Ex01_AnonymousObject;

public class RcTest{

	public static void main(String[] args) {
		//익명 구현 객체
		//: 클래스를 정의하지 않고도, 이름없이 구현한 객체
		// - 인터페이스 객체명 = new 인터페이스(인자 1, ... ) { 객체 정의}
		
		//			---- 사용 예시 ----
		// GUI 프로그래밍 (그래픽 유저 인터페이스)에 사용 
		//SWING / JAVAFX 등
		//버튼을 눌렀을 때 작동방법은 javaFX에 인터페이스로 구현
		// 사용할땐 익명 구현 객체로 onClick() 작성해서 사용 
		
		RemoteControl rc= new RemoteControl() {
			int speed=0;
			@Override
			public void turnOn() {
				System.out.println("전원이 켜졌습니다");
				Parking(false);
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원이 꺼졌습니다");
				Parking(true);
			}
			
			@Override
			public void setSpeed(int speed) {
				this.speed= speed;
				System.out.println("속도 :" +this.speed);
			}
		};
		rc.turnOn();
		rc.setSpeed(100);
		rc.turnOff();
	}
}
