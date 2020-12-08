package Ch08;

import java.awt.*;
import javax.swing.*;

public class ex03 extends JFrame{

	public ex03() {

		JLabel jl = new JLabel("100 + 200");
		JLabel jl2 = new JLabel("300");
		
		JButton jb = new JButton("=");

		setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		add(jl,FlowLayout.LEFT);
		add(jb,FlowLayout.CENTER);
		add(jl2,FlowLayout.RIGHT);
		
		
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ex03();
	}

}
