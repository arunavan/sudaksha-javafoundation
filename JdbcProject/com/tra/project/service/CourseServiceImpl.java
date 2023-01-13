package com.tra.project.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tra.project.dao.CourseDao;
import com.tra.project.dao.CourseDaoImpl;
import com.tra.project.model.Course;

public class CourseServiceImpl implements CourseService{
	CourseDao courseDao=new CourseDaoImpl();
	//public List<Course> courseList=new ArrayList<>();
	
	public void addCourse(Course course ) throws Exception {
		courseDao.addCourse(course);
		
		
	}
   public void deleteCourse(Course course) throws Exception  {
	   courseDao.deleteCourse(course);
   }
	
	public void  listAllCourses() throws Exception{
		courseDao.listAllCourses();
		
	}		
			
		public  void updateCourse(Course course) throws Exception
		{ 
			courseDao.updateCourse(course);
				
		}
				 
		
	
}
