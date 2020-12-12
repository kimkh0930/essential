package Ch10;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10 extends JFrame implements ActionListener {

	static int count = 0;
	JLabel la1 = new JLabel("����");
	JLabel la2 = new JLabel("�ѱ�");
	JLabel la3 = new JLabel();
	JTextField jta1 = new JTextField(10);
	JTextField jta2 = new JTextField(10);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JButton jb1 = new JButton("����");
	JButton jb2 = new JButton("ã��");
	JButton jb3 = new JButton("����");
	JButton jb4 = new JButton("��κ���");
	JTextArea jta = new JTextArea(15, 30);
	HashMap<String, String> hm = new HashMap<>();

	public Ex10() {

		setLayout(new FlowLayout());
		p1.add(la1);
		p1.add(jta1);
		p1.add(la2);
		p1.add(jta2);

		add(p1);

		p2.add(jb1);
		p2.add(jb2);
		p2.add(jb3);
		p2.add(jb4);
		p2.add(la3);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);

		add(p2);

		p3.add(jta);
		add(p3);

		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex10();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String eng = jta1.getText();

		if (e.getSource() == jb1) {
			if (hm.get(eng) == null) {
				hm.put(jta1.getText(), jta2.getText());
				jta.append("���� (" + jta1.getText() + "," + jta2.getText() + ")\n");
				count++;
				la3.setText(Integer.toString(count));
			} else {
				hm.put(jta1.getText(), jta2.getText());
				jta.append("���� (" + jta1.getText() + "," + jta2.getText() + ")\n");
			}
		}
		if (e.getSource() == jb2) {
			jta2.setText(hm.get(eng));
		}
		if (e.getSource() == jb3) {
			Set<String> keys = hm.keySet();
			Iterator<String> it = keys.iterator();
			String key = it.next();
			String value = hm.get(key);
			jta.append("���� (" + jta1.getText() + "," + jta2.getText() + ")\n");
			hm.remove(key, value);
			count--;
			la3.setText(Integer.toString(count));
		}
		if (e.getSource() == jb4) {
			jta.setText("");
			Set<String> keys = hm.keySet();
			Iterator<String> it = keys.iterator();
			while (it.hasNext()) {
				String key = it.next();
				String value = hm.get(key);
				jta.setText(jta.getText() + "�ܾ� (" + key + "," + value + ")\n");
			}
		}

	}
}