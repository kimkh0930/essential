package Ch09;

import java.awt.*;
import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 extends JFrame implements KeyListener {

	Container c = getContentPane();
	public Ex02() {

	super("Å° ÀÔ·Â");
	c.setBackground(Color.cyan);
	
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	addKeyListener(this);
	
	c.setFocusable(true);
	c.requestFocus();
	
	}
	

	public static void main(String[] args) {

		new Ex02();
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==e.VK_R) {
			c.setBackground(Color.RED);
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {

		c.setBackground(Color.CYAN);
	}

}
