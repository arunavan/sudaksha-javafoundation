package com.tra.day4;

import java.io.FileWriter;
import java.io.IOException;

public class Exceptiondemo3 {
	
	void show() throws InterruptedException,IOException
	{
		Thread.sleep(400); //checked
		FileWriter f=new FileWriter("d:\\abc.tx");
		
	}

	public static void main(String[] args) throws InterruptedException,IOException
	{
		Exceptiondemo3 e=new Exceptiondemo3();
		e.show();
		System.out.println("Thank you");

	}

}
