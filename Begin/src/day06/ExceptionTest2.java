package day06;
import java.io.*;
public class ExceptionTest2 {

	public static void input()//Handle : try~catch
	{
		//IOException : 컴파일 타임 예외
		try {
			//int n=System.in.read();
			char n=(char)System.in.read();
			System.out.println("n: "+n);
		}catch(IOException e) {
			System.out.println("입출력 에러 발생: "+e);
		}
	}//--------------------------------------------------
	
	public static void sub() throws IOException
	//Declare : throws
	// == > sub()메소드를 호출한 쪽으로 예외처리를 넘긴다.
	{
		int n=System.in.read();
		System.out.println("n: "+n);
	}
	
	
	public static void main(String[] args)
	throws IOException
	{
		System.out.println("입력=");
		//ExceptionTest2.input();
		ExceptionTest2.sub();
	}
	
	}


