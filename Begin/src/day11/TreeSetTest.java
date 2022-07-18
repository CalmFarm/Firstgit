package day11;
import java.util.*;
/*
 *  TreeSet
 *  	추가된 데이터들이 정렬된다.
 *  	데이터 중복을 허용하지 않는다.
 *  	내부적으로 이전 트리를 사용해 데이털르 저장한다.
 * */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<>();
		tree.add("제우스");
		tree.add("헤르메스");
		tree.add("헤라");
		tree.add("하데스");
		tree.add("포세이돈");
		tree.add("헤라");//동일 데이터 중복 허용 X
		System.out.println("tree size() : "+tree.size());
		
		//확장 for문 출력
		for(String s:tree) {
			System.out.println(s);
		}
		

	}

}
