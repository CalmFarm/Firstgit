package day06;
/*부동산 거래 관리 앱
객체 : 집, 중개인, 매도자, 매수자, 임대인, ...
추상화 : 현실세계에 존재하는 객체를 프로그램 세계로 표현하는것
클래스명 : House
			속성(has a) : 3가지 방의 개수, 주소, 소유주
			기능(행위) : 얼마에 세를 놓다,얼마에 매도하다, 어디에 위치하다,...
*/
public class RTMS {
	public static void main(String[] args) {
		House h1=new House();
		
		House h2=new House();
		
		h1.room=2;
		h1.addr="부산시 해운대구";
		h1.owner="홍길동";
		
		h2.room=5;
		h2.addr="미국 뉴욕시";
		h2.owner="IceCube";
		
		h1.showInfo();
		h2.showInfo();
		
		String s1=h1.existAt(100);
		String s2=h2.existAt(1000);

		h1.rent("매매", 2000);
		h2.rent("전세", 8000);
		
		
		
	}
}
