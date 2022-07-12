package day03;
/* switch ~ case 문:
 * 
 *  switch()괄호한에 들어가는 값,변수,수식 ==>int 이하 자료형 (byte,short,char,int)or String 만 가능
 * 
 * switch(값|수식|변수){
 * 		case 값1:
 * 			실행문;
 * 			break;
 * 		case 값2:
 * 			실행문;
 * 			break;
 * 		...
 * 		default:
 * 			실행문;
 * }
 * */
import java.util.*;
public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("연산자를 입력하세요[+,-,*,/]");
		String x=sc.next();
		
		//char oper='+';
		char abc=x.charAt(0);
		
		System.out.println("정수1 입력==>");
		int a=sc.nextInt();
		
		System.out.println("정수2 입력==>");
		int b=sc.nextInt();
		
		int result=0;
		
		switch(abc) 
		{
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break; //소속된 블럭{}을 이탈한다
		default:
			System.out.println("없는 연산자");
			return;/*보조제어문:제어흐름을되돌린다(return문을 갖는 메소드>main()
					 을 호출한쪽으로 돌아간다.*/
		} 
		System.out.println(a+x+b+"="+result);
		//System.out.println("result: "+result);
		
		
		
	}

}





