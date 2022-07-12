package day03;
//java.util.scanner 클래스이용 입력받기
import java.util.Scanner;

public class IfTest2 {
/*
 * if(조건식){
 *    실행문
 * }else{
 *    실행문
 * }
 * -----------------------------
 * 다중 if ~ else if ~ else if ~~else
 * */
	public static void main(String[] args) {
		//Scarnner : 클래스 [참조형] => new연산자료 이용해서 객체를 생성해서 사용
		Scanner sc = new Scanner(System.in);
		//System.out : 출력
		//System.in : 입력
		
		System.out.println("정수 입력=>");
		int input= sc.nextInt();//정수를 입력받아서 사용자 입력한 값을 반환
					//nextFloat(),nextDouble() int input=sc.nextInt();
		System.out.println("input: "+input);
		
		//input값이 짝수면 "짝수입니다." 출력하는 if문
		if (input%2==00){
			System.out.println(input+"=짝수입니다.");
		}else {
			System.out.println(input+"은 홀수입니다.");
		}
		System.out.println("The End");//조건과 상관없이 실행
		
	}

}
