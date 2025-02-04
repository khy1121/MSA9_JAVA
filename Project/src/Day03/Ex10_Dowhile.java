package Day03;

import java.util.Scanner;

public class Ex10_Dowhile {
	//메뉴판
	// * 변수 선언 : 메뉴번호, 메뉴이름 출력
	
	public static void main(String[] args) {
		
		int num=0;
		String menuName=" ";
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		
		do {
			System.out.println("0. 종료");
			System.out.println("1. 떡볶이");
			System.out.println("2. 라면");
			System.out.println("3. 돈까스");
			System.out.println("4. 쫄면");
			System.out.println("5. 비빔밥");
			System.out.print("메뉴 번호를 입력하세요 :");
			num=sc.nextInt();
			
			if(num ==0) break;
			switch (num) {
			case 1:	menuName = "떡볶이";	break;
			case 2:	menuName = "라면";	break;
			case 3:	menuName = "돈까스";	break;
			case 4:	menuName = "쫄면";	break;
			case 5:	menuName = "비빔밥";	break;
			default:	break;
			}
			System.out.println(menuName + " 메뉴를 선택하셨습니다");
			System.out.println();
			sum+=1;
		} while (num!=0);
		System.out.println();
		// 주문한 메뉴 개수 출력
		System.out.println(sum +"개의 메뉴를 주문했습니다");
		System.out.println();
		System.out.println("메뉴 선택을 종료합니다");
		sc.close();
	}
}
