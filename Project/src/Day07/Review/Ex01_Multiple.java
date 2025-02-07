package Day07.Review;

import java.util.Scanner;

public class Ex01_Multiple {
		
	public static void main(String[] args) {
		//정수 하나를 입력받아서 
		//입력받은 수가 3의 배수인 지 아닌지 ,
		//판단하고 그 여부를 출력하는 프로그램 (3의 배수 = "3의배수입니다. else "3의 배수가 아닙니다.")
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 숫자 하나를 입력해주세요 : ");
		int a= sc.nextInt();
		
		if(a%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else
			System.out.println("3의 배수가 아닙니다.");
		sc.close();
	}
}
