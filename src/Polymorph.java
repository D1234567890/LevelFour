import java.awt.Color;
import java.awt.Graphics;

public class Polymorph {
	protected int x;
	protected int y;
	protected int width;
	protected int height;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
		width = 20;
		height = 20;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX(int num) {
		this.x = num;
	}

	void setY(int num) {
		this.y = num;
	}

	int getWidth() {
		return this.width;
	}

	int getHeight() {
		return this.height;
	}

	void setWidth(int num) {
		this.width = num;
	}

	void setHeight(int num) {
		this.height = num;
	}

	public void update() {
		
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}