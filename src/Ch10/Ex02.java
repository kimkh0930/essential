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
		JMenu screenMenu = new JMenu("파일");
		
		mb.add(screenMenu);
		mb.add(new JMenu("편집"));
		JMenu lookMenu = new JMenu("보기");
		mb.add(lookMenu);
		mb.add(new JMenu("입력"));
		
		lookMenu.add(new JMenuItem("화면확대"));
		lookMenu.addSeparator();
		lookMenu.add(new JMenuItem("쪽윤곽"));
		
		
		setJMenuBar(mb);
	}
	
	
	public static void main(String[] args) {
		new Ex02();
		
		
	}

}
