import javax.swing.JOptionPane;

public class WhileLoops {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, millionareFrom1Dollar() + " years!");
		JOptionPane.showMessageDialog(null, manySlices() + " times!");
		blackWhiteInfinity();
	}
	
	static long millionareFrom1Dollar() {
		long amount = 1000000l;
		long money = 1;
		long years = 0;
		while (money < amount) {
			money *= 2;
			years++;
		}
		return years;
	}
	
	static void blackWhiteInfinity() {
		boolean black = false;
		
		while (black || !black) {
			if (!black) {
				black = true;
				System.out.println("white");
			} else {
				black = false;
				System.out.println("black");
			}
		}
	}
	
	static long manySlices() {
		long amount = 1;
		long slices = 1046;
		long years = 0;
		while (slices >= amount) {
			slices /= 2;
			years++;
		}
		return years;
	}
}
