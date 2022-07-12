package day05;
/*  예외처리방법
 * [1] Handle : try ~ catch 절사용
 *  [2] Declare : throw 절 사용
 * 
 * */
public class ExceptionTset {

	public static void main(String[] args) {
		String[] fruits = {"수박","멜론","사과","오렌지"};
	try {
		for(int i=0; i < 5; i++) {
			System.out.println(fruits[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열의 인덱스 범위가 초과 되었습니다.");
	}
		System.out.println("반드시 실행되야하는 중요한 코드입니다.");
		
	}//main

}
