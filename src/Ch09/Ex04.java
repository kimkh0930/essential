package Ch09;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Ex04 extends JFrame implements KeyListener {

	JLabel la = new JLabel("Love Java");
	
	
	public Ex04() {
		
		Container c = getContentPane();
		la.setFont(new Font("Arial",Font.PLAIN,10));

	
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(this);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	public static void main(String[] args) {

		new Ex04();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		Font f = la.getFont();
		int size = f.getSize();

		if(e.getKeyChar()=='+')
			la.setFont(new Font("Arial",Font.PLAIN,size+5));	
		else if(e.getKeyChar()=='-'&& size>5)
			la.setFont(new Font("Arial",Font.PLAIN,size-5));	
		
		 }
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
