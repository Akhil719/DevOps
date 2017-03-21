package oops;

class Employee extends Person {
    
    private String empCode;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }
    
    
}

abstract  class Person {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}

public class Main{
	public static void main(String args[]){
        //INSTIATING AN ABSTRACT CLASS GIVES COMPILE TIME ERROR
        //Person p =  new Person() ;
        
        
        //THIS REFERENCE VARIABLE CAN ACESS ONLY THOSE METHOD WHICH ARE OVERRIDDEN
        Person person = new Employee();
        person.setName("Jatin Kansagara");        
        System.out.println(person.getName());
    }
}

