
public class EquilateralTriangle extends Shape2D {
	private float base;
	private float height;

	EquilateralTriangle(float base, float height) {
		this.base = base;
		this.height = height;
	}

	float getArea() {
		return base * height * (1 / 2);
	}
	
	float getPerimeter() {
		return base * 3;
	}
	
	float getBase() {
		return base;
	}
	
	float getHeight() {
		return height;
	}
}
