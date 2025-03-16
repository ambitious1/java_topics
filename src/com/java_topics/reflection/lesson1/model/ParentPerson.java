package com.java_topics.reflection.lesson1.model;

public class ParentPerson {
	String fname;
	String lname;
	String natiionality;
	Integer age;
	public String getTheFnameOfParent() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getTheLnameOfParent() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getNatiionality() {
		return natiionality;
	}
	public void setNatiionality(String natiionality) {
		this.natiionality = natiionality;
	}
	public Integer getTheNationalityOfParent() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public ParentPerson(String fname, String lname, String natiionality, Integer age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.natiionality = natiionality;
		this.age = age;
	}
	public ParentPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
