package day08;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm=new CoffeeMachine();
		
		String s=cm.makeTea(1, 1, 1);//밀크
		System.out.println(s);
		
		cm.makeTea(2, 2);//설탕
		cm.makeTea(1);//블랙
		
		cm.makeTea(4, (short)4);//크림
		cm.makeTea((short)5, 5);//크림
		
		Yuja ja=new Yuja();
		ja.setYuja(3);
		ja.setSugar(3);
		cm.makeTea(ja);
		
		
		
	}
}
