package Ch11;

import java.awt.*;
import javax.swing.*;

public class Ex01_4 extends JFrame{

	public Ex01_4() {

		setContentPane(new Mypanel());
		
	
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	
	class Mypanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			for (int i = 1; i < 10; i++) {
				g.drawLine((getWidth()/10)*i, 0,(getWidth()/10)*i , getHeight());
				g.drawLine(0, (getHeight()/10)*i, getWidth(), (getHeight()/10)*i);
			}
		}
	}
	
	
	public static void main(String[] args) {

		new Ex01_4();
		
	}

}
