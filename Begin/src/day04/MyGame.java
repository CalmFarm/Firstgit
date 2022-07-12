package day04;
import java.util.*;
public class MyGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int comp=(int)(Math.random()*100 + 1);
		int count=0;//시도 횟수를 세기 위한 변수
		if(count>7) {
			System.out.println("시도 횟수(7번) 초과");
			//break;
			return;
		}
		while(true) {
			System.out.println("1~100사이의 정수를 입력하세요");
			int input=sc.nextInt();//정수 하나 입력
			
			if(input<1 || input > 100)
				continue;
			
			count++;
			
			if(comp==input) {
				System.out.println("정답!");
				break;
			}else if(comp>input) {
				System.out.println("더 큰 수를 입력하세요!");
			}else {
				System.out.println("더 작은 수를 입력하세요!");
			}
			
		}
		//출력할 결과 : "정답입니다." ,시도한 횟수
		//시도 횟수가 7번 넘어가면 "못 맞췄군요! 다음 기회에"

	}

}
