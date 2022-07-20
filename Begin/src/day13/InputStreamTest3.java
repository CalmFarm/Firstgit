package day13;
import java.io.*;
//System.in : 키보드와 노드 연결
//System.out : 콘솔과 노드 연결
public class InputStreamTest3 {

	public static void main(String[] args) 
	throws IOException
	{
		int n=0;
		int cnt=0;
		System.out.println("입력 ->");
		//데이터를 배열에 담아서 읽고 써보자
		byte [] arr=new byte[6];//배열
		int total=0;
		
		while((n=System.in.read(arr))!=-1) { //Ctrl+c 하면 -1로 변환
			//System.out.println("n: "+((char)n));
			System.out.write(arr, 0 ,n);
			System.out.flush();//스트림에 남아있는 데이터를 
			cnt++;
			total += n;
		}
		System.out.println(total+"bytes 읽음");
		
		System.in.close();
		System.out.close();
	
	}

}