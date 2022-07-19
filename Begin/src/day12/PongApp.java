package day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongApp extends JFrame{
	
	JPanel p=new JPanel();
	JPanel pN=new JPanel();
	JTextArea ta;
	
	JLabel lb;
	JTextField tfName;
	JButton btAdd ,btSave;
	
	public PongApp() {
		super("PongApp");
		add(p,"Center");
		p.setLayout(new BorderLayout());
		
		p.add(pN,"North");
		pN.setBackground(Color.cyan);
		
		p.add(new JScrollPane(ta = new JTextArea()),"Center");
		
		lb=new JLabel("이 름");
		tfName=new JTextField(20);
		btAdd=new JButton("등 록");
		btSave=new JButton("저 장");
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);
		//리스너 부착 ----
		MyEventHandler handler=new MyEventHandler();
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		tfName.addActionListener(handler);//입력 후 엔터 이벤트
		
		setSize(500,700);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object obj=e.getSource();
			if(obj==btAdd || obj == tfName) {
				//setTitle("add");
				String name = tfName.getText();
				//System.out.println(name);
				name=name.trim();//공백제거하여 재할당
				
				try{
					char fname=name.charAt(0);
					if(fname == '퐁') {
						setTitle(name+"님 환영합니다.");
						//ta.setText(name);
						ta.append(name+"\n");
					}else if(fname == '콩') {
						//사용자정의 예외객체 발생 : throw new 예외객체();
						//에외가 발생 되면 해당 예외를 try~catch 한다.
						throw new NotSupportedNameException("콩씨는 등록이 불가합니다.");
					}else {
						throw new NotSupportedNameException("퐁씨가 아닌 성씨는 이용에 제한이 있습니다.");
					}
					
				}catch(NotSupportedNameException ex) {
						String msg=ex.getMessage();
						setTitle(msg);
						//메세지 박스 띄우기
						JOptionPane.showMessageDialog(p, msg);
						
				}finally {
					tfName.setText("");
					tfName.requestFocus();//입력 포커스 주기
				}
			}else if(obj==btSave) {
				//setTitle("save");
				
			}
		}
	}////

	public static void main(String[] args) {
		new PongApp();
	}//main
}//class