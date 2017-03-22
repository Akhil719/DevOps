package oops.S1_22_3;

/**
 * Project: CoreJava
 * Author: test
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Animal{

    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{

    public void move(){
        super.move(); //same method name should be there
        //invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}

public class overriding{

    public static void main(String args[]){
        //Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object

        //a.move();// runs the method in Animal class

        b.move();//Runs the method in Dog class
    }
}
