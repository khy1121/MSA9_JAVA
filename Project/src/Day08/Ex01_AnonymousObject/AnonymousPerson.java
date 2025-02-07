package Day08.Ex01_AnonymousObject;



public class AnonymousPerson {
	
	//익명 자식 객체 생성
	// - 슈퍼 클래스 객체명 = new 슈퍼클래스 () {  익명객체 정의 }
	Person person1 = new Person() {

		@Override
		void work() {
			System.out.println(name + "( "+ age + " )");
			System.out.println("프로그래밍을 합니다.");
			System.out.println();
		}
		
	};
	
	Person person2 = new Person() {

		@Override
		void work() {
			System.out.println(name + "( "+ age + " )");
			System.out.println("게임을 합니다.");
			System.out.println();
		}
		
	};
	Person person3 = new Person() {

		@Override
		void work() {
			System.out.println(name + "( "+ age + " )");
			System.out.println("잠을 잡니다.");
			System.out.println();
		}
		
	};
	
	void method() {
		person1.age =20;
		person1.name="김헌영";
		person1.work();
		person2.age =38;
		person2.name="이병건";
		person2.work();
		person3.age =40;
		person3.name="주호민";
		person3.work();
	}
}
