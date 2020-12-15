package Ch11;

import java.awt.*;
import javax.swing.*;

public class Ex03_2 extends JFrame{

	public Ex03_2() {
	
		setContentPane(new Mypanel());
		
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class Mypanel extends JPanel{
		private ImageIcon icon = new ImageIcon("src/img/img1.jpg");
		private Image img = icon.getImage();
		private ImageIcon icon2 = new ImageIcon("src/img/img3.jpeg");
		private Image img2 = icon2.getImage();
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img,0, 0, getWidth(), getHeight()/2,this);
			g.drawImage(img2,0, getHeight()/2, getWidth(), getHeight(),this);
		}
		
	}
	
	
	
	public static void main(String[] args) {

		new Ex03_2();
	}

}
