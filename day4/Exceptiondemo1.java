package com.tra.day4;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		
   int a,b,c=0;
   a=10;
   b=0;
   try {
	     try {
			c=a/b;
		   } 
	     catch (ArithmeticException e) {
			
			e.printStackTrace();
		} 
	   System.out.println(c);
	  
	   Thread.sleep(5000);  // compile time - checked 
	   System.out.println("Thank you");
   }
   catch(Exception e) {
	  // System.out.println(e);
	   e.printStackTrace();
	  // System.out.println(e.getMessage());
   }
    
 }

}
