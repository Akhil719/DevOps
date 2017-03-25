package oops.S1_25_3;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 * 
 * This is an example of exception class
 * 
 */
// File Name : ExcepTest.java
import java.io.*;

public class ExcepTest {

	public static void main(String args[]) {
		try {
			int a[] = new int[23];
			int x = 28;
			x = x / 0;
			System.out.println(x);
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		} catch (ArithmeticException e) {
			System.out.println("Exception thrown  :" + e);
		} catch (Exception e) {
			System.out.println("Exception thrown  :" + e);
		}
		/**
		 * Identify exception from Exception class and add them to the program.
		 * Exception should always there in last catch
		 */

		System.out.println("Out of the block");
	}
}
