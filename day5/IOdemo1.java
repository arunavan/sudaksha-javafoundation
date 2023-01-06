package com.tra.day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOdemo1 {

	public static void main(String[] args) // throws IOException
	{
		FileInputStream f=null;
		FileOutputStream f1=null;
		try {
			f=new FileInputStream("d:\\batch.txt"); //existing
			f1=new FileOutputStream("d:\\batchoutput123.txt");//new file is created
			int k;
			while((k=f.read())!=-1) {
				System.out.print((char)k);
				f1.write((char)k);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
		try {
			f.close();
			f1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

	}

}
