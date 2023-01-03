package com.tra.day2;

import java.util.Date;

public class Demo1 {
	public static void main(String[] args) {
		int a=10;  //primitive
		
		double b=a; // int to double   - up casting , implicit, widening
		
		double x=8765442.390;
		long l=(long)x;
		float f=(float)x;
		int y=(int)x;  //down casting,explicit,narrowing
		
		String s=new String("java"); //reference object

		Date d=new Date(); //reference
		System.out.println(d);
		
		

	}

}
