import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	
	ArrayList<Polymorph> a = new ArrayList<Polymorph>();

	RedMorph r;
	MovingMorph m;
	MouseMorph mm;
	ClickMorph c;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);

		r = new RedMorph(50, 50);
		m = new MovingMorph(50, 50);
		mm = new MouseMorph(50, 50);
		c = new ClickMorph(50, 50);
		
		a.add(r);
		a.add(m);
		a.add(mm);
		a.add(c);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		r.draw(g);
		m.draw(g);
		mm.draw(g);
		c.draw(g);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		c.update();
		m.update();
		mm.update();
	}

	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		mm.mouseX = e.getX();
		mm.mouseY = e.getY();
	}

	public void mouseClicked(MouseEvent e) {
		c.mouseX = e.getX();
		c.mouseY = e.getY();
		c.pressed = true;
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
}