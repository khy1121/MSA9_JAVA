package Day04;

import java.util.Scanner;

public class Ex01_Array {
	public static void main(String[] args) {
		//배열 선언 - 자료형 변수명[];
		int arr[];
		
		//배열 생성 - 변수명 = new 자료형[개수];
		arr=new int[6];
		
		//배열 요소에 접근
		// - 배열명[인덱스번호]= 데이터
		arr[0]=10;
		arr[1]=22;
		arr[2]=33;
		arr[3]=44;
		arr[4]=55;
		arr[5]=66;
		
		int N=arr.length;
		System.out.println("배열의 길이  "+N);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		//반복문에서 만들었던 메뉴판
		//배열을 이용한 응용버전~~~~~~~
		// 원문 DAY02- Ex10 참고
		Scanner sc = new Scanner(System.in);
		int list;
		String[] arrMenu= {"떡볶이" , "김밥", "돈까스", "순대"};
		int menuNum=arrMenu.length;
		int sum=0;
		do{
			
			System.out.println("1. 떡볶이 2. 김밥 3. 돈까스 4. 순대 (종료 시 -1)");
			System.out.print("메뉴를 입력하세요 : ");
			list=sc.nextInt();
			if(list ==-1)
				break;
			System.out.println(arrMenu[list-1] + "을(를) 선택하셨습니다");
			sum +=1;
			
		}while(list!=-1);
		System.out.println("선택한 메뉴는 " + sum + "개 입니다");
		System.out.println("메뉴 선택을 종료합니다");
	}
}
