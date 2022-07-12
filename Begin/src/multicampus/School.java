package multicampus;
import java.util.*;
public class School {
	
	//School has a students[배열]
	static Student[] arr=new Student[3];//배열 DB같은 역할
	static int count=0;//배열의 인덱스 번호로 사용할 변수
	
	//--------------------------------------------------------------
	public static void showMenu() {
		System.out.println("**** SchoolApp v1.0 ****");
		System.out.println("** 1. 등		록         **");
		System.out.println("** 2. 출		력         **");
		System.out.println("** 3. 검 	색         **");
		System.out.println("** 4. 삭 	제         **");
		System.out.println("** 9. 종 	료         **");
		System.out.println("************************");
		System.out.println("메뉴 번호를 입력하세요 =>");
		System.out.println("************************");
	}
	//----------------------------------------------------------------
	public static void register() {
		Student a1=new Student();
		a1.inputInfo();
		System.out.println("--등록한 정보------------");
		a1.showInfo();
		
		System.out.println("입력한 학생 정보를 저장할까요? [1.yes 2.no]");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num == 1) {
			//a1을 배열에 저장
			try {
				arr[count]=a1;
				count++;
				System.out.println("현재 등록된 인원: "+count);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("등록 마감! 현재인원 : " + count);
			}
		}
	}
	//------------------------------------------------------------
	
	/** 등록된ㄷ 모든 학생정보를 출력하는 메소드*/
	public void printAll() {
			for(int i=0;i<count;i++) {
				Student s=arr[i];
				//System.out.print(s);
				System.out.println("----학생 정보----");
				s.showInfo();
			}
	}//===========================================
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School obj=new School();
		int num=0;
		do {
			School.showMenu();
			num=sc.nextInt();
			if( (num <=0) || (num > 4 && num!=9) ) {
				System.out.println("메뉴에 없는 번호입니다. 다시 입력하세요.");
				continue;
			}
			switch(num){
			case 1: //등록
				School.register(); //static 메소드 (클래스 메소드)
				break;
			case 2: //출력
				obj.printAll();// non-static 메소드 (인스턴스 메소드)
				break;
			case 3: //검색
				break;
			case 4: //삭제
			}
		}while(num!=9);
		System.out.println("종료!");
		
		
		
		
		
		
		
	}//main
	
}//class