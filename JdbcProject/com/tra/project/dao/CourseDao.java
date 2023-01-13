package com.tra.project.dao;

import com.tra.project.model.Course;

public interface CourseDao {
	  void addCourse(Course course) throws Exception;
	  void listAllCourses() throws Exception;
	   void deleteCourse(Course course)throws Exception;
	   void updateCourse(Course course) throws Exception;

}
