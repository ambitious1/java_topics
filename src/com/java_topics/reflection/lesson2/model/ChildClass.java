package com.java_topics.reflection.lesson2.model;

public class ChildClass extends Parent implements IntTest {
	private int val;
	
	public ChildClass(String name, int val) {
		super(name);
		this.val = val;
	}

	@Override
	public void showVal() {
		// TODO Auto-generated method stub
		System.out.println("Value: " + val);
	}
	
	
}
