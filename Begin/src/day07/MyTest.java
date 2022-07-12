package day07;

public class MyTest {

	public static void main(String[] args) {
		//MyDemo클래스의 변수 x,y값을 출력하세요
		MyDemo md=new MyDemo();
		
		System.out.println("md.x : "+md.x);
		System.out.println("MyDemo.y : "+MyDemo.y);
		
		md.bar();
		MyDemo.foo();
		
		System.out.println(md.star(9));
		String s=MyDemo.snail();
		System.out.println(s);
		
	}

}//class
