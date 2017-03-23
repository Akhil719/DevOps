package oops.S1_23_3.LoopControl;

/**
 * Project: CoreJava
 * FileName: DoWhile
 * Author: Akhil
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class DoWhile {
    public static void main(String args[]){
        int x = 10;

        do{
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );
    }
}
