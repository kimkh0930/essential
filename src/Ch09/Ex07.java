 package Ch09;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ex07 extends JFrame implements ActionListener {

	JLabel la = new JLabel(Integer.toString((int)(Math.random()*59)+1));
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JButton jb1 = new JButton("+2");
	JButton jb2 = new JButton("-1");
	JButton jb3 = new JButton("%4");

	public Ex07() {
		
		add("North",jp1);
		jp1.add(la,new FlowLayout());
		
		jp2.add(jb1,new FlowLayout());
		jp2.add(jb2,new FlowLayout());
		jp2.add(jb3,new FlowLayout());
		add("South",jp2);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int n = Integer.parseInt(la.getText());
		
		if(e.getSource()==jb1) {
			n+=2;
			la.setText(Integer.toString(n));
			jb1.setEnabled(false);}
		else if(e.getSource()==jb2) {
			n-=1;
			la.setText(Integer.toString(n));
			jb2.setEnabled(false);}
		else if(e.getSource()==jb3) {
			n%=4;
			la.setText(Integer.toString(n));
			jb3.setEnabled(false);}
		
		if(n==0) {
			setTitle("성공");
			int n2 = (int)(Math.random()*59)+1;
			la.setText(Integer.toString(n2));
			jb1.setEnabled(true);
			jb2.setEnabled(true);
			jb3.setEnabled(true);
		}else if(n!=0) {
			if(jb1.isEnabled()==false&&jb2.isEnabled()==false&&jb3.isEnabled()==false)
				setTitle("실패");
		}
	}


	public static void main(String[] args) {

		new Ex07();
	}



}
