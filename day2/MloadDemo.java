package com.tra.day2;
public class MloadDemo { //method overloading - static polymorphism
	// method overloading name of function is only same
	// arguments, datatypes, number of args , order of args should differ
	 void sum(int a,int b) {  //sum
		 int c=a+b;
		 System.out.println("sum="+c);
	 }
	 void sum(int x,String s) {
		 System.out.println(s+"  "+(x+x)/2);
	 }
	 void sum(String s,int x) {
		 System.out.println(s+"  "+(x+x)/2);
	 }
	 void sum(float a,float b,float c) { //sum
		 System.out.println(a+b+c);
	 }
	 void sum(int a[]) { //sum
		 int s=0;
		 for(int x: a)
		 {			 s+=x;
		 }
		 System.out.println("Sum of array:"+s);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {4,3,6,7,2,3};
		MloadDemo m=new MloadDemo();
		m.sum(3,4);
		m.sum(3.4f, 5.6f, 8.7f);
		m.sum(x);
		
	}

}
