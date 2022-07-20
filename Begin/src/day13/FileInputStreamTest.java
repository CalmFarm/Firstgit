package day13;
import java.io.*;
public class FileInputStreamTest {

	public static void main(String[] args) 
	throws IOException
	{
		
		String fileName="src/day13/InputStreamTest.java";
		//파일과 노드 연결
		FileInputStream fis=new FileInputStream(fileName);
		int n=0;
		int count=0;
		while((n=fis.read())!=-1){
			//파일의 끝에 도달하면 -1을 반환
			System.out.write(n);
			System.out.flush();
			count++;
		}
		System.out.println("총 파일의 크기 : "+count+"byte");
		fis.close();
		System.out.close();
		
		
	}//main
}//class