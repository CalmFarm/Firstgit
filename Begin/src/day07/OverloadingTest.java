package day07;

public class OverloadingTest {

	public static void main(String[] args) {
		
		Aquaman a1=new Aquaman("아데산야", 190, 777);
		Superman s1=new Superman("배트맨");
		Superman s2=new Superman("슈프림",180,99);
		System.out.print("****************\n");
		System.out.println(a1.getInfo());
		System.out.println(s1.getInfo());
		System.out.println(s2.getInfo());
		Superman s3=new Superman();
		System.out.println(s3.getInfo());
		Aquaman a2=new Aquaman();
		System.out.println(a2.getInfo());
		
		Superman[] arr= {s1,s2,s3};
		for(int i=0;i<arr.length;i++) {
			System.out.println("**********************");
			System.out.println(arr[i].getInfo());
		}
	
		
		
		
	}//main
	
}//class
