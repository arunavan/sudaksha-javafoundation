package com.tra.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseServiceImpl implements CourseService{
	
	List<Course> courseList=new ArrayList<>();
	
	public void addCourse(Course course ) {
		courseList.add(course);
		
	}
   public void deleteCourse(Course course) {
	   Iterator i=courseList.iterator();
		while(i.hasNext()) {
			Course c=(Course)i.next();
			if(c.id==course.id || c.name.equals(course.name))
			  i.remove();
		}
   }
	
	public void  listAllCourses(){
		/*
		 * for(Course course: courseList) System.out.println(course);
		 */
		
		 Iterator i=courseList.iterator();
			while(i.hasNext()) {
				
				System.out.println((Course)i.next());		
			}
	}		
			
		public  void updateCourse(Course course) 
		{ Iterator i=courseList.iterator();
		  while(i.hasNext()) {
			Course c=(Course)i.next();
			if(c.id==course.id)
				c.name=course.name;
				
				
		}
				 
		}
	
}
