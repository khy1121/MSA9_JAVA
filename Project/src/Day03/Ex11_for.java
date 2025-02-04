package Day03;

public class Ex11_for {
	
	public static void main(String[] args) {
		//1~10까지 출력
		int a=1;
		for(a=1; a<=10; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();
		System.out.println();
		
		//50~100까지 출력
		//방법1
		for(int i=50; i<=100; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println();
		
		//50~100까지 출력
		//방법2
		int i;
		for(i=50; i<=100; i++) {
			System.out.print(i+ " ");
			if((i+1)%10==0)
				System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//1~20까지 짝수만 출력
		//방법 1
		for(int j=1; j<=20; j++) {
			if(j%2==0)
				System.out.print(j + " ");
		}
		
		System.out.println();
		//1~20까지 짝수만 출력
		//방법 2
		for(int y=2; y<20; y+=2) {
			System.out.print(y + " ");
		
		}
		
		System.out.println();
		//1~20까지 홀수만 출력
		for(int x=1; x<=20; x++) {
			if(x%2!=0)
				System.out.print(x + " ");
		}
		System.out.println();
	}
}
