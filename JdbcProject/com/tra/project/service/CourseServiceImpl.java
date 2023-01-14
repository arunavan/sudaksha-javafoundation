package com.tra.project.service;
import com.tra.project.dao.CourseDao;
import com.tra.project.dao.CourseDaoImpl;
import com.tra.project.model.Course;

public class CourseServiceImpl implements CourseService{
	CourseDao courseDao=new CourseDaoImpl();
	public void addCourse(Course course ) throws Exception {
		courseDao.addCourse(course);	}

	/*
	 * public void deleteCourse(Course course) throws Exception {
	 * courseDao.deleteCourse(course); }
	 */
	 public void deleteCourse(Integer id) throws Exception  {
		   courseDao.deleteCourse(id);
	   }
	public void  listAllCourses() throws Exception{
		courseDao.listAllCourses();
    }		
	/*
	 * public void updateCourse(Course course) throws Exception {
	 * courseDao.updateCourse(course); }
	 */
	public void updateCourse(Integer id,String name) throws Exception {
		  courseDao.updateCourse(id,name); 
		  }
	
}
