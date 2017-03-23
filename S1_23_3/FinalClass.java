package oops.S1_23_3;

//cannot inherit from final class
final class Bike {
}

class FinalClass extends Bike {
	void run() {
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]) {
		FinalClass honda = new FinalClass();
		FinalClass.run();
	}
}
