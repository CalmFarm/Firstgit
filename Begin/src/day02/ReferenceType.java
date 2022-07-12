package day02;
import java.util.*;

public class ReferenceType {

	public static void main(String[] agrs)
	{
		System.out.println("참조형(reference type)");
		/* 1클래스형 : string, date , ...
		 * 2인터페이스형: 
		 * 3배열 : String[],int[], ...
		 * :참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다.
		 * 단 예외, String의 경우 자주 사용되는 유형이므로 기본자료형처럼
		 * 문자열 값(리터럴)을 직접 할당 가능
		*/
		String s1=new String("Larva");
		System.out.println("s1="+s1);
		//java.util패키지
		Date today=new Date();
		System.out.println("today="+today);
		
		String s2="Halo";
		System.out.println("s2="+s2);
		System.out.println(s2.toUpperCase());//touppercase 대문자
		System.out.println(s2.toLowerCase());//소문자
		/* 기본자료형 : 주로 연산에 사용
		 * 참조형: [데이터[변수]+기능[메소드]]
		 * */
		
		int a=20;
		int b=30;
		System.out.println(a+b+"<=합");
		System.out.println("합=>"+(a+b));
		
		
		
	}
}
