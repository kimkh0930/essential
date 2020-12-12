package Ch10;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Ex08 extends JFrame{

	Container c = getContentPane();
	JLabel la[] = new JLabel[10];
	private int number =0;
	
	public Ex08() {

		c.setLayout(null);
		
		Mylistener listener = new Mylistener();
		
		
		for (int i = 0; i < 10; i++) {
			la[i] = new JLabel(Integer.toString(i));
			c.add(la[i]);
			la[i].setSize(30,30);
			la[i].setLocation(((int)(Math.random()*350+10)),(int)((Math.random()*350+10)));
			la[i].setForeground(Color.magenta);
			la[i].addMouseListener(listener);
		}
		
		
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}
	
	
	public static void main(String[] args) {

		new Ex08();
	}

	class Mylistener extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			for (int i = 0; i < la.length; i++) {
				JLabel la2 = (JLabel)e.getSource();
				
				if(la[number]==la2) {
					la[number].setVisible(false);
					number++;
				}
			}
		}
		
	}
}
