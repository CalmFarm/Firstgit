package day04;
import java.util.*;
/*
 * 변수 선언문
 * while(조건식)
 * {
 * 		실행문;
 * 		증감식;
 * }
 * 
 * 조건식이 true면 실행문을 실행
 * 		  false면 while문 벗어난다
 * */
public class WhileTest1 {

	public static void main(String[] args) {
		int a=1;
		while(a<5) {
			System.out.println("Hello: "+a);
			a++ ;
		}//while/////////
		System.out.println("The End "+a);
		
		int b=10;
		while(b>0) {
			System.out.println("Java: "+b);
			b -= 2;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 몇단을 출력할까요=>");
		int dan=sc.nextInt();
		
		int x=1;
		while(x<10) {
			System.out.println(dan+"x"+x+"="+dan*x);
			x ++ ;
		}
		
		System.out.println();
		
		int j = 2;
		int k = 1;
		while(k<10) {
			while(j<10) {
				System.out.print(j+" x "+ k + " = "+j*k +"\t ");
				j++;
			}
			System.out.println();
			j = 2;
			k++;
		}
		

	}//main{}//////////////////////////////////

}//class{}//////////////////////////////