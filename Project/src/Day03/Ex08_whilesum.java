package Day03;

public class Ex08_whilesum {
		
		
		public static void main(String[] args) {
			//1~1000까지 합 반복문으로
			
			int sum=0;
			int x=1;
			
//			방법1
			while(x<=1000) {
				sum=sum+x;
				x++;
			}System.out.print(sum);
		
			System.out.println();
			
			
			int plus=0;
			int a=1;
			
			//방법 2
			while(a<=1000) {
				plus=plus+a++;
			}System.out.print(sum);
		}
}
