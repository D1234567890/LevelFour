
public class Sphere extends Shape3D {
	private float radius;
	
	Sphere(float radius) {
		this.radius = radius;
	}
	
	float getArea() {
		return (4/3) * 3.14159f * radius * radius * radius;
	}

	float getSurfaceArea() {
		return 4 * 3.14159f * radius * radius;
	}
	
	float getRadius() {
		return radius;
	}
}
