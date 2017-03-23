package oops.S1_23_3.LoopControl;

/**
 * Project: CoreJava
 * FileName: Break
 * Author: Akhil
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Break {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
