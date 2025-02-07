package Day08.Ex02_MultiImplement;

public interface Mic {
	
	int inputVolumeMax =50; //음성인식 최대볼륨
	int inputVolumeMin =0;	//음성인식 최소볼륨
	
	//음성인식 
	String receiveVoice(String voice);
	
	
}
