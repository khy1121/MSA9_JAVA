package Day08.DesignPattern.Singleton;

public class SingletonTest {
	public static void main(String[] args) {
		
		Singleton s01=Singleton.getInstance();
		Singleton s02=Singleton.getInstance();
		
		//인스턴스가 메모리 공간에 하나로 할당되어있는지 확인
		System.out.println("s01 s02 가 같은지?");
		System.out.println(s01 == s02);
	}
}
