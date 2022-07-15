package day10;
import java.util.*;

public class VectorTest2 {

	public static void main(String[] args) {
		//[1] Student객체 3개 생성
		Student st1=new Student(1, "맷 데이먼 마이크");
		Student st2=new Student(2, "존 말코비치 KGB");
		Student st3=new Student(3, "에드워드 노튼 웜");
		
		//[2] Student를 저장할 Vector생성
		Vector<Student> v=new Vector<>();
		
		//[3] 벡터에 학생객체3개 저장
		v.add(st1);
		v.add(st2);
		v.addElement(st3);
		System.out.println("v.size() : "+v.size());
		
		//[4] for문 벡터 저장된 학생정보 출력
		for(Student a : v) {
			System.out.println("학번:"+a.getId()+"\t이름:"+a.getName());
		}
		
		//public Enumeration<E> elements()
		//public Iterator<E> 	iterator()
		
		/*Enumeration<E> elements()
		 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
		 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
		 * 관리하도록 해주는 인터페이스이다.
		 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
		 * 처리할 수 있는 메소드를 제공한다.
		 * # Enumeration의 경우**********************************
		 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
		 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
		 * 				없으면 false를 반환
		 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
		 *  			현재 가리키고 있는 요소를 반환한다.
		 * # Iterator의 경우**************************************
		 * 	- boolean hasNext()
		 *  - E next() 
		 * */
		System.out.println("$ 1,000,000 ");
		
		Enumeration<Student> en=v.elements();
		
		while(en.hasMoreElements()) {
			Student e=en.nextElement();
			System.out.println(e.getName()+":"+e.getId());
		}
		//;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		System.out.println("####");
		
		Iterator<Student> it=v.iterator();
		
		while(it.hasNext()) {
			Student i=it.next();
			System.out.println(i.getName()+"^"+i.getId());
		}
		//clear(), removeAll() : 모든 요소를 삭제한다.
		v.clear();
		System.out.println("CLEAR ALL");
		it=v.iterator();
		for(;it.hasNext();) {
			Student i=it.next();
			System.out.println(i.getName());
		}

		
	}//main

}//class
