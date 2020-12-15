package Ch11;

import java.awt.*;
import javax.swing.*;

public class Ex01_1 extends JFrame{

	public Ex01_1() {
		
		
		setContentPane(new MyPanel());

		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.yellow);
			g.fillArc(70, 20, 100, 100, 330, 120);
			g.setColor(Color.red);
			g.fillArc(70, 20, 100, 100, 90, 120);
			g.setColor(Color.blue);
			g.fillArc(70, 20, 100, 100, 210, 120);
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01_1();
	}

}
