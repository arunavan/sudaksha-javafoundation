package com.tra.day6;

import java.util.Scanner;

public class CourseTest {

	public static void main(String[] args) {
		
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
				
			case 3: {System.out.println("entre course to be updated");
			Integer id=sc.nextInt();
			String name=sc.next();
			Course course=new Course(id,name);
			courseService.updateCourse(course);
			System.out.println(" updated successfully...");
			
				
				break;}
			case 4: {System.out.println("entre course to be deleted");
			Integer id=sc.nextInt();
			String name=sc.next();
			Course course=new Course(id,name);
			courseService.deleteCourse(course);
			System.out.println(" deleted successfully...");
			
				break;}
				
				default : System.out.println("wrong operation");
			}
			System.out.println(" do you want to continue(1..4");
			op=sc.nextInt();
		}

	}

}
