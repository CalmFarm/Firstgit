package day09;
//MyInter 상속받아서 에러나지 않게 처리
//인터에핑스는 implements로 상속받는다.
//
public class MyClass implements MyInter, YourInter{
	
	@Override
	public void demo() {
		System.out.println("MyClass's demo()$$$$");
	}
	public int inter1() {
		return 100;
	}
	public void inter2(String s) {
		System.out.println(s.toUpperCase());
	}
	public static void main(String[] args) {
		MyInter mi=new MyClass();
		YourInter y1=new MyClass();
		
		System.out.println(((MyClass)mi).inter1());
		
		mi.demo();
		int num = y1.inter1();
		System.out.println(num);
		y1.inter2("zero");
		
		System.out.println(YourInter.PI);
	}
}
