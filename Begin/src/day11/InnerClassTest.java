package day11;

public class InnerClassTest {

	public static void main(String[] args) {
		Outer o=new Outer();
		System.out.println(o.a);
		System.out.println(Outer.b);
		
		Outer.Inner oin=o.new Inner();
		System.out.println(oin.c);
		oin.sub();
		
		Outer.SInner osin=new Outer.SInner();
		System.out.println(osin.d);
		
		System.out.println(Outer.SInner.e);
		osin.foo();
		Outer.SInner.bar();
		
	}

}
