package day08;
//상속성 : Inheritance
/*
 * 부모 클래스
 * 
 * 자식 클래스 extends 부모클래스
 * => 부모크랠스가 가진 멤버변수 ,메소드를 자식클래스에서 그대로 물려 받는다
 * 상속은 "is a"관계가 성립
 *  - 자바는 1개의 클래스만 상속받을 수 있다.(단일상속)
 *  - C++(다중상속 가능)
 * */
public class Inheritance {

	public static void main(String[] args) {
		Human h1=new Human();
		
		String s=h1.getInfo();
		System.out.println(s);
		
		Superman s1=new Superman();
		s1.name="슈퍼비";
		s1.height=170;
		s1.power=555;
		System.out.println(s1.getInfo());
		
		Aquaman a1=new Aquaman();
		a1.name="피즈";
		a1.height=183;
		a1.speed=78.513;
		System.out.println(a1.getInfo());
		
		System.out.println(s1.getInfo("--슈퍼맨 정보"));
		s1.getInfo("power UP", 100);
		
		Superman s2=new Superman("울트라 슈퍼맨",200,300) ;
		s2.getInfo("울트라 슈퍼맨 파워 다운", -100);
		
		System.out.println("\n"+a1.getInfo("실험"));
		
	}

}
