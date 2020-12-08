package Ch09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.*;
public class Bonus1 extends JFrame implements MouseWheelListener {

	JLabel la = new JLabel("Love Java");
	public Bonus1() {

	super("¸¶¿ì½º ÈÙ");
	
	la.setFont(new Font("Arial",Font.PLAIN,10));
	setLayout(new FlowLayout());
	add(la);
	
	la.addMouseWheelListener(this);
	
	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {

		int n = e.getWheelRotation();
		Font f = la.getFont();
		int size = f.getSize();
		if(n>0&&size>5) {
			la.setFont(new Font("Arial",Font.PLAIN,size-5));
		}
		if(n<0) {
			la.setFont(new Font("Arial",Font.PLAIN,size+5));
		}
	}

	public static void main(String[] args) {

		new Bonus1();
	}

}
