package Ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex07 extends JFrame {

	ImageIcon icon = new ImageIcon("src//img//img2.jpg");
	JLabel la = new JLabel(icon);
	
	public Ex07() {
		
		MyListener listener = new MyListener();
		setLayout(null);
		
		la.setLocation(50,50);
		la.setSize(50,50);
		
		add(la);
		la.addMouseListener(listener);
		la.addMouseMotionListener(listener);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {

		new Ex07();
	}

	class MyListener extends MouseAdapter{

		private int x,y;
		@Override
		public void mouseDragged(MouseEvent e) {

			int xdis = e.getX()-x;
			int ydis = e.getY()-y;
			la.setLocation(la.getX()+xdis,la.getY()+ydis);
		}
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
		}
		
	}
}
