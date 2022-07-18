package day11;
import javax.swing.*;

import day11.MyGui.MyEventHandler;

import java.awt.*;
import java.awt.event.*;

public class MySearchEngine extends JFrame{
	
	JPanel p=new JPanel();
	JButton bt,bt2,bt3,bt4;
	public MySearchEngine() {
		super("MySearchEngine");
		add(p);
		p.setLayout(new GridLayout(2,2));
		
		bt=new JButton("Naver");
		bt2=new JButton("Google");
		bt3=new JButton("Daum");
		bt4=new JButton("Yahoo");
		bt.setBackground(Color.green);
		bt2.setBackground(Color.yellow);
		bt3.setBackground(Color.blue);
		bt4.setBackground(Color.pink);
		p.add(bt);
		p.add(bt2);
		p.add(bt3);
		p.add(bt4);
		
		MyEventHandler click=new MyEventHandler();
		bt.addActionListener(click);
		bt2.addActionListener(click);
		bt3.addActionListener(click);
		bt4.addActionListener(click);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyEventHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==bt) {
				bt.setBackground(Color.cyan);
			}else if(obj==bt2) {
				bt2.setBackground(Color.white);
			}else if(obj==bt3) {
				bt3.setBackground(Color.orange);
			}else if(obj==bt4) {
				bt4.setBackground(Color.red);
			}
		}
	}

	public static void main(String[] args) {
		MySearchEngine my=new MySearchEngine();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
