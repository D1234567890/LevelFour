import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {

	RedMorph(int x, int y) {
		super(x, y);
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
}
