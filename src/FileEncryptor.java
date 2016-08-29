import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileEncryptor {
	public static File openSecretFile() {
		return new File("/Users/league/Desktop/LevelFour/src/Message.txt");
	}

	public static String readOneLine(File f) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			line = br.readLine();
		} catch (Exception e) {
			System.out.println("FILE NOT FOUND");
		}
		return line;
	}

	public static String readFileContents(File f) {
		String line = "";
		String contents = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			while ((line = br.readLine()) != null) {
				contents += line;
			}
		} catch (Exception e) {
			System.out.println("FILE NOT FOUND");
		}
		System.out.println(line);
		return contents;
	}
}
