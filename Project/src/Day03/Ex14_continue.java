package Day03;

import java.util.Scanner;

public class Ex14_continue {

		public static void main(String[] args) {
		//5개의 정수를 입력받아 양수의 합을 구하여 출력
			
			//내가 쓴 방법
			Scanner sc = new Scanner(System.in);
			int sum=0;
			int num=0;
			
			System.out.print("정수 5개를 입력하시오 : ");
			for(int i=0; i<5; i++) {
				num=sc.nextInt();
				if(num>0)
					sum=sum+num;
			}
			System.out.print("양수의 합은 : " + sum);
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			//continue 사용
			System.out.print("정수 5개를 입력하시오 : ");
			int s=0,n=0;
			for(int i=0; i<5; i++) {
				n=sc.nextInt();
				if(n<0)
					continue;
				//남은 실행문을 무시하고 다음 반복으로 점프
				//while문에서는 조건식으로 돌아가고 for문일 경우 증감식으로 루프
				s += n;
			}System.out.print("양수의 합은 : " + s);
			
			//활용할 방법 esc 가 아닌 경우 continue 하여 선택창 메뉴바 키입력으로 이동가능
			sc.close();
		}
			
}
