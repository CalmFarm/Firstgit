package multicampus;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		Scanner month=new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int input=month.nextInt();
		
		
		switch(input) {
			case 1 : System.out.println("겨울");
			break;
			case 2 : System.out.println("겨울");
			break;
			case 3 : System.out.println("봄");
			break;
			case 4 : System.out.println("봄");
			break;
			case 5 : System.out.println("봄");
			break;
			case 6 : System.out.println("여름");
			break;
			case 7 : System.out.println("여름");
			break;
			case 8 : System.out.println("여름");
			break;
			case 9 : System.out.println("가을");
			break;
			case 10 : System.out.println("가을");
			break;
			case 11: System.out.println("가을");
			break;
			case 12 : System.out.println("겨울");
			break;
			
			default:
				System.out.println("1~12월의 숫자를 넣어주십시오");
				break;
		}
		
	}

}
