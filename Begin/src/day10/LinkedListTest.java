package day10;
import java.util.*;
/*
 * LinkedList : 인접 참조를 링크해서 체인처럼 관리하는 컬렉션
 * 				데이터를 저장한 후 수시로 데이터를 삽입하거나 삭제, 수정해야 할 경우 적합
 * ArrayList : 순차적으로 데이터를 저장할때 적합함. 검색할때 상대적으로 빠름
 * 
 */
public class LinkedListTest {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		List<String> list2=new LinkedList<>();
		//ArrayList 데이터 1만건 저장 후 수행시간 측정
		
		long startTime = System.nanoTime();
		for(int i=0;i<100000;i++) {
			list1.add(0,"AKs : "+i);
		}
		long endTime = System.nanoTime();
		
		long gapTime = endTime-startTime;
		System.out.println("ArrayList 경과 시간 "+gapTime+" ns");
		System.out.println("list1.size() : "+list1.size());
		
		System.out.println("구분선----------------------------");
		
		startTime=System.nanoTime();
		for(int i=0;i<100000;i++) {
			list2.add(0,"Aks : "+i);
		}
		endTime=System.nanoTime();
		gapTime = endTime-startTime;
		System.out.println("LinkedLIst 경과 시간 : "+gapTime+" ns");
		System.out.println("list1.size() : "+list2.size());
		/*
		 * 				순차적으로 추가, 삭제 | 중간에 삽입, 삭제 | 검색
		 * ArrayList	: 빠르다			/	느리다		 / 빠르다
		 * LinkedList	: 느리다			/	빠르다		 / 느리다
		 * */
		
	}//main

}
