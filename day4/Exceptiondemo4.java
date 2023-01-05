package com.tra.day4;
import java.util.Scanner;
                             //custom exception should extends Exception
class DepositException extends Exception
{	DepositException(String msg){
		super(msg);
	}
}
public class Exceptiondemo4 {
										//to catch or handle exception
	public static void main(String[] args) throws DepositException
	{
		System.out.println("enter amount to be deposited");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		if(amount<1000)   // to raise custom exception
			throw new DepositException("Minimum deposit is 1000/-");
		else
			System.out.println("Thanks for using bank services...");
		String s="java";
		System.out.println(s.substring(0,2));
	}
}
