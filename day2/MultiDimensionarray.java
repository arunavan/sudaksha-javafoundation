package com.tra.day2;

public class MultiDimensionarray {

	public static void main(String[] args) {
     Integer a[][]= {{2,3},{5},{4,5,3,2},{2,3,1}};	
     System.out.println(a[1][0]);
     System.out.println("for loop");
     for(int i=0;i<a.length;i++)  //row
     {  for(int j=0;j<a[i].length;j++) //col
     	{//if(i==2 && j==3)
    	 System.out.print(a[i][j]+" ");
       	}
         System.out.println();
     }
     System.out.println("for each loop");
     for(Integer row[]:a)  //row
     {  for(Integer x:row) //col
     	{ System.out.print(x+" ");
    	 
     	}
         System.out.println();
     }
     
     Integer source[]= {2,3,4,1,5,6,7,8,45,65};
     Integer destination[]=new Integer[5];
     System.arraycopy(source, 5, destination, 2, 3);
     System.out.println("source");
     for(Integer x:source) //col
	{ System.out.print(x+" ");
 
	}
     System.out.println();
     System.out.println("destination");
     for(Integer x:destination) //col
 	{ System.out.print(x+" ");
  
 	}
	}

}
