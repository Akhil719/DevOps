package oops.S1_25_3;

import java.io.IOException;  
class Throws{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Throws obj=new Throws();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  
