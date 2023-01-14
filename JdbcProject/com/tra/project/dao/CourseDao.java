package com.tra.project.dao;

import com.tra.project.exception.CourseNotFoundException;
import com.tra.project.model.Course;

public interface CourseDao {
	  void addCourse(Course course) throws Exception;
	  void listAllCourses() throws Exception;
	//   void deleteCourse(Course course)throws Exception;
	   void deleteCourse(Integer id)throws Exception;
	//   void updateCourse(Course course) throws Exception;
	   void updateCourse(Integer id,String name) throws Exception;
}
