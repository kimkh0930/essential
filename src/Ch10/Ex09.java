package Ch10;

import java.awt.*;
import javax.swing.*;


import java.awt.event.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex09 extends JFrame implements ActionListener {

	static int count =0;
	JLabel la1 = new JLabel("영어");
	JLabel la2 = new JLabel("한글");
	JLabel la3 = new JLabel();
	JTextField jta1 = new JTextField(10);
	JTextField jta2 = new JTextField(10);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JButton jb1 = new JButton("저장");
	JButton jb2 = new JButton("찾기");
	JTextArea jta = new JTextArea(15, 30);
	HashMap<String, String> hm = new HashMap<>();
	Set<String> key = hm.keySet();
	Iterator<String> it = key.iterator();
	public Ex09() {

		setLayout(new FlowLayout());
		p1.add(la1);
		p1.add(jta1);
		p1.add(la2);
		p1.add(jta2);

		add(p1);

		p2.add(jb1);
		p2.add(jb2);
		p2.add(la3);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		
		add(p2);

		p3.add(jta);
		add(p3);

		
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex09();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String eng = jta1.getText(); 

		if (e.getSource() == jb1) {
			if(hm.get(eng)==null) {
			hm.put(jta1.getText(), jta2.getText());
			jta.append("삽입 (" + jta1.getText() + "," + jta2.getText() + ")\n");
			count++;
			la3.setText(Integer.toString(count));
		}
			else {
				hm.put(jta1.getText(), jta2.getText());
				jta.append("변경 (" + jta1.getText() + "," + jta2.getText() + ")\n");
			}
		}
		if (e.getSource() == jb2) {
				jta2.setText(hm.get(eng));
			}
		}

	}


