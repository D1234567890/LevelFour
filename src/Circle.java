
public class Circle extends Ellipse {
	private float radius;

	Circle(float majorRadius, float minorRadius, float radius) {
		super(majorRadius, minorRadius);
		this.radius = radius;
	}
	
	float getArea() {
		return 3.14159f * radius * radius;
	}
	
	float getPerimeter() {
		return (radius + radius) * 3.14159f;
	}
	
	float getRadius() {
		return radius;
	}
}
