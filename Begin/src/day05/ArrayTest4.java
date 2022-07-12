package day05;

public class ArrayTest4 {

	public static void main(String[] args) {
		//2차원 배열
		//[1] 선언 [2]메모리할당 [3]초기화
		//int [][]a;
		//int a[][];
		int [] a [] ;//2차우너 배열 선언
		
		//[2] 메모리할당 => 3행 2열
		a=new int[3][2];
		
		//[3]초기화
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		//행의 크기 :a.length
		//열의 크기 :a[i].length
		
		for(int i=0;i<a.length;i++) {
			for(int k=0;k<a[i].length;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
		for(int b[]: a)
		{
			for(int bb: b)
				System.out.print(bb+" ");
			System.out.println();
		}
		
		System.out.println("2.**********************");
		//행의 크기만 먼저 잡아놓고, 열의 크기를 가변적으로 할당
		char[][] ch=new char [3][];
		ch[0]=new char[2];//2열
		ch[1]=new char[4];//4열
		ch[2]=new char[3];//3열
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		
		ch[2][0]='B';
		ch[2][1]='y';
		ch[2][2]='e';
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]);
			}
			System.out.print(" ");
		}
		
		for(char[] c:ch) {
			for(char x:c) {
				System.out.print(x);
			}
			System.out.print(" ");
		}
		
		System.out.println("\n3.--------------------------");
		//2차원배열: 선언과 동시에 메모리할당 초기화 한번에
		float[][]brr= {{0.5f,20.1f},{010,011,017},{10,'B'}};
		System.out.println("brr.length: "+brr.length);
		
		for(float[] f:brr) {
			for(float y:f) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//double 우형 3차원 배열 선언과 동시에 메모리할당 초기화
		System.out.println("예제1");
		double [][][] d2 = { {{1,2,3},{'a'}},{{0.5}} };
		System.out.println(d2.length);
		
		for(double [][] d:d2) {
			for(double drr[]:d) {
				for(double d12:drr) {
					System.out.print(d12+" ");
				}
			}
			System.out.println();
		}
		
	}//main

}
