package Day05.Ex01_Student;

public class studentTest {
	
	public static void main(String[] args) {
		
		//student 객체 생성
		Student s=new Student();
		
		s.name="김헌영";
		s.age=22;
		s.stdNo="2171396";
		s.major ="programming";
		
		int scores[]= {100, 80, 60, 70, 55};
		System.out.println("--------학생 1------");
		System.out.println("학생 1 - 이름 : "+s.name);
		System.out.println("학생 1 - 나이 : "+s.age);
		System.out.println("학생 1 - 학번 : "+s.stdNo);
		System.out.println("학생 1 - 전공 : "+s.major);
		s.study("자료구조");
		
		System.out.println("학생 1 - 중간고사 점수 : "+ s.getAverage(100, 9));
		System.out.println("학생 1 - 기말고사 점수 : "+ s.getAverage(100, 90, 75));
		System.out.println("학생 1 - 최종 점수 : "+ s.getAverage(scores));

	}
}
