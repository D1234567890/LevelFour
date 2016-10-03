
public class EquilateralTriangularPyramid {
	private float sideLength;
	
	EquilateralTriangularPyramid(float sideLength) {
		this.sideLength = sideLength;
	}
	
	float getArea() {
		return (float) ((float) (Math.sqrt(((sideLength * sideLength) + ((sideLength / 2) * (sideLength / 2)))) * sideLength * (1/2)) * Math.sqrt((2/3) * sideLength) * (1/3));
	}
	
	float getSurfaceArea() {
		return (float) ((Math.sqrt((sideLength * sideLength) + ((sideLength / 2) * (sideLength / 2)))) * sideLength * (1/2) * 4);
	}
	
	float getSideLength() {
		return sideLength;
	}
}
