package Ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bonus2 extends JFrame implements ActionListener {

	JButton jb[] = new JButton[16];

	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	String op = " ";
	public Bonus2() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel la1 = new JLabel("수식");
		JLabel la2 = new JLabel("결과");
		setLayout(new BorderLayout());
		p1.add(la1, new FlowLayout());
		p1.add(t1);
		p1.add(la2);
		p1.add(t2);
		p1.setBackground(Color.GRAY);

		add("North", p1);
		p2.setLayout(new GridLayout(4, 4, 5, 5));
		add("Center", p2);

		for (int i = 0; i <= 9; i++) {
			jb[i] = new JButton(Integer.toString(i));
			p2.add(jb[i]);
			jb[i].addActionListener(this);
		}
		jb[10] = new JButton("CE");
		jb[11] = new JButton("계산");
		jb[12] = new JButton("+");
		jb[13] = new JButton("-");
		jb[14] = new JButton("X");
		jb[15] = new JButton("/");

		for (int i = 10; i <= 15; i++) {
			p2.add(jb[i]);
			jb[i].addActionListener(this);
			if (i > 11)
				jb[i].setBackground(Color.cyan);
		}

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str;
		double f = 0;
		double s = 0;
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == jb[i])
				t1.setText(t1.getText() + Integer.toString(i));
		}
		if (e.getSource() == jb[10])
			t1.setText("");
		if (e.getSource() == jb[12]) {
			t1.setText(t1.getText() + "+");
			op = "+";
		}
		if (e.getSource() == jb[13]) {
			t1.setText(t1.getText() + "-");
			op = "-";
		}
		if (e.getSource() == jb[14]) {
			t1.setText(t1.getText() + "*");
			op = "*";
		}
		if (e.getSource() == jb[15]) {
			t1.setText(t1.getText() + "/");
			op = "/";
		}
		if (e.getSource() == jb[11]) {
			
			str=t1.getText();
			System.out.println(op);
			if(op.equals("+")) {
				String[] array = str.split("\\+");
				f = Double.parseDouble(array[0]);
				s = Double.parseDouble(array[1]);
				t2.setText(Double.toString(f + s));
				}
			
			if(op.equals("-")){
				str=t1.getText();
				String[] array1 = str.split("\\-");
				f = Double.parseDouble(array1[0]);
				s = Double.parseDouble(array1[1]);
				t2.setText(Double.toString(f - s));}
			if(op.equals("*")){
				str=t1.getText();
				String[] array2 = str.split("\\*");
				f = Double.parseDouble(array2[0]);
				s = Double.parseDouble(array2[1]);
				t2.setText(Double.toString(f * s));}
			if(op.equals("/")){
				str=t1.getText();
				String[] array3 = str.split("\\/");
				f = Double.parseDouble(array3[0]);
				s = Double.parseDouble(array3[1]);
				t2.setText(Double.toString(f / s));}

			}
		}
	

	public static void main(String[] args) {

		new Bonus2();
	}
}
