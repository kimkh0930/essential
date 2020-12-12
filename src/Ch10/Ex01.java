package Ch10;

import javax.swing.*;
import java.awt.*;

public class Ex01 extends JFrame{

	public Ex01() {
		Container c = getContentPane();
		
		ImageIcon img1 = new ImageIcon("src//img//img1.jpg");
		JLabel la1 = new JLabel(img1);
		ImageIcon img2 = new ImageIcon("src//img//img2.jpg");
		JLabel la2 = new JLabel(img2);
		ImageIcon img3 = new ImageIcon("src//img//img3.jpeg");
		JLabel la3 = new JLabel(img3);
		ImageIcon img4 = new ImageIcon("src//img//img1.jpg");
		JLabel la4 = new JLabel(img4);
		
		
		c.setLayout(new GridLayout(1,4));
		
		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(la4);
		
		setSize(600,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
