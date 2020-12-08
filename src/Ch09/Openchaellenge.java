package Ch09;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Openchaellenge extends JFrame implements KeyListener {

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JLabel la[] = new JLabel[3];
	JLabel la4 = new JLabel("시작합니다.");
	public Openchaellenge() {

		
		setLayout(new FlowLayout());
		
		for (int i = 0; i < la.length; i++) {
			la[i] = new JLabel(Integer.toString(0));
			la[i].setBackground(Color.magenta);
			la[i].setOpaque(true);
			la[i].setForeground(Color.yellow);
			la[i].setPreferredSize(new Dimension(100,60));
			la[i].setHorizontalAlignment(JLabel.CENTER);
			la[i].setFont(new Font("Arial",Font.PLAIN,40));
			p1.add(la[i],new FlowLayout());
		}
		
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,40,80));
		p2.add(la4,new FlowLayout());
		
		add(p1);
		add(p2);
		addKeyListener(this);
		
		
		setSize(500,350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar()=='\n') {
			int x = (int)(Math.random()*5);
			int y = (int)(Math.random()*5);
			int z = (int)(Math.random()*5);
			
			la[0].setText(Integer.toString(x));
			la[1].setText(Integer.toString(y));
			la[2].setText(Integer.toString(z));
			
			if(x==y&&y==z)
				la4.setText("축하합니다.");
			else
				la4.setText("아쉽군요");
		}
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		new Openchaellenge();
	}

}
