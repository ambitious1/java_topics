package com.java_topics.regex;

import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		// Checks if the string matches with the regex
	    // Should be single character a to z
	    System.out.println(Pattern.matches("[a-z]", "g"));
	
	    // Check if the element is range a to z or A to Z
	    System.out.println(
	        Pattern.matches("[a-zA-Z]", "Gfg"));
	}
}
