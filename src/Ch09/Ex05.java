package Ch09;
import java.awt.*;

import java.awt.event.*;
import java.awt.event.MouseListener;

import javax.swing.*;
public class Ex05 extends JFrame implements MouseListener {

	JLabel la = new JLabel("C");
	public Ex05() {
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		la.setSize(30,30);
		la.setLocation(50,50);
		c.add(la);
		
		la.addMouseListener(this);
		
	
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel la = (JLabel)e.getSource();
		Container c = la.getParent();
		int xBound = c.getWidth()-la.getWidth();
		int yBound = c.getHeight() - la.getHeight();
		
		int x = (int)(Math.random()*xBound);
		int y = (int)(Math.random()*yBound);
		la.setLocation(x,y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Ex05();
	}

}
