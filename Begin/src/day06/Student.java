package day06;

public class Student {
	int num;
	String name;
	String num2;
	
	public void showInfo() {
		System.out.println("학생 정보입니다.");
		System.out.println("학번 : " + num);
		System.out.println("이름 : "+ name);
		System.out.println("연락처 : "+ num2);
	}
	
	public void work(String type, int time) {
		switch(type) {
		case "공부":
			System.out.println("공부 시간 : "+time+"시간 진행 중");
			break;
		default:
			System.out.println("퇴실");
		}
	
	}
}
