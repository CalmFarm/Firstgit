package day02;

public class MyOperator {
	
	public static void main(String[] args) 
	{
		System.out.println("1.산술 연산자-----------------");
		// + - * /[나눈 몫] %[나머지값]
		int a=10;
		System.out.println(a-6);
		System.out.println(a*3);
		System.out.println(a/3);//3
		System.out.println(a%3);//1
		
		double b=10;
		System.out.println(b/3);//double/int .> 결과 double
		
		System.out.println("2.Shift연산자--<<,>>,>>>---------");
		//42: 00000000 0000000 00000000 00101010
		System.out.println(42>>3); // 5
		System.out.println(42<<3); //336
		System.out.println(42>>>3); //5
		/* 시프트 연산자
		1) >> :  오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 부호비트로 채운다.
	    2) << : 왼쪽으로 비트수 만큼 이동
					뒤에 남은 빈칸은 0으로 채운다.
		3) >>> : 오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 무조건 0으로 채운다.
		 */

		//-43:11111111 11111111 11111111 11010101
		
		System.out.println(-43<<2);
		// 101010100 -172
		System.out.println(-43>>2);
		// 10101 -16+4+1
		System.out.println(-43>>>2);
		// 00 11111111 11111111 11111111 110101
		
		System.out.println("3.비교연산자: ==,!= , > , < , <=, instanceof ");
		int m=70;
		int n=160;
		
		// != : 다른가 ?
		// == : 같은가 ?
		// 참조변수 instanceof 클래스명: 참조변수가 클래스의 객체인가 ?
		
		System.out.println(m>=n); //false
		
		if(m>n) {
			System.out.println("OOOO");
			}
		else if(m<n) {
			System.out.println("XXXX");
			}
		
	}
}
