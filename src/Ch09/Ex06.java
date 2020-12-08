package Ch09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex06 extends JFrame implements MouseListener{

	JLabel la[] = new JLabel[12];
	public Ex06() {

	setLayout(new GridLayout(4,3));
	
	for (int i = 0; i < 12; i++) {
		la[i] = new JLabel(Integer.toString(i));
		la[i].setOpaque(true);
		la[i].setBackground(Color.white);
		add(la[i]);
		la[i].addMouseListener(this);
	}

	setSize(300,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {

		new Ex06();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel la = (JLabel)e.getSource();
		int r =(int)(Math.random()*256);
		int g =(int)(Math.random()*256);
		int b =(int)(Math.random()*256);
		la.setOpaque(true);
		la.setBackground(new Color(r,g,b));
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
