package Ch08;

import java.awt.*;
import javax.swing.*;

public class ex06 extends JFrame{

	public ex06() {

		super("Random Labels");
		
		for (int i = 0; i < 20; i++) {		
		JLabel label = new JLabel(Integer.toString(i));
		int x = (int)(Math.random()*220)+30;
		int y = (int)(Math.random()*220)+30;
		label.setLocation(x,y);
		label.setSize(20,20);
		label.setForeground(Color.magenta);
		
		add(label);
		}
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {

		new ex06();
	}

}
