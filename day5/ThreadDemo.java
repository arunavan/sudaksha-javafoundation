package com.tra.day5;

class T1 extends Thread{
	  public void run() {
	try{
		for(int i=0;i<5;i++){
	   
			System.out.println("child thread..."+this.currentThread().getName());
			Thread.sleep(5000);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
class T2 extends Thread {
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("My thread"+this.currentThread().getPriority()+"  "+this.currentThread().getName());
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	public class  ThreadDemo { 

	  public static void main(String args[])  //jvm start main
	  {  T1 t1=new T1();  //runnable
		 t1.setName("student");
	     t1.start(); //  running invoking child thread
	     T2 t2=new T2();
	     t2.setName("faculty");
	     t2.start();
	     System.out.println("Threadcount is :"+Thread.activeCount());
		  try{
			  	for(int i=0;i<5;i++){
			  			System.out.println("Demo main java program..."+Thread.currentThread().getName());
			  				Thread.sleep(5000);
			  	}
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }    
	System.out.println(Thread.activeCount());
	//t1.stop();
	try {
		t1.join();  //to get ready for gc
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	 } 
	}

	