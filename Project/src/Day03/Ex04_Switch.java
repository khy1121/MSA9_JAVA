package Day03;

import java.util.Scanner;

public class Ex04_Switch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int channel = 0;
		
		while(channel!=-1) {
			System.out.print("채널을 입력해주세요(종료 시 -1) : ");
			channel = sc.nextInt();
			switch (channel) {
				case 5:
					System.out.println("sbs로 이동합니다");
					break;
				case 7:
					System.out.println("kbs로 이동합니다");
					break;
				case 11:
					System.out.println("mbc로 이동합니다");
					break;
				case 15:
					System.out.println("jtbc로 이동합니다");
					break;
				
				case -1:
					System.out.println("프로그램을 종료합니다");
					break;
				default:
					System.out.println("채널을 올바르게 입력해주세요");
					break;
			}
		}
		sc.close();
	}
}

