package day06;

public class House {
	int room;
	String addr;
	String owner;
	//속성
	
	public void showInfo() {
		System.out.println("-----House 정보-----");
		System.out.println("소유주:" + owner);
		System.out.println("방 수 : "+ room);
		System.out.println("주소 : "+ addr);
	}
	public String existAt(int bunji) {
		String str=owner+"의 집은 "+addr+" "+bunji+"번지에 위치합니다.";
		return str;
	}
	
	public void rent(String type, int money) {
		switch(type) {
		case "매매":
			System.out.println("매매가 : "+money+"만원");
			break;
		default:
			System.out.println("임대가: "+money+"만원");
		}
	}
	//메소드
	
	
}//class---------------------------
