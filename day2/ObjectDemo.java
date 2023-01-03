package com.tra.day2;

//Object   - java.lang 
// getClass(), hashCode(), equals(),finalize()
// wait(), notify().notifyAll()
// clone()  -- for prototyping, creating copy of given object
//toString()

class Course implements Cloneable{
	Integer courseId;
	String name;
	Double fee;
	
	
	public Course(Integer courseId, String name, Double fee) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.fee = fee;
	}
	public Object clone()  throws CloneNotSupportedException{
		return super.clone();
	}
	public void finalize() { //gc
		courseId=0;
		name=null;
		fee=0.0;
		
	}

	/*
	 * void show() { System.out.println(courseId+" "+ name+"  "+fee); }
	 */
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", fee=" + fee + "]";
	}
	
	
}
public class ObjectDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		Course c=new Course(10,"java",9999.99);
		Course c1=new Course(11,"oracle",29999.99);
		Course c2=c;
		Course c3=(Course)c.clone();
		
		System.out.println(c.getClass()); //to display classname
		System.out.println(c2.equals(c)); //to compare two objects
		System.out.println(c);//to display address of objcet in int format
		System.out.println(c.hashCode());
		//c.finalize();
		//c1.show();
		System.out.println(c1);

	}

}
