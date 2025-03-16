package com.java_topics.reflection.lesson1.model;

public class Person extends ParentPerson{
	private String fname;
	private String lname;
	private Integer age;
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Person(String fname, Integer age) {
		this.fname = fname;
		this.age = age;
		this.lname = super.getTheLnameOfParent();
	}
}
