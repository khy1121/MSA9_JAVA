package Day06.Ex06_Final;

public class SuperClass {
	
	//final 메소드
	public final void finalMethod() {
		System.out.println("final method");
	}
}

class SubClass extends SuperClass{
	
	// * final 메소드는 오버라이딩 할 수 없다
	/*
	 * @Override private void finalMethod() {
	 * System.out.println("final 메소드 오버라이딩 불가"); }
	 */
}
