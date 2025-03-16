package com.java_topics.interfaces;

import static java.lang.System.out; 

public interface App {
	
	record Developer(String name, int age) {}
	
	static void extract(Object data) {
		if(data instanceof Developer(var n, var a)) {
			out.println(n+"-" + a);
		}
	}
	static void main(String[] args) {
		extract(new Developer("duke", 42));
	}
}

