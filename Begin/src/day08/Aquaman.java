package day08;

public class Aquaman extends Human{
	double speed;
	
	public Aquaman() {
		this("수중인간",170,100.15);
	}
	public Aquaman(String n,int h,double s) {
		this.name=n;
		this.height=h;
		this.speed=s;
	}
	public String getInfo () {//내용은 부모와 다르게 재정의
		//String info="이름 : "+name+"\n키: "+height+"\n스피드: "+speed;
		String info=super.getInfo()+"\n스피드 : "+speed;
		return info;
	}
	public String getInfo(String title) {
		String info=title+"\t"+super.getInfo();
		return info;
	}
}
