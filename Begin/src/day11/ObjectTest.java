package day11;
import java.util.*;
import day10.Student;
public class ObjectTest {

	public static void main(String[] args) {
		//java.lang.Object 클래스 : 모든 클래스의 부모
		Object o1=new Object();
		System.out.println("o1 : "+o1);
		System.out.println("o1 : "+o1.toString());
/*	
* toString()메서드는 해당 객체에 대한 정보를 문자열로 출력
* 재정의 하지 않았다면 " 클래스이름@해시코드" 반환
* */
		String s1=new String("Hello");
		System.out.println(s1);
		System.out.println("s1.toString : "+s1.toString());
		//String클래스에서는 toString()을 오버라이드(재정의)하고 있다.
		
		Date d1=new Date();
		System.out.println(d1);
		
		Student st1=new Student(100,"홍길동");
		Student st2=new Student(101,"가나다");
		Student st3=st2;
		Student st4=new Student(101,"가나다");
		System.out.println(st1);
		// == : 기본자료형일 때 값을 비교, 참조형일 때는 주소값을 비교한다.
		System.out.println("st1==st2: "+(st1==st2));
		System.out.println("st2==st3: "+(st2==st3));
		
		//Object클래스의 equals() 메서드 :주소값을 비교하여 같으면 true반환
		System.out.println("st1.equals(st2) : "+st1.equals(st2));
		System.out.println("st3.equals(st2) : "+st3.equals(st2));
		//st4, st2 equals() 비교
		System.out.println("st4.equals(st2) : "+st4.equals(st2));
		
		//Student클래스에서 equals()메소드를 오버라이드 하세요
		//id값과 name값이 같으면 true를 반환하도록 재정의
		
		System.out.println("$$$$$$$$$ String Class $$$$$$$$$");
		String a1 = "Hello";//값을 직접 변수에 넣는걸 리터럴
		String a2 = "Hello";
		String a3 = new String("Hello");
		String a4 = new String("Hello");
		
		// == : 주소 값 비교
		System.out.println(a1==a2); // true
		System.out.println(a1==a3); // false
		System.out.println(a3==a4); // false
		// equals () : 문자열 비교
		//a1.equals(a2) true
		//a1.equals(a3) true
		//a3.equals(a4) true
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a3.equals(a4));
		
		
		
	}

}
