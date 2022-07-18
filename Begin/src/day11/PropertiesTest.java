package day11;
import java.util.*;
import java.io.*;
/*
 * Properties : Map 계열
 * 		-- 시스템의 설정 정보 등을 xxx.properties 
 * 
 * */
public class PropertiesTest {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		String loc="src/day11/mysystem.properties";
		FileReader fr=new FileReader(loc);
		//파일과 노드 연결하여 읽어들일 준비
		//파일의 내용을 Properties객체로 옮겨보자.
		
		Properties prop=new Properties();
		prop.load(fr);
		fr.close();
		//properties 파일 내용을 읽어서 Properties() 객체로 옮겨 저장
		
		//setProperties(String key,String value):저장
		//String getProperties(String key,String value):꺼내기
		String os=prop.getProperty("Os");
		System.out.println("운영체재 : "+os);
		
		String dbms=prop.getProperty("DbType");
		System.out.println("DBMS : "+dbms);
		
		System.out.println(prop.getProperty("DbUser"));
		System.out.println("비밀번호"+prop.getProperty("DbPwd"));
		System.out.println("메세지: "+prop.getProperty("Msg","메세지는 없습니다."));
		
		prop.getProperty("Lang", "Java");
		System.out.println("Lang : "+prop.getProperty("Lang"));
	}//main

}//class
