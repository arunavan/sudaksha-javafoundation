package com.tra.day2;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c) {
		
		case 'r':{ System.out.println("Red"); break;}
		
		case 'g':{ System.out.println("Green"); break;}
		
		case 'y':{ System.out.println("Yellow"); break;}
		
		case 'b':{ System.out.println("Blue"); break;}
		
		default : System.out.println("no color defined");
		
		}
	

	}

}
