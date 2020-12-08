package Ch09;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;


public class Ex03 extends JFrame implements MouseListener,MouseMotionListener {

	Container c = getContentPane();
	public Ex03() {
		super("µå·¡±ëµ¿¾È");
	
		
		c.setBackground(Color.GREEN);
		
		c.addMouseListener(this);
		c.addMouseMotionListener(this);
		
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.setFocusable(true);
		c.requestFocus();
		
		
	}
	
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		c.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		new Ex03();
	}



	@Override
	public void mouseClicked(MouseEvent e) {

		
	}



	@Override
	public void mousePressed(MouseEvent e) {

	}



	@Override
	public void mouseReleased(MouseEvent e) {
		c.setBackground(Color.green);
		
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
