package com.tra.project.service;

import com.tra.project.model.Course;
public interface CourseService {
	void addCourse(Course c) throws Exception;
    void listAllCourses()  throws Exception;
   // void deleteCourse(Course course) throws Exception;
    void deleteCourse(Integer id) throws Exception;
   // void updateCourse(Course course) throws Exception;
    void updateCourse(Integer id,String name) throws Exception;
}
