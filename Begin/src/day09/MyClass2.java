package day09;
interface Inter1{
	void a();
}/////////////////
interface Inter2{
	String b();
}////////////////
abstract class AbcClass{
	abstract void c();
}///////////////
//인터페이스가 인터페이스 상속 받을때는extends,다중상속도가능
interface HisInter extends Inter1, Inter2{
	String STR="Hello";
}
//[1] MyClass2가 AbcClass,HisInter상속
public class MyClass2 extends AbcClass implements HisInter{
	
	@Override
	public void a() {
		System.out.println("void a()");
	}
	public String b() {
		return "String b()";
	}
	void c() {
		System.out.println("void c()");
	}

	public static void main(String[] args) {
		//[2]MyClass2타입 객체 생성해서 메소드 각각 호출 STR값도 출력
		MyClass2 mc=new MyClass2();
		mc.c();
		mc.a();
		System.out.println(mc.b());
		System.out.println(HisInter.STR);
		System.out.println("$$$$$$$$$$$$$$$");
		
		//[3]HisInter타입의 변수 선언하고 myclass2객체 생성해서 메소드 가각호출하고 STR값 출력
		HisInter hi=new MyClass2();
		hi.a();
		System.out.println(hi.b());
		System.out.println(HisInter.STR);
		System.out.println("!@#$!@#$!@#$");
		
		//[4]AbcClass				 myclass2객체 생성    메소드 각각호출하고 STR값 출력
		
		AbcClass ac=new MyClass2();
		ac.c();
		((MyClass2)ac).a();
	}

}
