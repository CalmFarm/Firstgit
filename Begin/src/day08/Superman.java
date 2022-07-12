package day08;

public class Superman extends Human{
	int power;
	
	public Superman() {
		
	}
	public Superman(String n,int h,int p) {
		name=n;
		height=h;
		power=p;
	}
	//메소드 오버라이딩=Override => 메소드 재정의
	/*
	 * 부모로 부터 상속받은 메소드를 다시 정의해서 구현하는 것
	 *  - 오버라이딩의 조건
	 *   [1]부모의 메소드 이름과 동일하게 구성
	 *   [2]부머의 것과 매게변수도 동일하게 구성
	 *   [3]반환타입도 같아야함
	 *   [4]접근지정자는 부모와 동일하거나 더 넓은 범위의 접근지정자 사용
	 *   [5]예외는 부모가 선언한 예외와 동일하거나, 더 구체적 예외를 발생 시킬수
	 * */
	//     반환타입 메소드  매게변수 (부모와 동일하게 구성)
	public String getInfo () {//내용은 부모와 다르게 재정의
		//String info="이름 : "+name+"\n키: "+height+"\n파워: "+power;
		String info=super.getInfo()+"\n파워 : "+power;
		//          super는 부모로부터 ㅁ루려받은 변수나 메소드를 참조할때 ㅆ는 키워드
		return info;
	}
	
	//오버라이딩한 메소드를 오버로딩해보자
	public String getInfo(String title) {
		String info=title+"\n"+super.getInfo()+"\n파워 : "+power;
		return info;
	}
	
	public void getInfo(String title, int up) {
		this.power += up;
		this.getInfo(title);
		System.out.println(this.getInfo(title));
	}
	
}
