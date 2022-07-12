package day03;
/*
 * loop문
 *  [1] for루프문
 *  	for(변수 선언문);조건식;증감식;)
 *  	{
 *  		실행문;
 *  	}
 *  조건식 true일 동안 실행문을 반복해서 실행한다
 * */
public class ForTest1
{ int k;//멤버변수 초기화 하지않으면 기본값=0이 할당

	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
		for(int i=1;i<=7;i++) 
		{
			System.out.println("Hi World! : "+i);
		}
		System.out.println("The End!");
		
		int j=10;//지연 변수 초기화식
		for(;j>3;j--) 
		{
			System.out.println("Java: "+j);
		}
		System.out.println("The End $"+j);
		
		//for(;;) 무한루프
		//System.out.println("무한루프");
		
	}

}



