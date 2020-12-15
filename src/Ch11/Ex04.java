package Ch11;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Ex04 extends JFrame{

	public Ex04() {

	setContentPane(new Mypanel());
	
		
	setSize(400,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	class Mypanel extends JPanel{
		private ImageIcon icon = new ImageIcon("src/img/img1.jpg");
		private Image img = icon.getImage();
		private Point p;
		public Mypanel() {
			Mylistener listener = new Mylistener();
			
			addMouseListener(listener);
			addMouseMotionListener(listener);
		
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
			
			
			g.setColor(Color.green);
			if(p==null)return;
			g.fillOval(p.x, p.y, 20, 20);
			
				
		}
	
	
	class Mylistener extends MouseAdapter{
		
		@Override
		public void mousePressed(MouseEvent e) {
			p = e.getPoint();
		
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			p = e.getPoint();
			repaint();
		
		}
		
	}
	}
	
	
	public static void main(String[] args) {

		new Ex04();
	}

}
