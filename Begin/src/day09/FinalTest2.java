package day09;

class SuperDemo{
	
	void sub() {
		System.out.println("SuperDemo's sub()");
	}
	final void bar() {
		System.out.println("SuperDemo's bar()");
	}
}/////////////////////////////

class SubDemo extends SuperDemo{
	
	@Override
	void sub() {
		System.out.println("$19,621,800");
	}
}////////////////////

//final + method : 오버라이딩 할 수 없다.

public class FinalTest2 {

	public static void main(String[] args) {
		SuperDemo a=new SuperDemo();
		a.sub();
		a.bar();
		SubDemo b=new SubDemo();
		b.sub();
		b.bar();
	}

}
