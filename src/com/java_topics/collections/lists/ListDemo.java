package com.java_topics.collections.lists;

public class ListDemo {
	static SinglyList lst = new SinglyList<Integer>(null);
	
	public static void add(Integer num) {
		lst.addToList(num);
	}
	
	public static void show() {
		lst.display();
	}
}
