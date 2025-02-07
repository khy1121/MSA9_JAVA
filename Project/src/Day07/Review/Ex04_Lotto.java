package Day07.Review;

public class Ex04_Lotto {
	
	

	public static void main(String[] args) {
		// Math.random() : 0.xxxxx ~ 0.9xxxxxx 사이의 난수를 반환하는 메소드
//		double random = Math.random(); // random = static 으로 정의됌
//		System.out.println(random);
//
//		// 1~6 사이의 정수 주사위
//		// (int) (random * 10)); = 0~9 까지
//		// (int) (random * 10)+1); = 1~10 까지
//		System.out.println((int) (Math.random() * 10));
//
//		// 1~6 사이의 정수 주사위
//		// (int) (random * 6)); = 0~5 까지
//		// (int) (random * 6)+1); = 1~6 까지
//		int dice =((int) (Math.random() * 6)+1);
//		System.out.println(dice);
//		
//		// 1~20
//		int a =((int) (Math.random() * 20)+1);
//		System.out.println(a);
//		
//		// -20~20
//		int b =((int) (Math.random() * 41)-20);
//		System.out.println(b);
		
		
		// 1~ 45
		int lotto []= new int [6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=((int) (Math.random() * 45)+1); 
			for(int j=i-1; j>=0; j--) {
				if(lotto[j]==lotto[i]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(lotto[j] >lotto[i]) {
					int tmp=0;
					tmp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
					
					
				}
			}
		}
		

		for (int i : lotto) {
			System.out.print(i +" ");
		}
		
	}
}
