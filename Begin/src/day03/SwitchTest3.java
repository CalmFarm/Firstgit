package day03;
import java.util.*;
/*문제2] ***수도요금 계산***************
-메뉴 (1 ~ 3), 사용량 (liter)
   1. 가정용 (liter당 50원)
   2. 상업용 (liter당 45원)
   3. 공업용 (liter당 30원)
   =>메뉴 선택후 사용량을 입력받는다.
 -출력될 내용
  1) 사용자 코드, 사용량, 총수도요금
   cf)사용요금=사용량 * 리터당 가격
      총수도요금=수도사용요금+세금(요금의
          5%)
*/

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----------Menu---------");
		System.out.println("1.가정용 (liter당 50원)");
		System.out.println("2.상업용 (liter당 45원)");
		System.out.println("3.공업용 (liter당 30원)");
		System.out.println("-----------------------");
		System.out.println("메뉴를 선택하세요 ==>");
		int menu=sc.nextInt(); //메뉴번호
		System.out.println("사용량을 입력하세요==>");
		int use=sc.nextInt(); //사용량
		
		int result=0;
		switch(menu) {
			case 1:
				result=use*50;
				break;
			case 2:
				result=use*45;
				break;
			case 3:
				result=use*30;
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				return;
			}
		System.out.println("메뉴 :"+menu);
		System.out.println("사용량 :"+use);
		System.out.println("총 수도요금 :"+result*1.05);
	}
}



