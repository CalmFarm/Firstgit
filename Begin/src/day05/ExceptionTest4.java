package day05;
/*
 * try블럭 하나에 catch 절은 여러개 올 수 있다.
 * ,그러나 이 때 catch순서를 주의해야한다.
 *  	-부모 자식의 상속관계가 있는 예외일 경우
 *   	자식을 먼저 catch하고 부모 예외를 나중에 catch해야한다.
 * */

public class ExceptionTest4 {

	public static void main(String[] args) {
		//args : String 타입의 배열, 명령줄 인수
		//컴파일 : javac ExceptionTest4.java
		//실행 : java ExceptionTest4 안녕 잘가
		//						  args[0] args[1]
		try 
		{
			System.out.println("args[0]"+args[0]);
			System.out.println("args[1]"+args[1]);
			System.out.println("총점 : "+args[0]+args[1]);
			
			int kor=Integer.parseInt(args[0]);//NumberFormatException
			int eng=Integer.parseInt(args[1]);
			int sum=kor+eng;
			int avg=sum/args.length;
			
			System.out.println("총점 : "+sum);
			System.out.println("평균 :" +avg);
			System.out.println(avg/0);//ArithmeticException
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력해야해요");
		}catch(NumberFormatException e) {
			System.out.println("점수는 숫자로 입력해야 해요!");
		}catch(Exception e) {
			System.out.println("기타 예상치 못한 예외 발생: "+e);
		}
		//java.lang.Integer클래스 == > Wrapper class
		//int (기본자료형)==>Integer
		//public static int parseInt(String s)  :
		//문자열 s 를 정수로 변환시켜주는 메소드
		//예시) int a = Integer.parseInt(str);
		
	}//main----------------------
}


