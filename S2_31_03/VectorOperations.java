package oops.S2_31_03;

import java.util.Vector;

public class VectorOperations {
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("Akhil");
        vct.add("Nikhil");
        vct.add("Pandu");
        System.out.println(vct);
        //adding element at specified index
        vct.add(2,"Aish");
        System.out.println(vct);
        //getting elements by index
        System.out.println("Element at index 3 is: "+vct.get(3));
        //getting first element
        System.out.println("The first element of this vector is: "+vct.firstElement());
        //getting last element
        System.out.println("The last element of this vector is: "+vct.lastElement());
        //how to check vector is empty or not
        System.out.println("Is this vector empty? "+vct.isEmpty());
    }
}
