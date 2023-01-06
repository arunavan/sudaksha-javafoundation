package com.tra.day5;

import java.io.*;

class Account  implements Serializable
{  Integer id;
   String bankName;
	  Account() {
	    this.id = 10;
       this.bankName = "AXIS";
	  }
}

class SerializeDemo
{
	public static void main(String args[])throws Exception
	{
		Account a1 = new Account();
		System.out.println("before serilization "+a1.id+"  "+a1.bankName);
		FileOutputStream fos = new FileOutputStream("d:\\account.txt");  //serialization

		ObjectOutputStream oos = new ObjectOutputStream(fos);  //copy state of object into file

		oos.writeObject(a1); //3

		FileInputStream fis = new FileInputStream("d:\\account.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Account a2 = (Account)ois.readObject();  //deserialization

		System.out.println("after deserialization:"+a1.id+"--------"+a2.bankName);
	
	}
}