package oops.S2_27_3.InputOutput;

import java.io.*;

/**
 * Project: CoreJava FileName: CopyFile Author: test Note: To change this
 * template use File | Settings | File Templates.
 */
public class CopyFile {
	public static void main(String[] args) throws IOException {

		// FileInputStream in = null;
		// FileOutputStream out = null;

		FileReader in = null;
		FileWriter out = null;

		try {
			// in = new
			// FileInputStream("C:\\Users\\test\\IdeaProjects\\CoreJava\\src\\com\\dbcore\\InputOutput\\input.txt");
			// out = new
			// FileOutputStream("C:\\Users\\test\\IdeaProjects\\CoreJava\\src\\com\\dbcore\\InputOutput\\output.txt");//in
			// = new
			// FileInputStream("C:\\Users\\test\\IdeaProjects\\CoreJava\\src\\com\\dbcore\\InputOutput\\input.txt");
			in = new FileReader(
					"C:\\workspace\\oops\\src\\oops\\S2_27_3\\InputOutput\\CopyFile.java");
			out = new FileWriter(
					"C:\\workspace\\Coredb\\src\\com\\dbcore\\InputOutput\\foo.txt");// in
																						// =
																						// new
																						// FileInputStream("C:\\Users\\test\\IdeaProjects\\CoreJava\\src\\com\\dbcore\\InputOutput\\input.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
