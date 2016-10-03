
public class Square extends Rectangle {
	private float sideLength;
	
	Square(float base, float height, float sideLength) {
		super(base, height);
		this.sideLength = sideLength;
	}
	
	float getArea() {
		return sideLength * sideLength;
	}
	
	float getPerimeter() {
		return sideLength * 4;
	}
	
	float getSideLength() {
		return sideLength;
	}
}
