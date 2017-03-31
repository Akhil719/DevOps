package oops.S2_31_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
 
public class VectorCollections {
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        List<String> list = new ArrayList<String>();
        list.add("Divya");
        list.add("suppa");
   //     vct.clear(); To clear all the Elements.
        System.out.println("After Copy: "+vct);
    }
}
