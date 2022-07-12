package day07;

public class Demo {
	
	int x=10;//멤버변수
	double pi=3.14;//멤버변수 [ 인스턴스 변수 ]
	
	static String STR="Hello";//클래스 변수(static변수)
	
	
	//멤버 메소드[인스턴스 메소드]
	public void sub() {
		this.x=100;
		this.pi=5.55;
	}
	
	//클래스 메소드=static메소드
	public static void main(String[] args) {
		//this.x=100;//[x] static메소드 안에서는 this사용 불가 : 문법
	Demo dm=new Demo();
	dm.x=200;//객체명.변수
	System.out.println("dm.x: "+dm.x);
	
	dm.sub();
	System.out.println("dm.x: "+dm.x);
	System.out.println("dm.pi: "+dm.pi);
	
	System.out.println("Demo.STR : "+Demo.STR);
	
	
	
	
	}

}
