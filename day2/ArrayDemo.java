package com.tra.day2;

public class ArrayDemo {

	public static void main(String[] args) {
		Integer a[]= {2,3,4,5,6};
		System.out.println(" for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("enhanced for -each loop");
		for(int x:a)
			System.out.println(x);
		
		int b[]=new int[3];
		
		int x=10; //primitive value
		Integer xObj=new Integer(10);  //object boxing
		Integer xObj1=10; //autoboxing  - boxing primitive to object
		int intvalue=xObj1.intValue(); /unboxing
		int invalue1=xObj1; //auto unboxing
		Integer xObj2=x;
		String age="5";
		Integer age1=Integer.parseInt(age);
		System.out.println(age1);
		Integer marks=99;
		String marks1=marks.toString();
	}
	

}
