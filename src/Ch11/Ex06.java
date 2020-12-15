package Ch11;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Ex06 extends JFrame{

	public Ex06() {

		setContentPane(new Mypanel());
		
		
		setSize(1280,900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
	}
	
	class Mypanel extends JPanel{
		private ImageIcon icon = new ImageIcon("src/img/img3.jpeg");
		private Image img = icon.getImage();
		private int x = img.getWidth(this), y= img.getHeight(this); 
		public Mypanel() {
			Mylistener listener = new Mylistener();
			addKeyListener(listener);
			setFocusable(true);
			requestFocus();
		}
		@Override 
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 20, 20, x,y,this);
			
		}
		
		
		class Mylistener extends KeyAdapter{
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				
				if(e.getKeyChar()=='+') {
					x=x+x/10;
					y*=1.1;
				}else if(e.getKeyChar()=='-') {
					x/=1.1;
					y/=1.1;
				}
				
				repaint();
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		new Ex06();
	}

}
