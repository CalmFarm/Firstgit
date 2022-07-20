package day13;
import java.io.*;
public class FileInputStreamTest2 {
	public static void main(String[] args) 
	throws IOException
	{
		
		//String fileName="src/day13/InputStreamTest.java";
		//String fileName2="c:/myjava/InputStreamTest_Copy.txt";
		String fileName3="myicon.png";
		String fileName4="c:/myjava/copy.png";
		//파일과 노드 연결
		FileInputStream fis=new FileInputStream(fileName3);
		FileOutputStream fos=new FileOutputStream(fileName4);
		
		byte[] arr=new byte[4000];
		
		int n=0;
		int count=0;
		int total=0;
		
		while((n=fis.read(arr))!=-1){
			//파일의 끝에 도달하면 -1을 반환
			//System.out.write(arr,0,n);
			//System.out.flush();
			fos.write(arr,0,n);
			fos.flush();
			
			count++;
			total += n;
		}
		System.out.println("총 파일의 크기 : "+total+"byte");
		System.out.println(fileName4+"에 카피 완료!");
		fis.close();
		fos.close();
		System.out.close();
		
		
	}//main
}//class