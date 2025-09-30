package com.jdc.school_mgmt_sys;

public abstract class Person implements Managable{
	protected String id; // Encapsulation
	protected String name;
	protected String contact;
	
	public Person(String id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	@Override
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
