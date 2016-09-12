
public class Patient {
	private boolean care = false;
	private boolean isAlive = true;

	void checkPulse() {
		care = true;
	}
	
	boolean feelsCaredFor() {
		return care;
	}
	
	void setCare(boolean b) {
		care = b;
	}
	
	boolean isAlive() {
		return isAlive;
	}
	
	void kill() {
		isAlive = false;
	}
}
