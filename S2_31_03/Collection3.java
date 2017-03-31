package oops.S2_31_03;

import java.util.*;

class Collection3 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		// creating another array list
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		al.addAll(al2);// adding second list in first list
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("brahmi");
		al3.add("Ali");
		al.removeAll(al3);// removing all elements of al3
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
