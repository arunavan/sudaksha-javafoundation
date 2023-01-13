package com.tra.project.model;

public class Course {
	Integer id;
	String name;
	// to ensure uniqueness of objects need override equals and hashCode

	@Override
	public int hashCode() {
		return 1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Course c = (Course) obj;
		boolean flag = false;
		if ((this.id == c.id) && (this.name.equals(c.name)))
			flag = true;
		return flag;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	public Course(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}