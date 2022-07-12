package day05;

public class ExceptionTest3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			try {
			int a=50/(i-3);
			System.out.println("a= "+a);
			}catch(Exception e) {
				System.out.println("0은 분모가 안됨");
			}
		}
		
	    System.out.println("매우 중요한 코드");
	    

	}//main

}
