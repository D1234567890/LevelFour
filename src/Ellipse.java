
public class Ellipse {
	private float majorRadius;
	private float minorRadius;
	
	Ellipse(float majorRadius, float minorRadius) {
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}
	
	float getArea() {
		return 3.14159f * majorRadius * minorRadius;
	}
	
	float getPerimeter() {
		return (float) (3.14159f * ((3 * majorRadius) + (3 * minorRadius) - Math.sqrt(((3 * majorRadius) + minorRadius) * (majorRadius + (3 * minorRadius)))));
	}
	
	float getMajorRadius() {
		return majorRadius;
	}
	
	float getMinorRadius() {
		return minorRadius;
	}
}
