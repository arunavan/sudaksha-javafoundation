package com.tra.day5;
//boolean accept(File directory, String filename) 
import java.io.*; 
class OnlyExt implements FilenameFilter
{	String ext; 
	OnlyExt(String ext)
	{		this.ext = "." + ext; 
	} 
	public boolean accept(File dir, String name)
	{		return name.endsWith(ext); 
	} 
} 
class DirListOnly
{	public static void main(String args[])
	{	String dirname = "E:\\Sudaksha"; 
		File f1 = new File(dirname); 
		
		FilenameFilter only = new OnlyExt("java");
		
		String s[] = f1.list(only); 
		for (int i=0; i < s.length; i++)
		{	System.out.println(s[i]); 
		} 
	}
}