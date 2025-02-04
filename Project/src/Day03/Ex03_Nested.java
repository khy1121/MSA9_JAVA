package Day03;

import java.util.Scanner;

public class Ex03_Nested {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정처기 합격기준
		//(조건) 4학년, 60점이상
		
		System.out.print("학년 : ");
		int year=sc.nextInt();
		
		
		
		System.out.print("정처기 시험 점수 : ");
		int score=sc.nextInt();
		
		
		
		
		
		
		//if 문안에 if문 구조는 권장하지 않음
		//4학년인 조건이 성립 될 경우에만 점수입력 가능한 조건문
		/*if(year ==4) {
			System.out.print("정처기 시험 점수 : ");
			int score=sc.nextInt();
			if(score >=60)
				System.out.println("정보처리 기사 시험에 합격하셨습니다");
			else
				System.out.println("정보처리 기사 시험에 불합격하셨습니다");
				
		}
		else
			System.out.println("응시 자격이 없습니다");
		*/
		
		//방법 1
		/*if(year==4 && score>=60) 
			System.out.println("정보처리 기사 시험에 합격하셨습니다");
		
		else if(year==4 && score<60)
			System.out.println("정보처리 기사 시험에 불합격하셨습니다");
		
		else
			System.out.println("응시 자격이 없습니다");
		*/
		
		//4학년이 아닌 경우를 먼저 거르는 방법 
		if(year!=4) 
			System.out.println("응시 자격이 없습니다");
			
		else if(score>=60)
			System.out.println("정보처리 기사 시험에 합격하셨습니다");
		
		else
			System.out.println("정보처리 기사 시험에 불합격하셨습니다");
		
		sc.close();
	}
}
