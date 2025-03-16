package com.java_topics.reflection.lesson1.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class<?> c = Class.forName("com.java_topics.reflection.model.Person");
		
			//1. Getting constructors of the class
			System.out.println("______________________ 1. Getting contructors of the class ______________________");
			Constructor<?>[] constructors = c.getConstructors();
			System.out.println("Constructors: " + Arrays.toString(constructors));
			//2. Getting all methods (even inherited) of the class 
			System.out.println("______________________ 2. Getting all methods (even inherited) of the class ______________________");
			Method[] methods = c.getMethods();
			System.out.println("Methods: " + Arrays.toString(methods));
			//3. Getting methods of the class
			System.out.println("______________________ 3. Getting methods of the class ______________________");
			Method[] declaredMethods = c.getDeclaredMethods();
			System.out.println("DeclaredMethods: " + Arrays.toString(declaredMethods));
			
			//4. Getting fields of the class
			System.out.println("______________________ 4. Getting fields of the class ______________________");
			Field[] declaredFields = c.getDeclaredFields();
			System.out.println("DeclaredFields: " + Arrays.toString(declaredFields));
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
