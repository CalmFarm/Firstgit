package day11;

public class StringTest {

	public static void main(String[] args) {
		//java.lang.String : final클래스. 상속받을 수 없다.
				//					immutable(불변성) :문자열 결합이나 삭제, 수정 등의
				//					작업을 할 때 원본문자열은 그대로 두고 새로 생성함

		String s1="zero";
		s1+="plus";
		
		System.out.println(s1);
/*
 * s1 ==x== > "zero"
 * 
 * s1 ===== > "zero +plus"
 * 
 * */
		//concat() : 문자열 결함
		String s2=s1.concat("king");
		System.out.println("s2 : "+s2);
		System.out.println("s1 : "+s1);
		
		//char charAt(int i)
		char c1=s2.charAt(0);
		//0123456789101112
		//zeroplustking
		System.out.println("c1 : "+c1);
		
		String s3="56x78";
		boolean isNum=true;
		for(int i=0;i<s3.length();i++) {
			char ch=s3.charAt(i);
			System.out.print(ch+",");
			if(!(ch>='0'&& ch<='9')) {
				//숫자가 아닌 문자가 있다면
				isNum=false;
				break;
			}
		}//------------------------------
		
		String result=(isNum) ? "숫자 입니다." : "숫자가 아닙니다.";
		
		System.out.println("\n변수 s3는"+result);
		
		//int indexOf(String str):str문자열이 위치한 곳에 인덱스번호를 반환한다.
		//			만약 str문자열이 없다면 -1을 반환한다.
		String s4="$1,000 Buy-in Prize 1Million!";
		
		int idx=s4.indexOf("Buy-in");
		System.out.println("index : " +idx);
		
		//int lastIndexOf(String str):문자열 뒤에서부터찾음
		
		idx=s4.lastIndexOf("Prize");
		System.out.println("index : "+idx);
		
		idx=s4.indexOf("브레이슬릿");
		System.out.println("index : "+idx);
		//없으면 -1로 반환한다.
		
		//String substring(int start,int end)
		// : 인덱스 start부터 end-1 까지의 문자열을 반환
		
		System.out.println(s4.substring(s4.indexOf("$1,000"), s4.lastIndexOf("1Million!")));
		System.out.println(s4.substring(9));
		System.out.println("s4 : "+s4);
		
		//replace(String oldStr, String newStr)
		System.out.println(s4.replace("Prize", "Winner"));
		System.out.println("s4 : "+s4);// 불변성 원본이 바뀌지는 않는다.
		
		String s5 = "	100#Ivey#우승자 디너디너치킨#디너	";
		System.out.println("s5.length() : "+s5.length());
		//trim() : 문자열 앞,뒤 공백문자를 제거
		String s6 = s5.trim();
		System.out.println("s6.length() : "+s6.length());
		//String toUpperCase,toLowerCase
		
		//String [] split(String regex) : 특정 패턴문자열을 기준으로 문자열을 쪼개어 배열에 담아 반환한다.
		String[] token=s5.split("#");
		System.out.println("token.length : "+token.length);
		System.out.println(token[0]);
		System.out.println(token[1]);
		System.out.println(token[2]);
		System.out.println(token[3]);
		
		
		
}//main
}//class