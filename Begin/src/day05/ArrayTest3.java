package day05;

public class ArrayTest3 {

	public static void main(String[] args) {
		System.out.println("1.----------------");
		int a[];
		a=new int[3];
		a[0]=90;
		a[1]=80;
		a[2]=70;
		
		int[] b; //선언
		b=a;
		/*a가 가르키는 배열을 b도 같이 가리키는 형태*/
	
		for(int i=0;i<b.length;i++) {
			System.out.println(i+"="+b[i]);
		}//for
		b[0]=100;
		System.out.println("b[0]="+b[0]);
		System.out.println("a[0]="+a[0]);
		
		System.out.println("2.-----------------");
		int []x= {1,2,3,4};
		int y[]= {10,20};
		int tmp[]; //선언
		tmp=x;
		x=y;
		y=tmp;
		
		for(int k=0; k<x.length ; k++) {
			System.out.println("x[" +k + "]=" +x[k]);
		}for (int j=0; j<y.length; j++) {
			System.out.println(y[j]);
		}
		System.out.println("3.----------------------------");
		//참조형의 배열 - String,Date,Scanner,Object ...
		String[] arr;//선언
		arr=null;
		System.out.println(arr);
		
		arr=new String[4];// 메모리할당
		System.out.println("arr[0]= "+arr[0]);
		
		//초기화
		arr[0]="Hello";
		arr[1]=new String("Hi");
		arr[2]=3+"5";
		arr[3]="";//빈 문자열 , char 일 경우 ' '		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*****************");
		//확장 for루프,개선된 for루프 ,for each루프
		/*for(변수 선언문:자료구조)
		 * {
		 * 		실행문;
		 * }
		 * 알아서 자료구조의 크기(length)만큼 반복문 돌면서
		 * 자료구조의 저장된 값을 변수에 할당한다.
		 * */
		for(String s:arr) {
			System.out.println(s.toUpperCase());
		}
		
		String str[]= {"안녕하세요","반갑습니다.","잘가세요"};
		for(String st:str) {
			System.out.println(st);
		}
	}//main

}
