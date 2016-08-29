import java.util.ArrayList;

public class TwoMoreLetters {
	public static void main(String[] args) {
		twoLettersAhead(
				"g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj");
	}

	public static void twoLettersAhead(String s) {
		ArrayList<Character> letters = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			int store = s.charAt(i);
			letters.add((char) store);
		}
		for (int i = 0; i < letters.size(); i++) {
			if (Character.isLetter(letters.get(i))) {
				if (letters.get(i) == 121) {
					letters.set(i, (char) 97);
				} else if (letters.get(i) == 122) {
					letters.set(i, (char) 98);
				} else {
					int store = letters.get(i) + 2;
					letters.set(i, (char) store);
				}
			}
		}
		for (int i = 0; i < letters.size(); i++) {
			char convert = letters.get(i);
			System.out.print(convert);
		}
	}
}
