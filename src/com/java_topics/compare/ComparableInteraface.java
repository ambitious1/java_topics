package com.java_topics.compare;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInteraface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // List of objects of AuthorModel class
	      ArrayList<Author> al=new ArrayList<Author>(); 
	      al.add(new Author("Henry","Miller", "Tropic of Cancer"));  
	      al.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
	      al.add(new Author("Frank","Miller", "300"));
	      al.add(new Author("Deborah","Hopkinson", "Sky Boys"));
	      al.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));
	      
	      /*
	       * Sorting the list using Collections.sort() method, we
	       * can use this method because we have implemented the 
	       * Comparable interface in our user defined class AuthorModel
	       */
	      Collections.sort(al);  
	      for(Author str:al){  
	    	  System.out.println(str.firstName+" "+
	          str.lastName+" "+"Book: "+str.bookName);  
	      } 
	}

}


class Author implements Comparable<Author> {

	  String firstName;
	  String lastName;
	  String bookName;
	  Author(String first, String last, String book){
		this.firstName = first;
		this.lastName = last;
		this.bookName = book;
	  }
		
	  @Override
	  /*
	   * This is where we write the logic to sort. This method sort 
	   * automatically by the first name in case that the last name is 
	   * the same.
	   */
	  public int compareTo(Author au){
	     /* 
	      * Sorting by last name. compareTo should return < 0 if this(keyword) 
	      * is supposed to be less than au, > 0 if this is supposed to be 
	      * greater than object au and 0 if they are supposed to be equal.
	      */
	     int last = this.lastName.compareTo(au.lastName);
	     //Sorting by first name if last name is same d
	     return last == 0 ? this.firstName.compareTo(au.firstName) : last;
	  }
	}