package day11;
/*
 * Local Inner class : 메서드 블럭안에 클래스를 구성한경우
 * [1] 이름있는 로컬 이너클래스
 * [2] 이름없는 로컬 이너클래스
 * 
 * */
public class Local {
	String str="멤버변수@";
	
	public void bar() {
		class LocalInner{
			
		}
	}
	
	public void sub() {
		double pi=3.14;//지역변수(local variable)
		System.out.println("str : "+str);
		System.out.println("pi : "+pi);
		
		class LocalInner{//local inner class
			String lstr="LocalInner의 멤버변수!";
			void foo() {
				System.out.println("str = "+str);
				System.out.println("lstr = "+lstr);
				System.out.println("pi = "+pi);
				//pi=5.12;//error발생
				/*로컬이너 클래스 안에서는 final이 아닌 지역변수 접근 불가
				 * */
			}
		}
		/*
		 * 로킬이너 클래스는 자기가 속한 메소드 안에서 객체생성가능
		 * 또한 클래스가 구성된 후에 객체 생성 가능
		 *  */
		LocalInner li = new LocalInner();
		li.foo();
	
	}//sub()
	
	
	public static void main(String[] args) {
		Local lc=new Local();
		lc.sub();
		
	}
}
