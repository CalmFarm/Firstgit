package day10;
import java.util.*;
import javax.swing.*;

/* Java Collection Framework
 * 	- Collection :객체를 수집해서 저장하는 역할
 *  - Framework : 사용방법을 미리 정해놓은 라이브러리를 의미 
 *  - Vector ,ArrayList , Hashtable,Hashmap,HashSet,Treeset...
 *   # Vector
 *   - List계열
 *   - 입력순서를 기억한다
 *   - 데이터 중복 저장 가능
 *   - 유사 클래스 : ArrayList
 * */
public class VectorTest {

	public static void main(String[] args) {
		//jdk 1.4 이전 버젼
		//Vector v=new Vector();//초기용량 10개, 가득차면 2배로 늘림
		Vector v=new Vector(5, 3);//5:초기용량, 3:증가치
		System.out.println("벡터 v의 현재 용량 : "+v.capacity());
		System.out.println("벡터 v의 현재 크기 : "+v.size());
		
		
		v.add("Hello");
		v.add(new Integer(20));
		v.add(Integer.valueOf(22));
		v.add(3.14);//double이 저장되는것이 아니라 Double=>Wrapper class로 auto boxing 되어 저장된다.
		
		System.out.println("벡터 v의 현재 용량2 : "+v.capacity());//5
		System.out.println("벡터 v의 현재 크기2 : "+v.size());//4
		
		v.add(new Object());
		v.add(new javax.swing.JButton("OK"));
		
		System.out.println("벡터 v의 현재 용량3 : "+v.capacity());
		System.out.println("벡터 v의 현재 크기3 : "+v.size());
		
		//Object obj=v.get(0);
		String obj=(String)v.get(0);
		System.out.println(obj.toUpperCase());
		
		double dbl=(double)v.get(3);
		System.out.println(dbl);
		
		JButton str=(JButton)v.get(5);
		System.out.println(str);//toString()
		//5.0 이후 부터 Generic을 사용함
		Vector<String> v2=new Vector<>();
		//String 유형만 저장하는 벡터 생성
		v2.add(new String("Java$"));
		v2.add(Integer.valueOf(5).toString());
		
		String s2=v2.get(0);
		System.out.println(s2.toLowerCase());
		
		//[1] for 루프 이용해서 v2에 저장된 객체 출력
		
		//[2] Float 유형을 저장할 벡터 v3 생성후
		//	  Float객체 3개 이상 저장
		//    확장 for루프문 이용해서 v3에 저장된 값 합계를 출력
		
		System.out.println("[1]");
		for(int i=0;i<2;i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("[2]");
		Vector<Float> v3=new Vector<>();
		v3.add(1.11f);
		v3.add(0.1e-3f);
		v3.add(3.14f);
		
		float sum=0;
		for(float num : v3 ) {
			sum += num;
		}
		System.out.println(sum);
	}

}
