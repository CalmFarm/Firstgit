package day03;

public class Test01 {

	public static void main(String[] args) {
		int sum=0;
		for(int x=1;x<21;x++) {
			if(x%2 != 0 && x%3 != 0)
				sum = sum+x;
		}
		System.out.println("총합"+sum);
		//=================================================
		sum=0;
		int totalsum=0;
		for(int i=1;i<11;i++) {
			sum +=i;
			totalsum +=sum;
			}
		
		System.out.println("총합"+totalsum);		
		//=================================================
		
	}

}
