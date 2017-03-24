package oops.S1_24_3;

public class WrapperClassExample {
	public static void main(String args[]) {
		// Converting int into Integer
		int a = 22;
		Integer i = Integer.valueOf(a);// converting int into Integer
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a)
						// internally

		System.out.println(a + " " + i + " " + j);
	}
}
