package day09;
//final + 변수 : 값 할당을 할 수 없게 함
//				public static final을 함께 사용한다.

class MyFinal{
	final public static int NONE=1;//상수
	int x=2;
}

public class FinalTest3 {

	public static void main(String[] args) {
		MyFinal a=new MyFinal();
		System.out.println(a.x);
		
		System.out.println(MyFinal.NONE);
		
		a.x=20;
		System.out.println(a.x);
		
	}

}
