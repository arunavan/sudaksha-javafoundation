package com.tra.day5;
import java.io.File;
import java.util.Date;
class FileDemo{
	public static void main(String[] args) {
		File f=new File("D:\\Demo.java");
		//file processing
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.isFile());
		String dirname = "C:\\Users\\USER\\Downloads"; 
		File f1 = new File(dirname);
		System.out.println(f1.exists() ? "exists" : "does not exist"); 
		System.out.println(f1.canWrite() ? "is writeable" : "is not writeable"); 
		System.out.println(f1.canRead() ? "is readable" : "is not readable"); 
		System.out.println("is " + (f1.isDirectory() ? "" : "not" + " a directory")); 
		System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe"); 
		System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute"); 
		System.out.println("File last modified: " + f1.lastModified()); 
		Date d=new Date(f1.lastModified());
		System.out.println(d);
		System.out.println("File size: " + f1.length() + " Bytes"); 
	} 
}
