package day10;
//도메인 객체 (정보를 가진) -  VO(Value Object),DTO(data transfer object)
public class Student {
	//캡슐화
	private int id;
	private String name;
	
	public Student() {
		this(0,"홍길동");
	}
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	//setter,getter-------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}//