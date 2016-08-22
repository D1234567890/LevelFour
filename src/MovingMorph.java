public class MovingMorph extends Polymorph {

	MovingMorph(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		x += 3;
	}
}
