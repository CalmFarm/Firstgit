package day08;
//Polymorphism = 다양성
public class Polymorphism {

	public static void main(String[] args) {
		
		Human h1=new Human("김철민",171);
		System.out.println(h1.getInfo());
		
		Superman s1=new Superman("이소라",170,600);
		System.out.println(s1.getInfo("**슈퍼맨 정보**"));
		
		Aquaman a1=new Aquaman("인어공주",144,200);
		System.out.println(a1.getInfo());
		
		//부모자식의 상속관계가 있을경우
		//부모타입 참조변수 =new 자식객체();
		/* - 부모타입의 변수를 선언하고 객체는 지식객체로 생성하는것이 가능
		 * 
		 *  -이럴경우 부모타입의 참조변수로 접근할 수 있는 변수나 메소드는 제한
		 *  -[1]부모로 부터 물려받은 변수나 메소드는 접근가능
		 *   [2]자식만 갖는 고유한 변수나 메소드는 접근불가
		 *   [3]단, 오버라이딩한 메소드가 있을경우는 자식의 것을
		 *  */
		System.out.println(s1.power);
		
		Human hm = new Superman("김상속",199,123);
		System.out.println("hm.name: "+hm.name);
		System.out.println("hm.height: "+hm.height);
		//System.out.println("hm.power: "+hm.power); [x]
		System.out.println(hm.getInfo());
		//재정의한 메소드의 경우  hm로 호출하면 자식의 것이 우선적용
		
		System.out.println("s1.power : "+s1.power);
		
		System.out.println("((Superman)hm).power : "+((Superman)hm).power);
		//부모 자식의 상속관계가 있을 경우 형변환이 가능
		
		String info=((Superman)hm).getInfo("***슈퍼맨정보**");
		System.out.println(info);
		
		System.out.println("*********Q1************");
		Human an=new Aquaman("김생선",183,90);
		System.out.println(an.getInfo());
		System.out.println(an.name);
		System.out.println(an.height);
		System.out.println(((Aquaman)an).speed);
		String infoAq=((Aquaman)an).getInfo();
		System.out.println(infoAq);
		
		System.out.println("*********Q2************");
		Human [] arr = {h1,s1,a1,hm,an};
		//arr[i] : Human계열의 객체들
		//instanceof 연산자를 이용하면 참조변수가 어떤 클래스의 객체인지 알 수 있다.
		//참조변수 instanceof 클래스명 : 참조변수가 클래스의 객체이면 true,
		//											 아니면 false반환
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Superman) {
				System.out.println(((Superman)arr[i]).getInfo("**슈퍼맨 정보**"));
			}else {
				System.out.println("----------------");
				System.out.println(arr[i].getInfo());
			}
		}
		
		
	}

}
