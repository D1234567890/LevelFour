import java.io.File;

import junit.framework.TestCase;

public class FileReadingTest extends TestCase {

	/**
	 * These unit tests will guide you towards making your own encryption algorithm. Once you get the first test to
	 * pass, comment in the next test, and continue with each subsequent test, one at a time, until you're done.
	 **/

	/* Create a file in your project. Use the File object to open it. */
	public void testOpenFile() throws Exception {
		assertTrue(FileEncryptor.openSecretFile().isFile());
	}

	public void testReadFile() throws Exception {
		File file = FileEncryptor.openSecretFile();
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", FileEncryptor.readOneLine(file));
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", FileEncryptor.readFileContents(file));
	}

	// /* Create your own encryption algorithm and adjust the asserts. */
	// public void testEncrypt() throws Exception {
	// String encryptMe = "lalala";
	// assertEquals("ncncnc", FileEncryptor.encrypt(encryptMe));
	// }

	// public void testSaveAFile() throws Exception {
	// assertTrue(FileEncryptor.saveFile("fileName").isFile());
	// }

	// public void testSaveStuffInFile() throws Exception {
	// File file = new File("file with stuff");
	// FileEncryptor.saveStuffInAFile("stuff", file);
	// assertEquals("stuff", FileEncryptor.readFileContents(file));
	// }

	// public void testDecrypt() throws Exception {
	// String decryptMe = "ncncnc";
	// assertEquals("lalala", FileEncryptor.decrypt(decryptMe));
	// }

	// public void testEverythingTogether() throws Exception {
	// String secretfileName = "june's secrets";
	// File secretFile = new File(secretfileName);
	// String stuffToEncrypt = FileEncryptor.readFileContents(secretFile);
	// String encryptedStuff = FileEncryptor.encrypt(stuffToEncrypt);
	// FileEncryptor.saveStuffInAFile(encryptedStuff, secretFile);
	//
	// assertEquals(stuffToEncrypt, FileEncryptor.decrypt(FileEncryptor.readFileContents(secretFile)));
	// }

}
