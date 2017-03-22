package oops.S1_22_3;

class ConstructorWithParams {
	int id;
	String name;

	ConstructorWithParams(int i, String n) {
		id = i;
		name = n;
	}

	ConstructorWithParams(){
		
		
	}
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ConstructorWithParams s1 = new ConstructorWithParams(111, "Karan1");
		ConstructorWithParams s2 = new ConstructorWithParams(222, "Aryan");
		ConstructorWithParams s3= new ConstructorWithParams();
		s1.display();
		s2.display();
	}
}