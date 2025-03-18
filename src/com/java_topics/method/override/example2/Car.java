package com.java_topics.method.override.example2;

public interface Car {
	String brandName();
	int topSpeed();
	boolean isConvertible();
	
	default String notATruck() {
		return "This is Not a truck";
	}
}
