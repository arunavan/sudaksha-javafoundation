package com.tra.project.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tra.project.exception.CourseNotFoundException;
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
	public  void deleteCourse(Integer id) throws Exception{
		    Connection con=DbConn.getConnection();
		    con.setAutoCommit(false);
		    PreparedStatement pst=con.prepareStatement("select * from course where cid=?");
		    pst.setInt(1, id);
		    ResultSet rs=pst.executeQuery();
		    if(rs.next()==false) {
		    		throw new CourseNotFoundException("Id not present");
		    }
		    else {
			PreparedStatement pst1=con.prepareStatement("delete from course where cid=?");
			pst1.setInt(1, id);
		    pst1.execute();
		    con.commit();
		    }
		    System.out.println("Course deleted successfully......");
		
	}
	public  void updateCourse(Integer id,String name) throws Exception{
		Connection con=DbConn.getConnection();
		con.setAutoCommit(false);
		PreparedStatement pst=con.prepareStatement("select * from course where cid=?");
	    pst.setInt(1, id);
	    ResultSet rs=pst.executeQuery();
	    if(rs.next()==false) {
	    		throw new CourseNotFoundException("Id not present");
	    }
	    else
	    {
		PreparedStatement pst1=con.prepareStatement("update course  set cname=? where cid=?");
	    //pst.setInt(2, course.getId());
		pst1.setInt(2, id);
	    //pst.setString(1,course.getName());
		pst1.setString(1,name);
	    pst1.execute();
	    con.commit();
	    }
	    System.out.println("Course name updated successfully......");
		
	}
}
