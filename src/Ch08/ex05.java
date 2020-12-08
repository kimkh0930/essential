package Ch08;

import java.awt.*;
import javax.swing.*;

public class ex05 extends JFrame {

	public ex05() {

		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
				Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.BLACK, Color.DARK_GRAY, Color.WHITE, Color.RED,
				Color.ORANGE, Color.YELLOW };

		setLayout(new GridLayout(4, 4));

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				JLabel label = new JLabel(Integer.toString(j + i * 4));
				label.setOpaque(true);
				label.setBackground(color[j + i * 4]);
				add(label);

			}
		}
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new ex05();
	}

}
