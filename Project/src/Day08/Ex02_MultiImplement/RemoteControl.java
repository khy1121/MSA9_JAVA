package Day08.Ex02_MultiImplement;

public interface RemoteControl {
	int MAX_VOLUME=100;
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	default void Parking(boolean mute) {
		if(mute) {
			System.out.println("음소거");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("음소거 해체");
			setVolume(50);
		}
	}
	
	static void changeBt() {
		System.out.println("배터리를 교체했습니다");
	}
	
	
}
