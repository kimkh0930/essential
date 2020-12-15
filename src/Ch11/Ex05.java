package Ch11;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex05 extends JFrame{

	public Ex05() {

		setContentPane(new Mypanel());
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	class Mypanel extends JPanel{
		private Vector<Point> v = new Vector<Point>();
		private Point p;
		
		public Mypanel() {

			Mylistener listener = new Mylistener();
			addMouseListener(listener);
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.magenta);
			for (int i = 0; i < v.size(); i++) {
				if(i==0)
					g.drawLine(v.elementAt(0).x, v.elementAt(0).y, v.elementAt(0).x, v.elementAt(0).y);
				if(i>=1)
				g.drawLine(v.elementAt(i-1).x, v.elementAt(i-1).y, v.elementAt(i).x, v.elementAt(i).y);
			}
		}
		
		class Mylistener extends MouseAdapter{
			@Override
			public void mousePressed(MouseEvent e) {
				p = e.getPoint();
				v.add(p);
				repaint();
			}
		}
	}
	
	
	
	public static void main(String[] args) {

		new Ex05();
		
	}

}
