package day05;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		float ft [];
		ft=new float[3];
		ft[0]=-16.456f;
		ft[1]=200.5f;
		ft[2]=30e+3f;
		float sum=0f;
		for(int i=0;i<ft.length;i++) {
			System.out.println(ft[i]);
			sum = sum+ft[i];
		}
		System.out.println(sum);
		System.out.println(sum/ft.length);
		
	}

}
