package com.tra.day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IODemo3 {

	public static void main(String[] args) throws IOException{
		FileReader f1=new FileReader("d:\\batch.txt"); //existing
		BufferedReader b1=new BufferedReader(f1);  //buffer effect to speed up read
		FileWriter f2=new FileWriter("d:\\batchoutput123.txt");//new file is createfd
		BufferedWriter b2=new BufferedWriter(f2);
		String line=null;
		while((line=b1.readLine())!=null) {
			System.out.println(line);
			b2.write(line);
		}
		f1.close();
		b1.close();
		b2.close();
		f2.close();

	}

}
