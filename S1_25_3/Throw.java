package oops.S1_25_3;

public class Throw {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(12);
		System.out.println("rest of the code...");
	}
}