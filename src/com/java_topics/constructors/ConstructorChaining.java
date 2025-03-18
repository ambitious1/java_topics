package com.java_topics.constructors;

public class ConstructorChaining {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
	}
}

class MyClass {
	private String name;
	private int age;
	
	MyClass(){
		this("BeginnerBook");
		System.out.println("in no args");
	}
	
	MyClass(String s){
		this(s, 6);
		System.out.println("in single args");
	}
	
	MyClass(String s, int age){
		this.name = s;
		this.age = age;
		System.out.println("in mulitple args");
	}
	
}