package oops.S1_24_3;
// Anonymous class extends Top level class & implements The abstract class or interface
abstract class AnonymousInner {
	public abstract void mymethod();
}

public class OuterClass {

	public static void main(String args[]) {
		AnonymousInner inner = new AnonymousInner() {
			public void mymethod() {
				
				System.out.println("This is an example of anonymous inner class");
			}
		};
		inner.mymethod();
	}
}