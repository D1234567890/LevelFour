
public class AdvancedLoops {
	public static void main(String[] args) {
		System.out.println(sequenceGenerator(21));
	}

	static String sequenceGenerator(long n) {
		if (n / 2 == 1) {
			String sequence = "";
			long number = 1;
			while (!(number >= n)) {
				number *= 2;
				number++;
				String hold = " " + number;
				sequence += hold;
			}
			return sequence;
		} else {
			String sequence = "";
			long number = 1;
			while (!(number >= n)) {
				number *= 2;
				String hold = " " + number;
				sequence += hold;
			}
			return sequence;
		}
	}
}
