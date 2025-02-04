package Day04;

import java.util.Iterator;

public class Ex04_Foreach {
	
	public static void main(String[] args) {
		//배열 선언 및 초기화
		String []week= {"월","화","수","목","금","토","일"};
		
		//foreach 문
		// - for(자료형 반복요소명 : 배열){ }
		//전부 반복시킬 경우 사용하는게 낫다
		//배열이나 컬렉션의 모든 요소를 순서대로 전체 반복하는 반복문
		
		// 사용예시
		//- 배너 광고의 사이클 같은 경우
		//- 알림창 (공지사항) 띄우는 경우
		
		for (String day : week) {
			System.out.print(day + " ");
		}
		
		// 기본 for문
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
	}
}
