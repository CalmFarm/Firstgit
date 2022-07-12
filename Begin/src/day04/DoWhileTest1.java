package day04;
/* 변수 선언문;
 * do{
 * 		실행문;
 * 		증감식;
 * 	}while(조건식)
 * 
 * while문의 경구 조건식이 true면 반복 실행.
 * do-while문의 경우 조건식이 false일지라도 한 번은 실행하고 루프문을 벗어남.
 *  true이면 반복 실행.
 * */
public class DoWhileTest1 {
	
	public static void main(String[] args) {
		int a=5;
		do {
			System.out.println("Hi :" + a);
			a -- ;
		}while(a>2);
		
		int b=0;
		do {
			System.out.println("Java: " + b);
			b -= 10 ;
		}while(b>0);
		System.out.println("The end");
		
	}//main
}//class