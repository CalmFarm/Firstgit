package day09;
//도형 클래스 => 추상클래스
//추상클래스: 일반 멤버변수,멤버 메소드, + 추상메소드 / 가질 수 있다.
abstract public class Shape {
	int x,y;//멤버 변수
	
	public String getInfo() {
		return "나는 도형 클래스입니다.";//멤버 메소드
	}
	
	abstract public void area(int a,int b);
	//추상 메소드 abstract를 붙여야한다.
	//추상메소드를 1개 이상 가진 클래스는 역시 추상클래스여야 한다.
}
