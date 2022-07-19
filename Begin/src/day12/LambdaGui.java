package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LambdaGui extends JFrame{
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JLabel lb;
	JButton bt1, bt2;

	public LambdaGui() {
		super("LambdaGui");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		lb=new JLabel(new ImageIcon("Myicon2.PNG"));
		lb.setText("Welcome to MyApp!");
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.TOP);
		lb.setFont(new Font("sans-serif",Font.BOLD,24));
							//서체 		스타일 	   크기
		p.add(pN,"North");
		p.add(lb,"Center");
		
		bt1=new JButton("Red");
		bt2=new JButton("Yellow");
		pN.add(bt1);
		pN.add(bt2);
		
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lb.setForeground(Color.red);
			}
		});
		
		bt2.addActionListener(e->lb.setForeground(Color.yellow));
		
		
		this.setSize(500,700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LambdaGui();
	}

}
