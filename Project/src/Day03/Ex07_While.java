//https://www.youtube.com/watch?v=UtFfSfYY4hY&list=PL4C2AmBC9jObL8hMgHe0qui_ZqnJaD640&index=18
package Day03;

public class Ex07_While {
		
	public static void main(String[] args) {
		//1~10까지 출력 반복문으로
		int x=0;
		while(x<10) {
			x++;
			System.out.print(x + "  ");
		}
		System.out.println("");
		
		
		int a=1;
		while (a<=10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println("");
		
		
		int b=1;
		while (b<=10) {
			System.out.print(b++ + " ");
		}
	}
}
