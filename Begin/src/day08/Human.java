package day08;
//부모 클래스 : Super class, Base class
public class Human {
	String name;
	int height;
	
	public Human() {
		this("홍길동",180);
	}
	public Human(String n,int h) {
		name=n;
		height=h;
	}
	public String getInfo() {
		return "이름 : "+name+"\n키 : "+height;
	}
}//class