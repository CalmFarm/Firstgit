package day04;

public class MathTest1 {

	public static void main(String[] args) {
		//java.lang.Math클래스의 멤버변수
		//public static final double PI: 상수 원주율
		System.out.println(Math.PI);
		//static붙은 변수들은 앞에 클래스명을 붙여준다 : "클래스명.변수"
		
		//메소드 : 기능을 가지고 있다.
		//static메소드(클래스 메소드): 클래스명.메소드명(값)
		
		//public static double sqrt​(double a) : 매개변수 a의 제곱근을 구해서 반환
		double b=Math.sqrt(64);
		System.out.println("64의 제곱근: " + b);
		
		double num=45.0123;
		//public static double ceil​(double a) : a의 올림값 반환
		double c=Math.ceil(num);
		System.out.println(num+"의 올림값:"+c);
		//public static double floor​(double a) : a의 내림값 반환
		double d=Math.floor(num);
		System.out.println(num+"의 내림값:"+d);
		//public static int round​(float a) : a의 반올림값을 int로 변환
		long e=Math.round(num);
		System.out.println(num+"의 반올림값:"+e);
		
		
		//public static double random()
		//:0.0<= r < 1.0 사이의 임의 난수를 발생시켜 반환
		double f=Math.random();
		System.out.println("Ran : "+f);
		
		double q=Math.random();
		int qa=(int)(q*10);
		System.out.println("문제1 :"+qa);
		
		int l=(int)(Math.random()*10+5);
		System.out.println("r5 : "+l);
		//int x = (int)(Math.random()*범위+시작수)
		
		int x=(int)(Math.random()*47+16);
		System.out.println("문제3 :"+x);
		
		
		char z=(char)(Math.random()*26+'A');
		System.out.println("랜덤 알파벳 : "+ z);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				char ch=(char)(Math.random()*26+'A');
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
		
	}

}
