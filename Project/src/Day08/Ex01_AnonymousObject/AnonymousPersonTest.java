package Day08.Ex01_AnonymousObject;

public class AnonymousPersonTest {
	
	public static void main(String[] args) {
		AnonymousPerson ap = new AnonymousPerson();
		
		ap.method();
		
		Person p= new Person() {
			String name = "김풍";
			int age = 45;
			
			void work() {
				System.out.println(name + "( "+ age + " )");
				System.out.print("일을 합니다 ");
			}
		};
		p.work();
	}
}
