
public class NumberCubeQuestion {
	public static int[] getCubeTosses(NumberCube n, int length) {
		return n.getValues();
	}

	public static int getLongestRun(int[] values) {
		int currentLen = 0;
		int maxLen = 0;
		int maxStart = -1;
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) {
				currentLen++;
				if (currentLen > maxLen) {
					maxLen = currentLen;
					maxStart = i - currentLen + 1;
				}
			} else {
				currentLen = 0;
			}
		}
		return maxStart;
	}
}
