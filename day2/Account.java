package com.tra.day2;
public class Account {
	static  int accountNumber=101203;    //class or static associated with class
	 String accountHolderName; //instance  associated with object
	 String email;             //instance
	static  double balance=100000.00;  //static or class
	public Account(String accountHolderName, String email) {
		this.accountHolderName = accountHolderName;
		this.email = email;
	}
	void deposit(double amount) {
		balance+=amount;	}
	void withdraw(double amount) { //instance method
		balance-=amount;	}
	double getBalance() {  //instance method
		return balance;	}
 	void displayAccountDetails() {  //instance method
		String city="Hyderabad";   //local
		System.out.println("Name:"+accountHolderName);
		System.out.println("Email:"+email);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balancer:"+balance);
	}
 	static void show() {  //instanc emethod
 		Account aa1=new Account("kiran","kiran@gmail.com");
 		System.out.println(balance);
 		System.out.println(aa1.accountHolderName);
 	}
	public static void main(String[] args) {
		String country="India";   //local
		Account a1=new Account("Ram","ram@gmail.com");
		Account a2=new Account("Raj","raj@gmail.com");
		a1.deposit(5000.00);
		System.out.println(a1.getBalance());
		a2.withdraw(3000.00);
		System.out.println(a2.getBalance());
		a1.displayAccountDetails();
		a2.displayAccountDetails();
		show();  //static method can be called directly
		System.out.println(balance);// static variable can be accessed directly
		System.out.println(a1.accountHolderName);
	}
	

}
