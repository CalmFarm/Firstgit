package day11;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		//Member 객체 3개 생성후 HashSet에 저장
		Member m1=new Member("Knish",31);
		Member m2=new Member("Mike",22);
		Member m3=new Member("Worm",25);
		Member m4=new Member("Worm",25);
		Member m5=new Member("Worm",33);
		
		Set<Member> set=new HashSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		System.out.println("set.size() : "+set.size());
		
		//Iterator()메서드로 저장된 정보 출력
		Iterator<Member> it = set.iterator();
		for(int i=1;it.hasNext();i++) {
			Member user=it.next();
			System.out.println(i+". "+user.name+","+user.age);
		}
		
		System.out.println("m3.hashCode() : "+m3.hashCode());
		System.out.println("m4.hashCode() : "+m4.hashCode());
		System.out.println("m1.hashCode() : "+m1.hashCode());
		System.out.println("m5.hashCode() : "+m5.hashCode());
		
		
		
	}//main

}//class
