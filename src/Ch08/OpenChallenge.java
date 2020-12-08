package Ch08;

import java.awt.*;
import javax.swing.*;

public class OpenChallenge extends JFrame{

	public OpenChallenge() {
		super("Open Challenge 8");
	
		add(new NorthPanel(),new BorderLayout().NORTH);
		CenterPanel cp = new CenterPanel();
		cp.setLayout(null);
		JLabel label = new JLabel("Hello Java!");
		label.setSize(100,20);
		label.setLocation(105, 50);
		cp.add(label);
		
		add(cp,new BorderLayout().CENTER);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	public static void main(String[] args) {

		new OpenChallenge();
	}

}

class NorthPanel extends JPanel{
	
	public NorthPanel() {
		JButton open = new JButton("Open");
		JButton Read = new JButton("Read");
		JButton Close = new JButton("Close");

		add(open,new FlowLayout().LEFT);
		add(Read,new FlowLayout().CENTER);
		add(Close,new FlowLayout().RIGHT);
		
		setBackground(Color.LIGHT_GRAY);
	}
	
}
class CenterPanel extends JPanel{
	public CenterPanel() {
	
	}
	
}
