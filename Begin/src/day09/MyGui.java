package day09;
import javax.swing.*;
import java.awt.*;
//CLI : Command Line Interface 도스 콘솔에서 실행되는 프로그램
//GUI : Graphic User Interface 그래픽 환경ㅇ르 갖춘 프로그램
//JFrame : Window 계열의 컨테이너 
//		반드시 사이즈를 정해주고 setVisible(true)를 주어야 화면에 보여짐

//JPanel : Panel계열의 컨테이너

public class MyGui extends JFrame {
	JPanel p;
	JButton bt1,bt2,bt3;//Component
	Icon icon1,icon2,icon3,icon4,icon5;
	
	JTextField tf1, tf2;
	JTextArea ta1, ta2;
	
	public MyGui() {
		super("::MyGui Program v1.1::");//타이틀에 문자열이 올라간다.
		p=new JPanel();
		add(p);//JFrame의 중앙에 판넬이 붙는다.
		p.setBackground(Color.gray);
		icon1=new ImageIcon("icon1.PNG");
		icon2=new ImageIcon("icon2.PNG");
		icon3=new ImageIcon("icon3.PNG");
		icon4=new ImageIcon("icon4.PNG");
		icon5=new ImageIcon("icon5.PNG");
		
		bt1 = new JButton(icon1);
		bt2 = new JButton("Home",icon2);
		bt2.setHorizontalTextPosition(JButton.CENTER);//텍스트 위치를 수평에 중앙에
		bt2.setVerticalTextPosition(JButton.BOTTOM);//텍스트 위치를 수직의 탑에 위치
		bt3 = new JButton("Login",icon3);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setVerticalTextPosition(JButton.TOP);
		bt3.setPressedIcon(icon4);
		bt3.setRolloverIcon(icon5);
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		
		tf1 = new JTextField(20);
		tf2 = new JTextField("네이버를 검색하세요",40);
		tf1.setBackground(Color.yellow);
		tf2.setBackground(Color.green);//배경색
		tf2.setForeground(Color.red);//글자색
		p.add(tf1);
		p.add(tf2);
		
		//JTextArea는 JScrollPane에 붙여야 스크롤바가 붙는다.
		ta1 = new JTextArea(10,10);//rows 10 , columns 10
		ta2 = new JTextArea("$10,000 Buy-In !!",5,20);
		JScrollPane sp=new JScrollPane(ta2);
		p.add(sp);
		p.add(ta1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창 닫기 처리-프로세스 종료
		
	}//생성자 --------------------------

	public static void main(String[] args) {
		MyGui my=new MyGui();//JFrame
		my.setSize(500,500);
		my.setVisible(true);
		
	}//main

}//class