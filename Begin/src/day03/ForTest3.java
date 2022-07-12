package day03;
//중첩 for 루프문
public class ForTest3 {
	
	public static void main(String[] args) {
		for(int i=2;i<4;i++) 
		{
			for(int k=1;k<3;k++) 
			{
				System.out.println("i="+i+",k="+k);
			}//for ~~
			System.out.println("****************");
		}//for ~~
		
	/*
	 * ★★★★★
	 * ★★★★★
	 * ★★★★★
	 */
		for(int b=1;b<4;b++) 
		{
			for(int a=1;a<6;a++) 
			{
				System.out.print("★");
			}System.out.print("\n");
		}
		////////////////////////////////////////////////
		
		for(int z=1;z<10;z++) { //행
			for(int v=2;v<10;v++) { //열
				System.out.print(z+"x"+v+"="+z*v+"\t");
			}
			System.out.print("\n");
		}
		
	
		
		
		
		
				
	}
		
		
}


