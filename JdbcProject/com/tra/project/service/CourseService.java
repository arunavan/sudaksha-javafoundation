package com.tra.project.service;
import java.util.List;
import com.tra.project.model.Course;
public interface CourseService {
	void addCourse(Course c) throws Exception;
    void listAllCourses()  throws Exception;
    void deleteCourse(Course course) throws Exception;
    void updateCourse(Course course) throws Exception;
}
