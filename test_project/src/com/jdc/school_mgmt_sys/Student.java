package com.jdc.school_mgmt_sys;

public class Student extends Person{
	private String gradelevel;
	public Student(String id, String name, String contact, String gLevel) {
		super(id, name, contact);
		this.gradelevel = gLevel;
	}
	
	@Override
	public String getDetails() {
		return String.format("Student ::: ID = %s, Contact = %s, Grade Level = %s", id, name, contact, gradelevel);
	}

}
