package day10;
import java.util.*;
/*Map계열- Hashtable, HashMap, Properties
 * - Object유형을 저장할 수 있으며
 * - key와 value를 매핑하여 저장한다.
 * - 데이터가 75% 차면 자동으로 저장 영역을 확대한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터 저장: Object put(Object key, Object val)
 * - 데이터 추출: Object get(Object key) 
 * */
public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, Integer> h1=new Hashtable<>();
		//key: String, Value: Integer
		h1.put("생년", 2000);
		h1.put("나이", Integer.valueOf(22));
		h1.put("연봉", 10000);
//key값은 중복 X ,나중에 저장한 것으로 출력
//h1.put("나이", 30);
		
//Map계열은 검색이 용이하다.
		Integer age=h1.get("나이");
		System.out.println("age : "+age);
		System.out.println("h1.size() : "+h1.size());
		
//Enumeration<K>	keys() : key값들만 Enumeration객체로 반환
		Enumeration<String> en=h1.keys();
		for(;en.hasMoreElements();) {
			String key=en.nextElement();
			System.out.println(key+">>"+h1.get(key));
		}
//Set<K>	keySet() : key값들만 Set객체로 반환
		Set<String> set=h1.keySet();
		for(String key : set) {
			System.out.println(key);
		}
//Collection<V>	values() : value값들만 컬렉션유형으로 반환
		Collection<Integer> cl=h1.values();
		for(Integer val : cl) {
			System.out.println(val);
		}
		
//boolean	containsKey(Object key) : key값을 포함하고있으면 true
//boolean	containsValue(Object value):value값을 가지고있으면 true
		System.out.println(h1.containsKey("생년"));
		System.out.println(h1.containsValue(2000));
		
	}//main

}
