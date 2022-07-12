package day03;
public class Day03Test 
{
	public static void main(String[] args) 
	{
		int x=15;
		if(x>10 && x<20) {
			System.out.println("true");}
		
		char ch='5';
		if(ch!=' ' && ch!='\t') {
			System.out.println("공백도 아니고 탭도 아님");}
		if(ch=='x' || ch=='X') {
			System.out.println("bye");}
		if(ch>='0'&&ch<='9') {
			System.out.println("숫자입니다.");}
		if(ch>='0' && ch<='9') {
			System.out.println("number");
			}else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
			System.out.println("alphabet");
		}else
			System.out.println("other");
		
		int year=2016;
		if(year%400==0 || (year%4==00 && year%100!=0)) {
			System.out.println(year+"년은 윤년입니다.");
		}
		boolean powerOn=false;
		if(powerOn==false) {
			System.out.println("powerON은 true");
		}
		// == : 참조형에서는 주소값을 비교한다. 기본자료형에서는 값을비교
		//String str="yes";
		String str=new String("yes");
		//문자열의 내용값을 비교하는 메소드:
		//boolean equals(Object o): 문자열의 내용이 같으면 true 반환
		if(str.equals("yes")) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		
		
		
		
	}
}