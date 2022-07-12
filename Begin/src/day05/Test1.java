package day05;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		System.out.println("Q1.-----------------------------------");
			int [][]arr= new int[5][5];
			
			int input = 5;
			int i,j;
			int k = 1;
			int right =0, bottom = -1, top =1;
			
			for(i=input; i>=0 ; i--) {
				
				for(j=0; j<input; j++) {
					bottom = bottom+top;
					arr[right][bottom] = k;
					k++;
				}
				
				input--;
				
				for(j=0; j<input; j++) {
					right = right +top;
					arr[right][bottom] = k;
					k++;
				}
				top = top*(-1);
			}
			for(i=0; i<arr.length; i++) {
				for(j=0; j<arr.length ; j++) {
					System.out.print(arr[i][j]+" ");
					}
				System.out.println();
			}
			
			System.out.println("Q2.---------------------------------------------");
			Scanner sc=new Scanner(System.in);
			int [] coinUnit = { 500, 100, 50, 10 };	
			System.out.println("가지고 있는 돈 입력=>");
			int money = sc.nextInt();
			System.out.println("money=" + money);		
			for (int z = 0; z < coinUnit.length; z++) {
				System.out.println(coinUnit[z] + "원 : " + money / coinUnit[z]);
				money = money % coinUnit[z];
			}
		}//main
}//class
	
