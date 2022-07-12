package day02;

public class UnaryOperator {
	
	public static void main(String[] args) 
	{
		System.out.println("1. 단항 연산자(부호연산자 + , -)");
		int a=9;
		System.out.println(+a);
		System.out.println(-a);
		
		System.out.println("2. 증감연산자(++,--)");
		int b=5;
		long c=11;
		b++; //b=b+1
		c--; //c=c-1
		System.out.println(b);//6
		System.out.println(c);//10
		++b;
		--c;
		System.out.println(b);//7
		System.out.println(c);//9
		// ++--가 단도긍로 사용 될때는 변수 앞에오나 뒤에오나 별 창 ㅣ없다.
		//하지만 다른 수식과 함께 사용되면 ++,--가 앞에 오는 것과 뒤에오는것은 차이가 있다.
		
		float d=5.5f;
		double e=7.5;
		System.out.println(++d);//5.5
		System.out.println("d: "+d);//6.5
		
		System.out.println(--e);//7.5
		System.out.println("e: "+e);//6.5
		
		int x=10;
		int y=x++;
		System.out.println("x="+x);//11
		System.out.println("y="+y);//10
		
		x=10;
		int z=++x;
		System.out.println("x="+x);//11
		System.out.println("z="+z);//11
		
		System.out.println("3.비트별 not 연산자 : ~");
		//정수값을 비트로 바꾸고 연산ㅇ르 수행하는데, 비트별 not연산자는 1은0으로 바꾸고
		//0은 1로 바꾸는 연산자
		//3:  0000000 0000000 00000000 00000011
		//~3: 1111111 1111111 11111111 11111100
		//-(1*2^31)+(1*2^30)+ ...
		int m=3;
		System.out.println(m);
		System.out.println(~m);
		
		int n=0xfffffff1;
		//1111 1111 1111 1111 1111 1111 1111 0001
		//0000 0000 0000 0000 0000 0000 0000 1110
		//~ : 2 4 8 =14
		System.out.println("~n: "+(~n));
		
		//42: 00000000 0000000 00000000 00101010
		//~42:11111111 1111111 11111111 11010101
		System.out.println(~42);
		
		System.out.println("4. 논리 부정 연산자: !");
		//boolean형에만 사용가능 int눈 불가
		//true .>false, false.>true로
		boolean bo=true;
		System.out.println(bo);
		System.out.println(!bo);
		System.out.println(!(3<2));
		
		int fo=5;
		System.out.println(fo==5.0);//==등가연산자 : 기본자료형에서는 값이 같은지 비교
		System.out.println(fo!=5.0);// != : 기본자료형에서는 값이 다르면 true,같으면 false
		
	}	
}
