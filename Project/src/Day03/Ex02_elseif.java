package Day03;

import java.util.Scanner;

public class Ex02_elseif {
	
	public static void main(String[] args) {
		// 성적을 입력받아서 A/B/C로 학점 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요 : ");
		int grade= sc.nextInt();
		
		if(grade>=90 && grade<=100)
			System.out.println("성적은 "+ grade + "이므로 A학점입니다");
		else if(grade>=80)
			System.out.println("성적은 "+ grade + "이므로 B학점입니다");
		else if(grade>=70)
			System.out.println("성적은 "+ grade + "이므로 C학점입니다");
		else if(grade>=60)
			System.out.println("성적은 "+ grade + "이므로 D학점입니다");
		else if(grade<60)
			System.out.println("성적은 "+ grade + "이므로 F학점입니다");
		
		
		
		System.out.print("영어 성적을 입력하세요 : ");
		int score=sc.nextInt();
		char level='F';
		if(score>=90 && grade<=100) 
			level='A';
		else if(score>=80)	
			level='B';
		else if(score>=70)	
			level='C';
		else if(score>=60)	
			level='D';
		else if(score<60 && score>=0) 
			level='E';
		else 
			level='?';
			System.out.println("성적이 올바르지 않습니다");
		
		
		System.out.println("성적은 "+ score + "이므로 "+ level + "학점입니다");
		sc.close();
	}
}
