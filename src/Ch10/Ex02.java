package Ch10;

import java.awt.*;
import javax.swing.*;

public class Ex02 extends JFrame{

	public Ex02() {
		createMenu();
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("����");
		
		mb.add(screenMenu);
		mb.add(new JMenu("����"));
		JMenu lookMenu = new JMenu("����");
		mb.add(lookMenu);
		mb.add(new JMenu("�Է�"));
		
		lookMenu.add(new JMenuItem("ȭ��Ȯ��"));
		lookMenu.addSeparator();
		lookMenu.add(new JMenuItem("������"));
		
		
		setJMenuBar(mb);
	}
	
	
	public static void main(String[] args) {
		new Ex02();
		
		
	}

}
