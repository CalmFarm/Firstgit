package day08;

public class Super {
	int a=10;
	int b=20;
	
	
	public void func() {
		System.out.println("func() $$$$");
	}
	//Overload
	public String func(int a) {
		return "func(): a="+a;
	}
}