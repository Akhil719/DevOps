package oops.S1_23_3.LoopControl;

/**
 * Project: CoreJava
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Enhancedforloop {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        String number = "";             
        
        for (int x : numbers) {
            number += (number.equals("")) ? x : ", " + x + "";
        }
        System.out.println(number);

        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        String name = "";             
        for (String x : names) {
            name += (name.equals("")) ? x : ", " + x + "";
        }
        System.out.println(name);
    }
}
