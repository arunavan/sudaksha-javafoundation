package com.tra.day2;

import java.util.Scanner;

public class ControlStructureDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%400==0 && year %4==0 && year %100==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
		//while -pre conditional 
			int x=10;
		while(x>=1) {
			System.out.println("Number:"+x);
			x--;
		}
		int y=50;
		do {   //do - while post conditional statement
			System.out.println("y="+y);
			y++;
			
		} while(y<=60);
	}

}
