package day09;

class Super{
	void foo() {
		System.out.println("Super's foo()");
		
	}
}//super class

//final + class : 다른 클래스에서 상속받지 못하도록
final class Sub extends Super{
	
	@Override
	protected void foo() {
	System.out.println("Sub's foo()");	
	}
}//Sub class

//ex) java.lang.String클래스 => final 클래스
public class FinalTest1
{

	public static void main(String[] args) 
	{
		
	}

}
