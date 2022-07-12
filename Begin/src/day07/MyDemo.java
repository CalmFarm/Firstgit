package day07;

public class MyDemo {
	int x=50;
	static int y=70;
	
	public static void foo() {
		System.out.println("foo()...");
	}
	
	public void bar() {
		System.out.println("bar()...");
	}
	
	public String star(int n) {
		String a="";
		for(int i=0;i<n;i++) {
			a += "★";
		}
		return a;
	}
	
	public static String snail() {
		return "@@@@";
	}
	
}//class
