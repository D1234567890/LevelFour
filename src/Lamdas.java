import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lamdas {
	final int length = 500;
	final int height = 60;
	JFrame frame = new JFrame("Lamda Activity");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");

	Lamdas() {
		frame.setVisible(true);
		frame.setSize(length, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		button1.addActionListener((e) -> {
			Random random = new Random();
			int randomInt = random.nextInt();
			JOptionPane.showMessageDialog(null, " " + randomInt);
		});
		
		button2.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, "Adrian");
		});
		
		button3.addActionListener((e) -> {
			frame.setTitle("Dumb Program");
		});
		
		button4.addActionListener((e) -> {
			frame.setVisible(false);
		});
	}

	public static void main(String[] args) {
		Lamdas call = new Lamdas();
	}
}
