package com.tra.day5;

import java.io.File;

class DirList 
{
	public static void main(String args[]) 
	{
		String dirname = "D:\\VAR"; 
		
		File f1 = new File(dirname);

		if (f1.isDirectory())
		{
			System.out.println("Directory of " + dirname); 
		
			String s[] = f1.list(); 
			
			for (int i=0; i < s.length; i++) 
			{ 
				File f = new File(dirname + "/" + s[i]); 
				if (f.isDirectory())
				{
					System.out.println(s[i] + " is a directory"); 
					String ss1[]=f.list();
					for(String fname: ss1) {
						System.out.println("file in sub folder:"+fname);
					}
					
				} 
				else
				{
					System.out.println(s[i] + " is a file"+" "+s[i].length());
				}
			} 
		}
		else
		{
			System.out.println(dirname + " is not a directory");
		}
	}
}