package my.mypack;

public class AAA {//public클래스 : 어디서든 접근 가능 지정자
	
	public static void main(String [] args) {
		BBB b=new BBB();
		b.funcB();
		AAA a=new AAA();
		a.funcA();
	}
	
	public void funcA() {
		System.out.println("AAA");
	}
}
class BBB{//생략형 지정자(default지정자,package지정자):같은 패키지안에서만 접근가능
	public void funcB() {
		System.out.println("BBB");
	}
}
