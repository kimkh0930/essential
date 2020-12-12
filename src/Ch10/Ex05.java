package Ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class Ex05 extends JFrame implements ActionListener{

	JTextArea jta = new JTextArea();

	public Ex05() {
		createmenu();
	
		
		
		add(jta);
	
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void createmenu(){
		JMenuBar jb = new JMenuBar();
		JMenu m = new JMenu("����");
		JMenuItem item = new JMenuItem("����");
		m.add(item);
		item.addActionListener(this);
		jb.add(m);
		
		setJMenuBar(jb);
	}
	
	
	
	public static void main(String[] args) throws Exception{

		new Ex05();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(jta.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "�Է��� �ؽ�Ʈ�� �����ϴ�", "����", JOptionPane.ERROR_MESSAGE);
		}
		else {
			String fileName = JOptionPane.showInputDialog("������ ���ϸ��� �Է��ϼ���");
			if(fileName == null) {
				return;
			}
		try {
			FileWriter fout = new FileWriter(fileName);
			String t = jta.getText();
			StringTokenizer st = new StringTokenizer(jta.getText(),"\n");
			
			while(st.hasMoreTokens()) {
				fout.write(st.nextToken());
				fout.write("\r\n");
			}
			fout.close();
		} catch (IOException ee) {
		}
	}
	}
}
