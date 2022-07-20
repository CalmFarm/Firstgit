package day13;
/*
 * FileReader
 *  - 2byte(문자)기반 스트림
 *  - 노드 스트림(파일과 노드연결)
 *  */
import java.io.*;
public class FileReaderTest {

	public static void main(String[] args) 
	throws IOException
	{
		String fname="src/day13/FileInputStreamTest.java";
		
		File file=new File(fname);
		long fsize=file.length(); // 파일의 크기를 반환 long타입
		System.out.println("파일의 크기 : "+fsize+"byte");
		
		FileReader fr=new FileReader(file);//노드연결
		int n=0;
		while((n=fr.read()) != -1) {
			System.out.write(n);
			System.out.flush();
		}
		fr.close();
		
	}//main
}//class