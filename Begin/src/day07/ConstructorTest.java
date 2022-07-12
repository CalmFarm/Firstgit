package day07;

public class ConstructorTest {

	public static void main(String[] args) {
		Person p1=new Person();//기본 생성자
		
		System.out.println("이름: "+p1.name);
		System.out.println("나이: "+p1.age);
		
		Person p2=new Person("홍길동");
		System.out.println("p2.name : "+p2.name);
		System.out.println("p2.age : "+p2.age );
		
		Person p3=new Person("이순신", 22);
		System.out.println("이름 : "+p3.name+" / 나이 : "+p3.age);
		
		Person p4=new Person(33, "가나다");
		System.out.println("이름 : "+p4.name+" / 나이 : "+p4.age);
	}

}
