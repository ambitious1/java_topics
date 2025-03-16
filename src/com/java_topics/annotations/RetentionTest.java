package com.java_topics.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
 
@Retention(RetentionPolicy.RUNTIME)
@interface EdurekaAnnotation {
     String MethodName();
     String Description();
}
 
public class RetentionTest{
      @EdurekaAnnotation(MethodName = "Retention Annotation test", Description = "testing annotations")
       public static void TestMethod(){
    	  System.out.println("r: " );
       }
      
      
      public static void main(String[] args) {
    	  RetentionTest.TestMethod();
	}
}

/*
 * 
 * 
 */