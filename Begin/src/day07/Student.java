package day07;

public class Student {
	private int no;
	private String name;
	private String major;
	
	public void setNo(int no)
	{
		this.no = no;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void showInfo() {
		System.out.println("----학생 정보----");
		System.out.println("학번: "+no);
		System.out.println("이름: "+name);
		System.out.println("전공: "+major);
	}
}
