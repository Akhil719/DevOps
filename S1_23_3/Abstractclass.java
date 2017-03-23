package oops.S1_23_3;
abstract class Bike{  
	  abstract void run();  
	}  
	class Abstractclass extends Bike{  
	void run(){System.out.println("running safely..");}  
	public static void main(String args[]){  
	 Bike obj = new Abstractclass();  
	 obj.run();  
	}  
	}  