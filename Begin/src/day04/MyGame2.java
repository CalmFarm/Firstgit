package day04;
import java.util.*;
public class MyGame2 {
	//------------------사용자 정의 메소드------------------
	public static void showMenu() {
		System.out.println("---------Menu----------");
		System.out.println("1. 가위 2.바위 3.보 9.종료");
		System.out.println("-----------------------");
		System.out.println("입력하세요 =>");
		System.out.println("-----------------------");
	}
	//------------------------------------------------
	public static String show(int num) {//1,2,3
		String str1="";
		switch(num) {
		case 1: str1="(가위)"; break;
		case 2: str1="(바위)"; break;
		case 3: str1="(보)" ; break;
		default: str1="";
		}
		return str1;
	}//-----------------------------------------------

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(;;) {
			MyGame2.showMenu();
			int input=sc.nextInt();
			int comp=(int)(Math.random()*3+1);
			if(input==9) {
				System.out.println("Bye");
				break;
			}
			if(input<1 || input>3) {
				System.out.println("메뉴에 없는 번호입니다.");
				continue;
			}
			String str="";
			if(input==comp) {
				str="비겼군요!";
			}else if((input==1 &&comp==3)||(input==2&& comp==1)||(input==3 && comp ==2)) {
				str="당신이 이겼네요!";
			}else {
				str="당신이 졌군요!";
			}
			System.out.println("당신:"+input+MyGame2.show(input));
			System.out.println("컴퓨터:"+comp+MyGame2.show(comp));
			System.out.println(str);
		}//for-----------------------------------------------------

	}//main

}//class

