package Day03;

import java.util.Scanner;

public class Ex05_grade {
	//학점을 입력받아 점수 구간을 출력하세요 
	//ex A=90~100점입니다
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//조건값에 가능한 값 : char short int 열거체 등 / 실수는 불가능
		System.out.print("학점을 입력하세요 : ");
		String grade=sc.next();
		
		switch (grade) {
			case "A":
				System.out.println("90점에서 100점입니다");
				break;
			case "B":
				System.out.println("80점에서 89점입니다");
				break;
			case "C":
				System.out.println("70점에서 79점입니다");
				break;
			case "D":
				System.out.println("60점에서 69점입니다");
				break;
			case "F":
				System.out.println("60점 이하입니다");
				break;
	
			default:
				System.out.println("입력된 학점이 잘못됐습니다");			
				break;
			}
		sc.close();
		
	}
}
