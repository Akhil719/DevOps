package oops.S1_24_3;

//This is an example of Immutable class

class ImmutableClass {
	int id;
	String name;

	// Always require parameterized constructor for immutable
	ImmutableClass(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ImmutableClass s1 = new ImmutableClass(111, "Karan");
		ImmutableClass s2 = new ImmutableClass(222, "Aryan");
		s1.display();
		s2.display();

	}
}