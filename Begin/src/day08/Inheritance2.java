package day08;
/*하나의 자바파일에 여러 클래스를 구성할 경우
 * public 인 클래스는 1개만 존재해야 하며,
 * 파일명으로 된 클래스에게 public을 붙인다.*/

class Person{
	int no;
	String name;
	
	//public Person() {}
	
	public Person(int n,String m) {
		no=n;
		name=m;
	}
	
}//class person-------------------------------------
//자식 클래스의 생성자에서는 묵시적으로 super()를 호출한다.
//super():부모클래스의 기본생성자를 호출할때 사용하는 키워드
class Student extends Person{
	String major;
	public Student() {
		//super(); 묵시적으로 호출 ==> 기본생성자가 없어서 에러
		super(0,"홍길동");//이럴 경우 명시적으로 super(매게변수값)를 호출한다.
	}
}// -----------------------------------------------

class Teacher extends Person{
	String subjcet;
	public Teacher() {
		super(200,"최교사");
	}
	public Teacher(int no,String name, String subject) {
		super(no,name);
		this.subjcet=subject;
	}
}////////////////////////////////////////


public class Inheritance2 {

	public static void main(String[] args) {
		Person p1=new Person(1,"김일번");
		
	}//main

}//class
