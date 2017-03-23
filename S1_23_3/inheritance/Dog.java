package oops.S1_23_3.inheritance;
//sub class of mammal
public class Dog extends Mammal{

    public static void main(String args[]){

        //Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println("m instanceof Animal - "+ (m instanceof Animal));
        System.out.println("d instanceof Mammal - "+ (d instanceof Mammal));
        System.out.println("d instanceof Animal - "+ (d instanceof Animal));
    }
}
