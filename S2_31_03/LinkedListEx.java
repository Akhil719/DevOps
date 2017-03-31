package oops.S2_31_03;

import java.util.*;

class LinkedListEx {
	public static void main(String args[]) {

		List<String> Obj = new LinkedList<String>();// creating linkedlist
		Obj.add("Telugu");// adding object in linkedlist
		Obj.add("English");
		Obj.add("Hindi");
		Obj.add("Telugu");

		List<String> Obj1 = new LinkedList<String>();
		Obj1.add("Social");
		Obj.addAll(Obj1);

		System.out.println("linkedlist: " + Obj); // LinkedList is faster than
													// ArrayList because it uses
													// doubly linked list so no
													// bit shifting is required
													// in memory.
	}
}