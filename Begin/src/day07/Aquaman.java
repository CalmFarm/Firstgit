package day07;

public class Aquaman {
	String name;
	int height;
	double speed;
	
	public String getInfo() {
		String info="이름:"+name+"\n키: "+height+"\n스피드: "+speed;
		return info;
	}
	
	public Aquaman() {
		this("아쿠아맨",180,200);
		/*name="수중인가";
		height=999;
		speed=99.11;*/
	}

	public Aquaman(String name) {
		this(name,180,123);
		/*this.name=name;
		height=185;
		speed=888;*/
		
	}
	
	public Aquaman(int height) {
		this("아쿠아맨",height,99);
		/*name="워터맨";
		this.height=height;
		speed=777;*/
	}
	
	public Aquaman(String name,int height, int power) {
		this.name=name;
		this.height=height;
		this.speed=power;
	}

}
