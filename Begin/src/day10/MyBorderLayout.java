package day10;
import javax.swing.*;
import java.awt.*;
public class MyBorderLayout extends JFrame{
	JButton [] bt=new JButton[5];
	JPanel p=new JPanel();
	

	public MyBorderLayout() {
		super("MyBorderLayout");
		add(p);
		p.setLayout(new BorderLayout());
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton("b"+(i+1));
			//p.add(bt[i]);
		}
		p.add(bt[0], "North");
		p.add(bt[1], "South");
		p.add(bt[2], "West");
		p.add(bt[3], "East");
		p.add(bt[4]);
		//영역을 지정하지 않으면 "Center"가 디폴트값
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyBorderLayout my=new MyBorderLayout();
		my.setSize(500, 500);
		my.setVisible(true);

	}

}
