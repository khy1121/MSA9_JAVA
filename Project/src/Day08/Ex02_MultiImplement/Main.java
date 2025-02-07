package Day08.Ex02_MultiImplement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SmartTv st=new SmartTv();
		
		st.turnOn();
		st.setVolume(20);
		int channel= st.channelSearch("sbs");
		st.setChannel(channel);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 키워드를 입력하세요 : ");
		String keyword= sc.nextLine();
		String[] content = st.contentSearch(keyword);
		
		for(int i=0; i<content.length; i++) {
			System.out.print(content[i]);
			if(i<content.length-1)
				System.out.print(", ");
		}
		
		System.out.println();
		st.receiveVoice("뉴스 틀어줘");
		
		st.turnOff();
		
		
		
		sc.close();
	}
}
