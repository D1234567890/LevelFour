import javax.swing.JOptionPane;

public class Implementation {
	public static String betterString(String s1, String s2, Sorter s) {
		if (s.sort(s1, s2)) {
			return s1;
		} else {
			return s2;
		}
	}

	public static void main(String[] args) {
		String store1;
		String store2;
		store1 = JOptionPane.showInputDialog("Enter a String:");
		store2 = JOptionPane.showInputDialog("Enter another String:");
		JOptionPane.showMessageDialog(null, "Longer String: " + betterString(store1, store2, (s1, s2) -> {
			if (s1.length() > s2.length()) {
				return true;
			} else {
				return false;
			}
		}));

		JOptionPane.showMessageDialog(null, "Shorter String: " + betterString(store1, store2, (s1, s2) -> {
			if (s1.length() < s2.length()) {
				return true;
			} else {
				return false;
			}
		}));

		JOptionPane.showMessageDialog(null,
				"Lexicographically Smaller String: " + betterString(store1, store2, (s1, s2) -> {
					if (s1.compareTo(s2) < 0) {
						return true;
					} else {
						return false;
					}
				}));

		JOptionPane.showMessageDialog(null,
				"Lexicographically Larger String: " + betterString(store1, store2, (s1, s2) -> {
					if (s1.compareTo(s2) > 0) {
						return true;
					} else {
						return false;
					}
				}));

		JOptionPane.showMessageDialog(null, "More Vowelous String: " + betterString(store1, store2, (s1, s2) -> {
			int numVowelsS1 = 0;
			int numVowelsS2 = 0;

			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
						|| s1.charAt(i) == 'u') {
					numVowelsS1++;
				}
			}

			for (int i = 0; i < s2.length(); i++) {
				if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o'
						|| s2.charAt(i) == 'u') {
					numVowelsS2++;
				}
			}

			if (numVowelsS1 > numVowelsS2) {
				return true;
			} else {
				return false;
			}
		}));

		JOptionPane.showMessageDialog(null, "More Consonantous String: " + betterString(store1, store2, (s1, s2) -> {
			int numVowelsS1 = 0;
			int numVowelsS2 = 0;

			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != 'a' || s1.charAt(i) != 'e' || s1.charAt(i) != 'i' || s1.charAt(i) != 'o'
						|| s1.charAt(i) != 'u') {
					numVowelsS1++;
				}
			}

			for (int i = 0; i < s2.length(); i++) {
				if (s2.charAt(i) != 'a' || s2.charAt(i) != 'e' || s2.charAt(i) != 'i' || s2.charAt(i) != 'o'
						|| s2.charAt(i) != 'u') {
					numVowelsS2++;
				}
			}

			if (numVowelsS1 > numVowelsS2) {
				return true;
			} else {
				return false;
			}
		}));
	}
}