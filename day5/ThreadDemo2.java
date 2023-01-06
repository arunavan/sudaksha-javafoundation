package com.tra.day5;
class A{
	
}
class Thread1 extends A implements Runnable{
	
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("Thread with Runnable");
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		//aditional step
		Thread t=new Thread(t1);
		t.start();

	}
}
