package Ch08;

import java.awt.*;
import javax.swing.*;

public class ex02 extends JFrame{

	public ex02() {
		super("BorderLayout Practice");
		
		JButton jbn = new JButton("North");
		JButton jbw = new JButton("West");
		JButton jbe = new JButton("East");
		JButton jbs = new JButton("South");
		JButton jbc = new JButton("Center");
		
		setLayout(new BorderLayout(50,5));
		
		add(jbn,BorderLayout.NORTH);
		add(jbw,BorderLayout.WEST);
		add(jbe,BorderLayout.EAST);
		add(jbs,BorderLayout.SOUTH);
		add(jbc,BorderLayout.CENTER);
		
		
		setBounds(300, 300, 400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {

		new ex02();
	}

}
