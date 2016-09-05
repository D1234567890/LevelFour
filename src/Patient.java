
public class Patient {
	private boolean care = false;

	void checkPulse() {
		care = true;
	}
	
	boolean feelsCaredFor() {
		return care;
	}
	
	void setCare(boolean b) {
		care = b;
	}
}
