package Ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex06 extends JFrame implements ActionListener{

	JTextField jtf1 = new JTextField(8);
	JLabel la = new JLabel("->");
	JTextField jtf2 = new JTextField(8);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	ButtonGroup g = new ButtonGroup();
	JRadioButton decimal = new JRadioButton("decimal");
	JRadioButton binary = new JRadioButton("binary");
	JRadioButton octal = new JRadioButton("cotal");
	JRadioButton hex = new JRadioButton("hex");
	
	
	public Ex06() {

		setLayout(new FlowLayout());
		p1.setLayout(new FlowLayout());
		p1.add(jtf1);
		p1.add(la);
		p1.add(jtf2);
		add(p1);
		
		g.add(decimal);
		g.add(binary);
		g.add(octal);
		g.add(hex);
		

		p2.add(decimal);
		p2.add(binary);
		p2.add(octal);
		p2.add(hex);
		decimal.addActionListener(this);
		binary.addActionListener(this);
		octal.addActionListener(this);
		hex.addActionListener(this);
		
		add(p2);
		
		
		setSize(350,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	
	
	
	public static void main(String[] args) {
		new Ex06();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int n = Integer.parseInt(jtf1.getText());
		
		if(e.getSource()==binary)
			jtf2.setText(Integer.toBinaryString(n));
		if(e.getSource()==octal)
			jtf2.setText(Integer.toOctalString(n));
		if(e.getSource()==hex)
			jtf2.setText(Integer.toHexString(n));
		if(e.getSource()==decimal)
			jtf2.setText(Integer.toString(n));
		
	}

}
