import java.awt.Color;
import java.awt.Graphics;

public class MouseMorph extends Polymorph {
	int mouseX;
	int mouseY;

	MouseMorph(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		x = mouseX;
		y = mouseY;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}
}
