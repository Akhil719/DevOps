package oops.S2_31_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class IteratorExmp {
 
    public static void main(String a[]){
         
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
        	
            System.out.println(itr.next());
        }
    
}
}