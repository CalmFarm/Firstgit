package day04;
/*
 * 보조제어문 : break,continue ==> 단독으로는 사용 불가,
 * 주 제어문과 함께 사용
 * */
public class BreakContinueTest1 {

	public static void main(String[] args) {
		
		System.out.println("1.----------------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				break;//가장 가까운 반복문을 벗어난다
			System.out.println("i= "+i);
		}
		
		System.out.println("2.----------------------");
		for(int i=0;i<3;i++) {
			if(i==1)
				continue;//조건에 맞으면 아래 문장을 실행하지않고 반복문 계속수행
			System.out.println("i= "+i);
		}
		
		System.out.println("3.------------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break;
				System.out.println("1="+i+" , k="+k);
			}
		}
		
		System.out.println("4.------------------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) continue;
				System.out.println("1="+i+" , k="+k);
			}
		}

		
		
		System.out.println("5.------------------------");
		outer: //label > 반복문 앞에 붙일 수 있음
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0;k<3;k++) {
				if(k==1) break outer; 
				System.out.println("1="+i+" , k="+k);
			}
		}
		
		System.out.println("6.------------------------");
		outer:
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0;k<3;k++) {
				if(k==1) continue outer;
				System.out.println("1="+i+" , k="+k);
			}
		}
		
		
		
		
	}//main

}//class
