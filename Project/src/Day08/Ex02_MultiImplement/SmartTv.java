package Day08.Ex02_MultiImplement;

import java.text.MessageFormat;

//다중구현 
//public class 클래스명 implements 인터페이스1,인터페이스2 ... {}
public class SmartTv implements SmartRemoteControl, Searchable{
	int volume;
	int channel;
	String keyword;
	int x,y;
	@Override
	public void turnOn() {
		System.out.println("전원이 켜졌습니다");
	}

	@Override
	public void turnOff() {
		System.out.println("전원이 꺼졌습니다");
	}

	@Override
	public void setVolume(int volume) {
		this.volume=volume;
		System.out.println("volume : "+volume);
	}

	@Override
	public void setChannel(int channel) {
		this.channel= channel;
		System.out.println("channel : "+channel);
		
	}

	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성 입력: " + voice);
		return "voice : " +voice;
	}

	@Override
	public int channelSearch(String keyword) {
		int channel=0;
		switch (keyword) {
			case "sbs": channel=5; break;
			case "kbs1": channel=9; break;
			case "mbc": channel=11; break;
			case "kbs2": channel=7; break;
			case "jtbc": channel=15; break;
			case "tvn": channel=18; break;
		}
		return channel;
	}
				

	@Override
	public String[] contentSearch(String keyword) {
		String movieContents[]= {"어벤져스","터널", "범죄도시", "스파이더맨", "데드풀2"};
		String newsContents[]= {"9시뉴스", "뉴스데스크", "뉴스24" ,"뉴스월드"};
		String funContents[]= {"런닝맨", "무한도전", "아는형님", "신서유기"};
		String recommendContents[]= {"시수기릿", "빵빵이", "침착맨", "김데데"};
		String[] chiceContents;
		switch (keyword) {
			case "영화": chiceContents = movieContents; break;
			case "뉴스": chiceContents = newsContents; break;
			case "예능": chiceContents = funContents; break;
			default: 
				chiceContents = recommendContents; break;
				
			}
		
		return chiceContents;
	}

	@Override
	public void touch(int x, int y) {
		this.x=x;
		this.y=y;
		//System.out.println("(x,y) : "+ x +"  "+y );
		System.out.println("(x,y) : "+MessageFormat.format("({}, {})", x,y));
		
	}

}
