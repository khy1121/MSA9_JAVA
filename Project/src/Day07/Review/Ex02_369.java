package Day07.Review;

public class Ex02_369 {
	//정수 1부터 100까지 수를 반복하여 출력하면서 
	//3 6 9에 해당될때는 자리수마다 369가 되는 개수 만큼 정수 대신 " * " 출력
	
	public static void main(String[] args) {
		int i=0;
		for(i=1; i<=100; i++) {
			if(i%10==0) {
				System.out.println();
			}
			//십의 자리 둘다 일의 자리가 3 6 9 인 경우
			else if((i/10) % 3==0 &&  (i%10) % 3==0 )
				System.out.print(" ** ");
			//십의 자리 또는 일의 자리가 3 6 9 인 경우
			else if( (i/10)%3==0 || (i%10)%3==0 ) 
				System.out.print("* ");
			else
				System.out.print(i + " ");
		}
	}
}
