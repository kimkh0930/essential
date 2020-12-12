package Ch10;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Ex04 extends JFrame implements ItemListener{

	JCheckBox set = new JCheckBox("버튼 비활성화");
	JCheckBox ca = new JCheckBox("버튼 감추기");
	JButton jb = new JButton("test Button");
	public Ex04() {
		
		
		setLayout(new FlowLayout());
		
		
		add(set);
		add(ca);
		add(jb);
		
		set.addItemListener(this);
		ca.addItemListener(this);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {

		new Ex04();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
		if(e.getItem()==set)
			jb.setEnabled(false);
		if(e.getItem()==ca)
			jb.setVisible(false);
		}
		if(e.getStateChange()==ItemEvent.DESELECTED) {
			if(e.getItem()==set)
				jb.setEnabled(true);
			if(e.getItem()==ca)
				jb.setVisible(true);
		}
		
		
	}

}
