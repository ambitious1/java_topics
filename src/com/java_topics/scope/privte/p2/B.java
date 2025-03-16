package com.java_topics.scope.privte.p2;

import java.util.Scanner;

import com.java_topics.scope.privte.A;

public class B {

	public static void main(String[] args) {
		    A obj = new A();
		    System.out.print("Enter a gender for the message: ");
	        try (// Trying to access private method
				        // of another class
	        	
        		Scanner input = new Scanner(System.in)) {
					obj.setDisplayMsg("Wah gwan", input.next().charAt(0));
				}
		    	System.out.println(obj.getDisplayMsg()
		    );

	}

}
