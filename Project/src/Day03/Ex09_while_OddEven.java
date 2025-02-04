package Day03;

public class Ex09_while_OddEven {
	//짝수 홀수 나누어서 합계 구하기
	//1~20까지 중 홀수의 합과 짝수의 합
	
	public static void main(String[] args) {
		
		int a=1;
		int oddSum=0;
		int evenSum=0;
		
		
		while(a<=20) {
			if(a%2==0) {
				evenSum = evenSum+a;
			}
			else {
				oddSum=oddSum+a;
			}
			a++;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
			
				
	}
}
