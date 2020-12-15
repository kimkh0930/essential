package Ch11;

import java.awt.*;
import javax.swing.*;

public class Ex02 extends JFrame{

	JButton jb = new JButton("Hello");
	public Ex02() {

	setContentPane(new Mypanel());
	add(jb);
	
		
	setSize(400,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	class Mypanel extends JPanel{
		private ImageIcon icon = new ImageIcon("src/img/img1.jpg");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
		}
	}
	
	
	
	public static void main(String[] args) {

		new Ex02();
	}

}
