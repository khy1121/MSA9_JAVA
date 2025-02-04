package Day03;

public class Ex13_guguAll {
	
	public static void main(String[] args) {
		//1단부터 9단까지 전부 출력하기
		int i,j;
		int multi =0;
		for(i=1; i<10; i++) {
			System.out.println(i + "단 시작!!!!");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");	
			System.out.println();		
			for(j=1; j<10; j++) {
				multi=i*j;
				System.out.print(i +" X  "+  j + " = " + (i*j));
				System.out.print("\t");
			}		
			System.out.println();
			System.out.println();	
		}
		
	}
}
