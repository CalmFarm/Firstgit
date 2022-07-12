package day07;

public class JobHunter {
	String name;
	int age;
	private int salary;
	
	public void showInfo() {
		System.out.println("-----구직자 정보-----");
		System.out.println("이름:" + name);
		System.out.println("나이 : "+ age);
		System.out.println("희망연봉 : "+ salary);
	}
	
	public void setSal(int a) {
		salary=a;
	}
	
	public int getSal() {
		return salary;
	}
	
	public JobHunter() {
		this("김철수",20,1000);
	}
	
	public JobHunter(String name,int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
}
