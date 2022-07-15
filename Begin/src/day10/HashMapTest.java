package day10;
import java.util.*;
import java.io.*;
//HashMap
// - Map 계열
// - 무순서(입력순서와 출력순서가 다를 수 있다.)
// - Key값을 Set을 관리
public class HashMapTest {
	HashMap<String, String> map=new HashMap<>();
	
	public void join() {
		map.put("ID", "0000");
		map.put("ideal", "qwer");
		map.put("admin", "zero");
		System.out.println("회원 가입 완료 [user :"+map.size()+"]");
	}
	
	public void loginCheck() {
		Console console=System.console();
		//이클립스에서 테스트하면 X => console이 null이 되므로
		//도스창 열어 테스트 하기
		while(true) {
			System.out.print("아이디 : ");
			String userid=console.readLine();
			//System.out.println("userid: "+userid);
			
			System.out.print("비밀번호 : ");
			char[] pwd=console.readPassword();
			//System.out.println("pwd : "+new String(pwd));
			
			//1]입력한 아이디가 map에 저장되어있는지 체크
			//	1_1]없다면 => "존재하지 않는 아이디"
			//  1_2]있다면
			//		[a] 비밀번호가 일치 => " ~ 환영합니다."
			//		[b] 일치하지 않는 경우 => " 비밀번호 틀림"
			if(map.containsKey(userid)){
                if(map.get(userid).equals(new String(pwd))){
                    System.out.println("로그인 되었습니다.");
                    break;
                }else{
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            }else{
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
		}//while
}
	
	public static void main(String[] args) {
		HashMapTest hmt=new HashMapTest();
		hmt.join();
		hmt.loginCheck();
		
		
	}//main
}//class