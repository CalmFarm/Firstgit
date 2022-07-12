package day03;
/*
 * for loop > 구구단 7단 출력
 * */
public class ForTest2
{

	public static void main(String[] args) 
	{
		int dan=7;
		for (int x=1;x<10;x++)
		{
			System.out.println(dan*x);
		}
		
		int sum=0;
		for (int a=1;a<11;a++) 
		{
			sum +=a;
		}//1+2+3+....+10
		System.out.println("1~10까지의 합: " +sum);
		
		int x=1;
		for(int b=1;b<11;b++) {
			x *=b;
		}
		System.out.println("1~10까지의 곱: "+x);
		
		int sum1=0;
		for(int c=1;c<101;c++) {
			if(c%2 == 0)
				sum1=sum1+c;
		}
		System.out.println("1~100까지의 수 중 짝수들의 합: "+sum1);	
		
		for(int d=1;d<101;d++) {
			if(d%17 == 0)
			System.out.println(d);
		}
		
		for(char a='A';a<='Z';a++) {
			System.out.print(a+",");
		}
		
		
	}
	

}
