package Ch11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpenChallenge extends JFrame implements KeyListener{

	JLabel la[] = new JLabel[4];
	JTextField jtf[] = new JTextField[4];
	JPanel p = new JPanel();
	String name[] = {"apple","cherry","strawberry","prune"};
	int data[]= {0,0,0,0};
	int sum =0;
	int percent[] = {0,0,0,0};
	Color color[] = {Color.red,Color.blue,Color.magenta,Color.yellow};
	public OpenChallenge() {
		Container c = getContentPane();
		for (int i = 0; i < 4; i++) {
			la[i] = new JLabel(name[i]);
			jtf[i] = new JTextField("0",5);
			p.add(la[i]);
			p.add(jtf[i]);
			jtf[i].addKeyListener(this);
		}

		c.add(new Mypanel());
		c.add("North",p);
		p.setBackground(Color.LIGHT_GRAY);
		
		
		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(jtf[i].getText());
			sum+= data[i];
		}
		for (int j = 0; j < data.length; j++) {
			try {
				percent[j]= data[j]/sum*100;
			} catch (Exception e) {
			}
		}
		
		
		
		setSize(450,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	class Mypanel extends JPanel{
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			for (int j = 0; j < data.length; j++) {
				g.setColor(color[j]);
				g.drawString(name[j]+" "+percent[j]+"%", j*105+20, 20);
			}
			
			for (int i = 0; i < data.length; i++) {
				g.setColor(color[i]);
				if(i==0)
					g.fillArc(150, 100, 200, 200, 0, percent[i]*100/360);
				else	
				g.fillArc(150, 100, 200, 200, percent[i-1]*100/360, percent[i]*100/360);
			}
		}
		
	}
		
	public static void main(String[] args) {

		new OpenChallenge();
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyChar()=='\n') {
			new Mypanel();
		}
		
		repaint();
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
