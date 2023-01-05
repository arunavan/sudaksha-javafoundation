package com.tra.day4;

public class Exceptiondemo2 {

	public static void main(String[] args) {
		//Thread.sleep(500);
		//Date d=new Date();
		String s=null;
		try {
			System.out.println(s.length());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int a[]= {3,4,5};
		int x=10;
		try { //db, file
			try{
				System.out.println(x/0);
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
			System.out.println(a[5]);
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(" custom exception is raised...");
		}
		finally { // either case - exception is raised, not raised 
			//db.close(), file.close()
			System.out.println("Thank you");
		}
	}

}
