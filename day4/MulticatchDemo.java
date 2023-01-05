package com.tra.day4;

public class MulticatchDemo {

	public static void main(String[] args) {
		int a[]= {2,3,4};
		try {
		
		System.out.println(a[2]);
		int c=10/0;
		}  //java 1.7  - multi catch block | 
		catch(ArithmeticException | ArrayIndexOutOfBoundsException  e1) {
			e1.printStackTrace();
		}
	}

}


/*
try {
int c=10/0;
System.out.println(a[4]);
}
catch(Exception e1) {
	e1.printStackTrace();
}
catch(ArrayIndexOutOfBoundsException e1) {
	e1.printStackTrace();
}

*/