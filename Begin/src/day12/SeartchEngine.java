package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJPanel extends JPanel{
	
	@Override
	public Insets getInsets() {
		Insets in=new Insets(15,15,15,15);//식계 반대 방향
		return in;
	}
}

public class SeartchEngine extends JFrame{
	JPanel p=new MyJPanel();//디폴트 FlowLayout
	
	JButton[] bt=new JButton[4];
	String [] str= {"Naver","Google","Daum","Yahoo"};
	
	public SeartchEngine() {
		super("SeartchEngine");
		add(p);
		
		p.setLayout(new GridLayout(2,2,15,15));
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
			System.out.println(bt[i]);
		}
		
		//버튼에 대한 이벤트 처리를 anonymous class로 해보자
		bt[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[0].setBackground(Color.green);
				setTitle(str[0]);
			}
		});
		
		bt[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[1].setBackground(Color.white);
				setTitle(str[1]);
			}
		});
		
		bt[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//이벤트가 발생된 객체
				String cmd=e.getActionCommand();//이벤트소스의 라벨문자열을 반환
				setTitle(cmd);
				((JButton)obj).setBackground(Color.blue);
			}
		});
		
		bt[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();//이벤트가 발생된 객체
				String cmd=e.getActionCommand();//이벤트소스의 라벨문자열을 반환
				setTitle(cmd);
				((JButton)obj).setBackground(Color.magenta);
			}
		});
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SeartchEngine my=new SeartchEngine();
		my.setSize(500,500);
		my.setVisible(true);
	}

}
