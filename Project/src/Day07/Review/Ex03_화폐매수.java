package Day07.Review;

import java.util.Scanner;

/**
// 아카데미에서 김조은 팀장에게 예산을 주고
 * 에어컨을 구매하라고 지시
 * 에어컨 구매비는 현금
 * 구매비 : 657825 
 * 50000 :	13
 * 10000 :	0
 * 5000 : 	1
 * 1000 :	2
 * 500  :	1
 * 100  :	3
 * 50   :	0
 * 10   :	2
 * 5 	:	1
 * 1 	:	0
 * 
 * 화폐 단위별 화폐 매수 출력 프로그램
 */

//public class Ex03_화폐매수 {
	/*public static void main(String[] args) {
		final int PRICE=657825;
		Scanner sc = new Scanner(System.in);
		int bill[]={50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int count []= new int [10];
		int sum=0;
		for(int i=0; i<bill.length; i++) {
			System.out.println(bill[i] +"원권 의 장수를 입력하세요 : ");
			count[i] = sc.nextInt();
			sum += bill[i] * count[i];
			
		}
		if(sum == PRICE) {
			System.out.println("금액이 정확합니다.");
		}
		else if(sum < PRICE) {
			System.out.println("금액이 부족합니다. ");
			System.out.println("부족한 금액은 "+ (PRICE-sum) + "원 입니다.");
		}
		else if(sum > PRICE) {
			System.out.println("금액이 넘쳤습니다. ");
			System.out.println("거스름돈은 "+ (-PRICE+sum) + "원 입니다.");
		}
	
		for(int i=0; i<bill.length; i++) {
			System.out.println(bill[i] +"원권의 개수는 : " +count[i] + "장 입니다.");
		}
		
		sc.close();
	}*/
	
	
		//풀이 예시
		/*
		 *  1.필요한 변수 선언 - 입력 금액, 화폐매수, 화폐단위
		 *  2. 구매비 입력
		 *  3. 화폐 매수 계산
		 *   - 화폐 매수 계산
		 *  	화폐매수 = 입력금액 - 화폐단위
		 *  
		 *   - 잔액계산 
		 *  	잔액 = 입력금액 - ( 화폐 단위 * 화폐 매수 )
		 *  	잔액 =  입력금액 % 화폐 단위
		 *  
		 *   - 화폐 단위 계산
		 *   	번갈아 가면 서 . /5 /2 연산을 반복
		 *   	화폐 단위 = 화폐 단위 / 5
		 *   	화폐 단위 = 화폐 단위 /2
		 *   
		 *   4. 3번과정을 반복
		 */



/*	public static void main(String[] args) {
		 // 필요한 변수 선언 
		 int charge; // 입력 요금
		// 구매비 입력
		 Scanner sc = new Scanner(System.in);
		 System.out.print("지불하실 요금을 입력하세요 : ");
		 charge = sc.nextInt();
		 int count=0;  // 화폐 매수
		 int bill[]={50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		 int i =0;
		 while (bill[i] >= 1) {
				// 화폐 매수 계산
				count = charge / bill[i];
				System.out.println(bill[i] +"원 : "+count + " 장");
				
				// 잔액 계산
				charge = charge - (bill[i] * count);
				System.out.println("남은 금액은 "+ charge +"원");
	
		 }
	 
	 
}*/
public class Ex03_화폐매수 {
	
	
	 public static void main(String[] args) {
		 // 필요한 변수 선언 
		 int charge; // 입력 요금
		// 구매비 입력
		 Scanner sc = new Scanner(System.in);
		 System.out.print("지불하실 요금을 입력하세요 : ");
		 charge = sc.nextInt();
		 int count=0;  // 화폐 매수
		 int bill= 50000; // 화폐 단위
		 boolean check =true;
		 while (bill >= 1) {
				// 화폐 매수 계산
				count = charge / bill;
				System.out.println(bill +"원 : "+count + " 장");
				
				// 잔액 계산
				charge = charge - (bill * count);
				System.out.println("남은 금액은 "+ charge +"원");

				// 화폐 단위 변환
				if(check) {
					bill /=5;
					//System.out.println(bill +"원권 으로 바뀌었습니다 ! ");
				}
				else if(!check){
					bill /=2;
					//System.out.println(bill +"원권 으로 바뀌었습니다 ! ");
				}
				else if(bill ==0 )
					System.err.println("더이상 나눌 화폐가 없습니다. ");
				check = !check;
		 }
		 sc.close();
	}	 
}
