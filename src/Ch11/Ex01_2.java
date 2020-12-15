package Ch11;

import javax.swing.*;
import java.awt.*;

public class Ex01_2 extends JFrame{

	public Ex01_2() {

		setContentPane(new Mypanel());
		
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	class Mypanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.blue);
			g.drawOval(20, 20, 100, 100);
			g.setColor(Color.black);
			g.drawOval(130, 20, 100, 100);
			g.setColor(Color.red);
			g.drawOval(240, 20, 100, 100);
			g.setColor(Color.yellow);
			g.drawOval(70, 70, 100, 100);
			g.setColor(Color.green);
			g.drawOval(180, 70, 100, 100);
		}
	}
	
	
	public static void main(String[] args) {

		new Ex01_2();
	}

}
