package com.tra.project.client;
import java.util.Scanner;
import com.tra.project.model.Course;
import com.tra.project.service.CourseService;
import com.tra.project.service.CourseServiceImpl;
public class Courseclient {
	public static void main(String[] args)  throws Exception{
	CourseService courseService=new CourseServiceImpl();
	System.out.println(" 1.Add Course");
	System.out.println(" 2.Listall Course");
	System.out.println(" 3.Update Course");
	System.out.println(" 4.Delete Course");
	System.out.println(" 5 .exit");
	Scanner sc=new Scanner(System.in);
	int op=sc.nextInt();
	while(op<=4) {
		switch (op) {
		case 1: {System.out.println("entre course details");
				Integer id=sc.nextInt();
				String name=sc.next();
				Course course=new Course(id,name);
				courseService.addCourse(course);
				System.out.println(" added successfully...");
				break;
				}
		case 2: { System.out.println("list of courses...");
		           courseService.listAllCourses();
		           break;
				}
		case 3: {System.out.println("entre id and new coursename to be updated");
				Integer id=sc.nextInt();
				String name=sc.next();
				//Course course=new Course(id,name);
				courseService.updateCourse(id,name);
				System.out.println(" updated successfully...");
				break;
				}
		case 4: {System.out.println("entre course to be deleted");
				Integer id=sc.nextInt();
				//String name=sc.next();
				//Course course=new Course(id,name);
				courseService.deleteCourse(id);
				System.out.println(" deleted successfully...");
				break;
				}
				default : System.out.println("wrong operation");
		}
		System.out.println(" do you want to continue(1..4");
		op=sc.nextInt();
	}

}
	
}
