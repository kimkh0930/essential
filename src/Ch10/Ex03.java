package Ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex03 extends JFrame implements ItemListener{
	Container c = getContentPane();
	JRadioButton red = new JRadioButton("Red");
	JRadioButton blue = new JRadioButton("Blue");
	public Ex03() {

		setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		
		g.add(red);
		g.add(blue);
		
		
		c.add(red);
		c.add(blue);
		
		red.addItemListener(this);
		blue.addItemListener(this);
		setSize(250,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {

		new Ex03();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getItem()==red)
			c.setBackground(Color.red);
		if(e.getItem()==blue)
			c.setBackground(Color.blue);
	}

}
