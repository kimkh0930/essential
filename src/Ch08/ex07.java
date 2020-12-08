package Ch08;

import java.awt.*;
import javax.swing.*;

public class ex07 extends JFrame{

	public ex07() {

		add("North",new NorthPanle());
		add("Center",new CenterPanle());
		add("South",new SouthPanle());
		
		
	
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {

		new ex07();
	}

}
class NorthPanle extends JPanel{
	
	public NorthPanle() {
		JButton jb1 = new JButton("새로 배치");
		JButton jb2 = new JButton("종료");
	
		add(jb1,new FlowLayout());
		add(jb2,new FlowLayout());
	
		setBackground(Color.yellow);
	}
	
}
class CenterPanle extends JPanel{
	
public CenterPanle() {
	setLayout(null);
	for (int i = 0; i < 10; i++) {
		JLabel label = new JLabel("*");
		int x = (int)(Math.random()*150)+30;
		int y = (int)(Math.random()*150)+30;
		label.setLocation(x,y);
		label.setSize(10,10);		
		label.setForeground(Color.red);
		
		add(label);
		
	}
	

}	
	
}
class SouthPanle extends JPanel{
public SouthPanle() {

	JButton jb = new JButton("별 개수 수정");
	JTextField jtf = new JTextField(15);
	
	add(jb,new FlowLayout().LEFT);
	add(jtf,new FlowLayout().CENTER);
	
	setBackground(Color.LIGHT_GRAY);
}	
	
	
}

