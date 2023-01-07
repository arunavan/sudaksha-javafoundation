package com.tra.day6;

import java.util.List;

public interface CourseService {
	void addCourse(Course c);
   void listAllCourses();
   void deleteCourse(Course course);
   void updateCourse(Course course);
}
