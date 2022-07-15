package day10;
import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame {
	JPanel p=new JPanel();
	JButton [] bt=new JButton[4];
	
	JTextArea ta;

	public MyApp() {
		super("MyApp");
		this.add(p);
		p.setBackground(Color.blue);
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton();
		}
		
		bt[0]=new JButton("Login");
		bt[1]=new JButton("Join");
		bt[2]=new JButton("Home");
		bt[3]=new JButton("Exit");
		
		p.add(bt[0], "North");
		p.add(bt[1], "North");
		p.add(bt[2], "North");
		p.add(bt[3], "North");
		
		ta = new JTextArea(8,8);
		JScrollPane sp=new JScrollPane(ta);
		p.add(sp,BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyApp my=new MyApp();
		my.setSize(500, 500);
		my.setVisible(true);

	}

}
