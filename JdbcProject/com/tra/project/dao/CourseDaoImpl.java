package com.tra.project.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.tra.project.model.Course;
import com.tra.project.util.DbConn;
public class CourseDaoImpl implements CourseDao{
	public void addCourse(Course course) throws Exception{
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into course values(?,?)");
		pst.setInt(1, course.getId());
		pst.setString(2,course.getName());
		pst.execute();
		System.out.println("Course added successfully...");
	}
	public void listAllCourses() throws Exception{
		    Connection con=DbConn.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from course");
			ResultSet rs=pst.executeQuery();
			System.out.println("Course details........");
			while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2));	
			}
    }
	public  void deleteCourse(Course course) throws Exception{
		    Connection con=DbConn.getConnection();
			PreparedStatement pst=con.prepareStatement("delete from course where cid=?");
		    pst.setInt(1, course.getId());
		    pst.execute();
		    System.out.println("Course deleted successfully......");
		
	}
	public  void updateCourse(Course course) throws Exception{
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("update course  set cname=? where cid=?");
	    pst.setInt(2, course.getId());
	    pst.setString(1,course.getName());
	    pst.execute();
	    System.out.println("Course name updated successfully......");
		
	}
}
