package oops.S1_23_3;

/**
 * Project: CoreJava FileName:Akhil Author: test Note: To change this template
 * use File | Settings | File Templates.
 */
public class TestArray {

	public static void main(String[] args) {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		String num = "";

		// Print all the array elements
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
		// Summing all elements
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		// Finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max is " + max);

		for (double x : myList) {
			num += (num.equals("")) ? x : ", " + x + "";
		}
		System.out.println("num is " + num);

		// Print all the array elements
		for (double element : myList) {
			System.out.println(element);
		}

		printArray(new int[] { 3, 1, 2, 6, 4, 2 });
		reverse(new int[] { 3, 1, 2, 6, 4, 2 });

	}

	/* Passing Arrays to Methods */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];

		}
		return result;

	}
}
