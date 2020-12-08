package Ch08;

import java.awt.*;
import javax.swing.*;

public class ex04 extends JFrame{

	public ex04() {

		Color [] color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,
					Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		
		setLayout(new GridLayout(1,10));
		for (int i = 0; i < color.length; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			add(button);
			
		}
		
		
		setSize(600,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ex04();
	}

}
