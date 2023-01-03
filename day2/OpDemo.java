package com.tra.day2;

public class OpDemo {

	public static void main(String[] args) {
		int x=10;  //assignment
		
		System.out.println(x+=10);  //x=x+10
		System.out.println(x-=10); 
		System.out.println(x*=10); 
		System.out.println(x/=10); 
		int y=10;
		
		System.out.println(x==y);
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x!=y);
		
		int x1=20;
		int x2=25;
		
		if( x1==20 || x2==29)
			System.out.println("true");
		else
			System.out.println("false");
		
		if( x1==20 && x2==25)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println(x1&x2);
		
		
	}

}
