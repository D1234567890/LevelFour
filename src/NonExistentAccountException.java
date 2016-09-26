
@SuppressWarnings("serial")
public class NonExistentAccountException extends Exception {
	NonExistentAccountException(String message) {
		System.out.println(message);
	}
}
