package day06;
/*
 * 학사관리 프로그램
 * - 객체 추출 : 학생, 교사, 직원, ...
 * 				==> class로 구성 (추상화)
 * 				학생=> Student
 * 					속성 : 학번, 이름, 학과, 연락처, ...
 * 					기능 : 정보를 보여주다, 공부하다, ...
 * 				교사=> Teacher
 * 					속성 : 2
 * 					기능 : 2
 *				직원=> Staff
 *					속성 : 2
 *					기능 : 2
 * */
public class School_App {

	public static void main(String[] args) {
		//학생, 교사, 직원 객체 각각 1개씩 생성
		//속성값 주고 메소드 호출
		Student a1=new Student();
		
		a1.num=123456;
		a1.name="홍길동";
		a1.num2="010-1111-1111";
		
		a1.showInfo();
		a1.work("공부", 3);
		
		System.out.println("--------------------");
		
		Teacher a2=new Teacher();
		
		a2.depa="물리학과";
		a2.name="이순신";
		a2.num2="010.1234.5678";
		
		a2.showInfo();
		
		System.out.println("--------------------");
		
		
	}

}
