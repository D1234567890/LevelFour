import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph {
	int mouseX;
	int mouseY;
	boolean pressed;

	ClickMorph(int x, int y) {
		super(x, y);
	}

	public void update() {
		if (mouseX > x && mouseY > y && mouseX < x + width && mouseY < y + height && pressed) {
			JOptionPane.showMessageDialog(null, "You hurt me!");
		}
		y++;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
