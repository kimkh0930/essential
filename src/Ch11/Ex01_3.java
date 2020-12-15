package Ch11;

import javax.swing.*;
import java.awt.*;

public class Ex01_3 extends JFrame{

	public Ex01_3() {

		setContentPane(new Mypanel());
		
	setSize(400,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	
	class Mypanel extends JPanel{
	
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int[]x = {getWidth(), getWidth()/2,0,getWidth()/2};
			int[] y = {getHeight()/2, getHeight(),getHeight()/2,0};
			g.drawPolygon(x,y,4);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01_3();
	}

}
