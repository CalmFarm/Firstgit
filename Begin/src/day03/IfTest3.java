package day03;
import java.util.Scanner;
public class IfTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("평균 점수를 입력하세요==>");
		float score = sc.nextFloat();
		System.out.println("평균점수:"+score);
		
		char o=' ';
		//지역변수(local varivable)는 반드시 초기값 설정 후 사용
		if(score>=90) {
			o='A';
		}else if(score>=80) {
			o='B';
		}else if(score>=70) {
			o='C';
		}else if(score>=60) {
			o='D';
		}else {
			o='F';
		}
		System.out.println("학점:"+o);
		
		
	}
}
