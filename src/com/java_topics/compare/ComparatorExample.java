package com.java_topics.compare;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // List of objects of AuthorModel class      
	     ArrayList<AuthorModel> al=new ArrayList<AuthorModel>();        
	     al.add(new AuthorModel("Henry", "Tropic of Cancer",  45));
	     al.add(new AuthorModel("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new AuthorModel("Frank", "300", 65));
	     al.add(new AuthorModel("Deborah", "Sky Boys", 51));
	     al.add(new AuthorModel("George R. R.", "A Song of Ice and Fire", 62));
	     /*       
	      * Sorting the list using Collections.sort() method, we       
	      * can use this method because we have implemented the        
	      * Comparable interface in our user defined class AuthorModel       
	      */      
	     System.out.println("Sorting by AuthorModel First Name:");      
	     Collections.sort(al);        
	     for(AuthorModel au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	           au.getAuAge());        
	     } 
	     /*Sorting using AuthorAgeComparator*/      
	     System.out.println("Sorting by AuthorModel Age:");
	     Collections.sort(al, new AuthorAgeComparator());
	     for(AuthorModel au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	          au.getAuAge());        
	     }             
	     /*Sorting using BookNameComparator*/      
	     System.out.println("Sorting by Book Name:");      
	     Collections.sort(al, new BookNameComparator());      
	     for(AuthorModel au: al){       
	        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
	           au.getAuAge());       
	     }    
	}

}
