package Ch09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex01 extends JFrame implements MouseListener {

	public Ex01() {

	JLabel label = new JLabel("»ç¶ûÇØ");
	
	setLayout(new FlowLayout());
	add(label);
	
	
	label.addMouseListener(this);	
	
	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
		JLabel label = (JLabel)e.getSource();
			label.setText("ÀÚ±â¾ß");
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JLabel label = (JLabel)e.getSource();
			label.setText("»ç¶ûÇØ");
		

	}

	public static void main(String[] args) {

		new Ex01();
	}

}
