package Day02;

public class Ex06_PlusMinusOperator {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		
		//증감 연산자 ++a / --a 
		
		//전위 연산자 
		c=++a + b;
		
		System.out.println("c = "+c);
		System.out.println("a = "+a);
		
		int x=1;
		int y=2;
		int z;
		
		System.out.println("x = "+x);
		z= x++ + y;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
	}
}
