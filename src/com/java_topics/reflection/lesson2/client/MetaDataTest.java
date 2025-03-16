package com.java_topics.reflection.lesson2.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MetaDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//1. Get the CLass Name
		System.out.println("______________________ 1. To get the class name ______________________");
		Class<?> c1;
		
		try {
			c1 = Class.forName("com.java_topics.reflection.model.ChildClass");
			System.out.println("Class name: " + c1.getName()); //the full package name and className
			System.out.println("Class name: " + c1.getSimpleName()); //only the className
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2. Getting super class using reflection 
		System.out.println("______________________ 2. Getting super class using reflection ______________________");
		Class<?> c2;
		
		try {
			c2 = Class.forName("com.java_topics.reflection.model.ChildClass");
			System.out.println("Super class: " + c2.getSuperclass());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//3. Getting implemented or extended interfaces using reflection  
		System.out.println("______________________ 3. Getting implemented or extended interfaces using reflection ______________________");
		Class<?> c3;
		
		try {
			c3 = Class.forName("com.java_topics.reflection.model.ChildClass");
			System.out.println("interfaces: " + Arrays.toString(c3.getInterfaces())); //gets all the interfaces implemented by the ChildClass and outputs to an array in case it's more than 1
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		//4. Getting class modifier using reflection  
		System.out.println("______________________ 4. Getting class modifier using reflection ______________________");
		Class<?> c4;
		
		try {
			c4 = Class.forName("com.java_topics.reflection.model.ChildClass");
			System.out.println("Modifier: " + c4.getModifiers()); //get the access modifier of the ChildClass
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//5. Getting fields of the class using reflection  
		System.out.println("______________________ 5. Getting fields of the class using reflection ______________________");
		Class<?> c5;
		
		try {
			c5 = Class.forName("com.java_topics.reflection.model.ChildClass");
			//Getting fields of the class
			Field[] allFields = c5.getFields();
			System.out.println("All Fields: " + Arrays.toString(allFields)); //this only returns public fields within the childClass or Parent
			
			//Getting fields of the class
			Field[] fields = c5.getDeclaredFields();
			System.out.println("Fields: " + Arrays.toString(fields)); //this returns all modifiers (private, public ,protected, default) fields within the ChildClass
						
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//6. Getting constructors of the class using reflection  
		System.out.println("______________________ 5. Getting constructors of the class using reflection ______________________");
		Class<?> c6;
		
		try {
			c6 = Class.forName("com.java_topics.reflection.model.ChildClass");
			//Getting fields of the class
			Constructor<?>[] constructors = c6.getConstructors();
			System.out.println("Cosntructors: " + Arrays.toString(constructors)); //this returns only public constructors of the given class
			
			Constructor<?>[] decconstructors = c6.getDeclaredConstructors();
			System.out.println("Declared Cosntructors: " + Arrays.toString(decconstructors)); //this returns all constructors eg. (public, private,default, protected)
						
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		
	}

}
