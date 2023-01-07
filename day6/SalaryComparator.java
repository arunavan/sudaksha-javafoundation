package com.tra.day6;

import java.util.Comparator;

public class SalaryComparator implements Comparator{

		public int compare(Object o1,Object o2) {
		Emp  e1=(Emp)o1;
		Emp  e2=(Emp)o2;
		
		
		  if( e1.sal>e2.sal) 
			  return 1;
		  else if (e1.sal<e2.sal) 
			  return -1;
		  else 
			  return 0;
		}
		 
	}
