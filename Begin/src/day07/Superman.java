package day07;

public class Superman {
	String name;
	int height;
	int power;
	
	public String getInfo() {
		String info="이름:"+name+"\n키: "+height+"\n파워: "+power;
		return info;
	}
	
	public Superman() {
		this("슈퍼맨", 183 , 99);
		//this() ==> 자기자신의 생성자를 호출할때 사용
		// 			 생성자 안에서만 호출 할 수 있으며,
		//			 제일 첫번째 문장이어야 한다.
	}
	
	public Superman(String name) {
		this(name, 170, 888);
	}
	
	public Superman(int height) {
		this("슈파르만",height,777);
	}
	
	public Superman(String name, int height, int power) {//매개변수가 많은 target
		this.name=name;
		this.height=height;
		this.power=power;
	}
	

}//class
