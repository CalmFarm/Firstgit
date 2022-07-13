package multicampus;
import java.util.*;
public class ClassScore {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("학생의 학년을 입력하세요 : ");
        int grade = sc.nextInt();
 
        System.out.print("학생의 점수를 입력하세요 : ");
        int score = sc.nextInt();
 
        if (score >= 60) { 
            if (grade != 4) 
                System.out.println("합격!");
            else if (score >= 70)
                System.out.println("합격!");
            else
                System.out.println("불합격");
        }else 
            System.out.println("불합격");
    }
}


