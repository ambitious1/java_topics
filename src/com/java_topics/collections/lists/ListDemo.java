package com.java_topics.collections.lists;

public class ListDemo {
	static SinglyList<Integer> lst = new SinglyList<Integer>(null);
	
	public static void add(Integer num) {
		lst.addToList(num);
	}
	
	public static void show() {
		lst.display();
	}
	
	public static void main(String[] args) {
		ListDemo.add(1);
		ListDemo.add(2);
		ListDemo.add(3);
		
		ListDemo.show();
	}
}
