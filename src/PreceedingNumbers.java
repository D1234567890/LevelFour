import java.util.ArrayList;

public class PreceedingNumbers {
	public static void main(String[] args) {
		ArrayList<Long> lists = new ArrayList<Long>();
		long n = 50;
		lists.add(new Long(n));
		while (n != 0) {
			if (n % 2 == 1) {
				n--;
				n /= 2;
			} else {
				n /= 2;
			}
			lists.add(new Long(n));
		}
		for (int i = lists.size() - 1; i >= 0; i--) {
			System.out.print(lists.get(i) + ", ");
		}
	}
}
