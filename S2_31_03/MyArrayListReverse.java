package oops.S2_31_03;

import java.util.ArrayList;
import java.util.Collections;
 
public class MyArrayListReverse {
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Goa");
        list.add("Go");
        list.add("to");
        list.add("Want");
        list.add("I");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        for(String str: list){
            System.out.println(str);
        }
    }
}
