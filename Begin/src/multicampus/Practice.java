package multicampus;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in); 
		
		System.out.println("숫자를 입력해 주세요.");
		int b = 0;
		b = a.nextInt();

		int sum=0;
		int n=0;

		while(b != 0) { 
		sum += b;
		n++;
		b = a.nextInt();
		}
		System.out.println("수의 개수는"+n+"개이며 평균은"+(double)sum/n);
		a.close();
		} 
}
		



