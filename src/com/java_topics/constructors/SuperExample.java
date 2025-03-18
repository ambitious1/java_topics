package com.java_topics.constructors;

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyChild();
	}	

}

class MyParent{
	MyParent(){
		System.out.println("My Parent class constructor");
	}
}

class MyChild extends MyParent{
	MyChild(){
		System.out.println("My Child Constructor");
	}
}