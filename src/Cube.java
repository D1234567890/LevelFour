
public class Cube extends Shape3D {
	private float sideLength;

	Cube(float sideLength) {
		this.sideLength = sideLength;
	}

	float getArea() {
		return sideLength * sideLength * sideLength;
	}

	float getSurfaceArea() {
		return sideLength * sideLength * 6;
	}

	float getSideLength() {
		return sideLength;
	}
}
