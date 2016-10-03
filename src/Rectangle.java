
public class Rectangle extends Shape2D {
	private float base;
	private float height;
	
	Rectangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	float getArea() {
		return base * height;
	}
	
	float getPerimeter() {
		return (base * 2) + (height * 2);
	}
	
	float getBase() {
		return base;
	}
	
	float getHeight() {
		return height;
	}
}
