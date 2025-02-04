package Day05.Ex01_Student;

import java.util.Scanner;

public class Student {
	// 학생의 속성 : 이름 나이 학번 전공
	// 학생의 행동 : 공부하기(), 성적 평균 구하기()
	Scanner sc = new Scanner(System.in);
	
	//변수 
	String name;
	int age;
	String stdNo;
	String major;
	
	
	//생성자 
	public Student() {
		this("이름없음", 0 ," 0000000", "없음");
	}
	
	public Student(String name, int age, String stdNo, String major) {
		this.name=name;
		this.age=age;
		this.stdNo=stdNo;
		this.major=major;
		
	}
	
	//메소드
	// - 공부하기
	// - 성적 평균 구하기
	// void : 반환타입 없음( return 생략 가능)
	// - void 로 지정해도 return 을 메소드를 종료시키는 용도로 사용 가능
	public void study(String subject) {
		System.out.println(subject + " 을(를) 공부합니다.");
	}
	
	
	
	// 성적 평균 구하기
	// 메소드 오버 로딩 
	//성적 두개 입력받아 평균 구하기
	public double getAverage(int score1, int score2) {
		double average=0.0;
		average=(score1+score2)/2;
		return average;
	}
	
	public double getAverage(int score1, int score2, int score3) {
		double average=0.0;
		average=(score1+score2+score3)/3;
		return average;
	}
	
	//데이터가 배열일 경우
	public double getAverage(int scores[]) {
		double average=0.0;
		int sum=0;
		
		//배열의 평균 구하기
		for(int i=0; i<scores.length; i++) {
			sum +=scores[i];
		}
		
		/* foreach문으로 표현
		for (int score : scores) {
			sum +=score;
		}*/
		
		average = (double)sum / scores.length; 
		// sum 과 length 모두 int 형이므로 강제 형변환
		return average;
	}
	
	
}
