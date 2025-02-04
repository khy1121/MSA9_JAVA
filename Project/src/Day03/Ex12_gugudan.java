package Day03;

import java.util.Scanner;

public class Ex12_gugudan {
	//1~9단까지 원하는 단을 입력받아 구구단 나타내기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 구구단 단수를 입력하시오 : ");
		int multi=sc.nextInt();
		
		for(int x=1; x<10; x++) {
			int gugu= multi*x;
			System.out.println(multi + " X " +x +" = " + gugu);
		}
		sc.close();
	}
}
