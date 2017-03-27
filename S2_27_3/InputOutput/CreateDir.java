package oops.S2_27_3.InputOutput;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import java.io.File;

public class CreateDir {
	public static void main(String args[]) {
		String dirname = "C:\\jeffa";
		File d = new File(dirname);
		// Create directory now.
		d.mkdirs();
		System.out.println("Iam akhil");
	}
}
