package day04;
import java.util.*;
public class Test1 {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요==>");
		String value=sc.next();
		//반복문 이용해서 입력값들의 문자를 하나씩 추출한뒤,
		//해당 문자가 숫자 범위가 맞으면 "숫자입니다."
		//한개라도 숫자가 아닌 문자가 있으면 "숫자가 아닙니다,다시 입력하세요"를 출력하세요
		char ch = ' ';		
		boolean isNumber = true;	
		
		for (int i = 0; i < value.length(); i++) {
			
			ch = value.charAt(i);
			
			System.out.println("text : " + ch);
			
			if (!('0' <= ch && ch <= '9')) {
				isNumber = false;
				break;
				}
		}//for
		
		if (isNumber){
			System.out.println(value + "는 숫자입니다.");
			} 
		else {
			System.out.println(value + "는 숫자가  아닙니다, 다시입력하세요==>");
		}
		
		int num=10;
		System.out.println((num == 0) ? 0 : ((num > 0) ? "양수" : "음수"));
		
		int num1=456;
		System.out.println((num1%100 != 0) ? (num1 - num1%100) : num1);

	
}
}//class

