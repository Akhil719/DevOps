/**
 * 
 */
package oops.S1_23_3;

/**
 * @author akhildeepr
 * 
 *         this program is to demonstrate static example into variables &
 *         methods
 *
 */
public class StaticExample {

	static int x = 5;

	public static void myStaticMethod() {
		System.out.println("inside my static method");
		System.out.println("value of static variable x is  " + x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling mystaticmethod");
		myStaticMethod();
		System.out.println("completed static method call");

	}

}
