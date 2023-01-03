package com.tra.day2;

public class MLoadDemo2 {
	
	double getEmi(double amount) { //personal loan
		return amount/12;
	}
	int getEmi(double amount,int duration) { //education loan
		return (int)(amount/10)+duration;
	}

	public static void main(String[] args) {
		MLoadDemo2 m=new MLoadDemo2();
		System.out.println(m.getEmi(40000.00));
		System.out.println(m.getEmi(80000.00, 10));
		//gc jvm
		System.gc();
		
	}

}
