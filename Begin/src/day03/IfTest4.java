package day03;
import java.util.*;
public class IfTest4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("0~9, 알파벳, 기타 문자를 1자만 입력하세요=>");
		String input=sc.next(); //String next()문자열을 입력받음
		System.out.println("input: "+input);//String 클래스가 가진 메소드:
		/*
		 * char charAt(int index): 문자열의 특정 index위치의 문자를 추출하여 변환한다
		 */
		char ch=input.charAt(0);//첫 문자 추출
		System.out.println("ch: "+ch);
		/*ch값이 0 ~ 9 값이면"숫자입니다."출력
		 * 알파벳 대문자 또는 소문자 이면 "알파밧엡니다."
		 * 그 외의 문자는 "기타문자"
		 * */
		
		//블럭설정후 Ctrl+Shift+/:주석처리
		
		if(ch>='0' && ch<='9') {
			System.out.println("number");
		}else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("alphabet");
		}else
			System.out.println("other");
		
		
		
	}
}


