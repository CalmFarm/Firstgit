package day12;
//매개변수와 리턴값이 없는 람다식
@FunctionalInterface
interface MyFunc{
	void func();
}
//매개변수가 있는 람다식
@FunctionalInterface
interface YourFunc{
	void foo(int x);
}
//매개변수를 받아 값을 반환하는 람다식
@FunctionalInterface
interface HerFunc{
	String makeStr(String a,String b);
}
public class LambdaTest2 {

	public static void main(String[] args) {
		MyFunc mf=()-> System.out.println("$$$$");
		mf.func();
		
		MyFunc mf2=()-> System.out.println("xD");
		mf2.func();
		
		YourFunc yf = x -> System.out.println(x*x);
		yf.foo(5);
		
		YourFunc yf2 = x -> System.out.println(x-3);
		yf2.foo(10);
		
		HerFunc hf = (a,b) -> a+","+b;
		System.out.println(hf.makeStr("abc", "def"));
		
		HerFunc hf2 = (a,b) -> {
			char c1=a.charAt(0);
			char c2=b.charAt(0);
			String s1 = a.substring(1);
			String s2 = b.substring(1);
			
			String allstr = (c1+"").toUpperCase()+s1+" "+String.valueOf(c2).toUpperCase()+s2;
			return allstr;
		};
		System.out.println(hf2.makeStr("hi", "java"));
	
	}
}