package com.java_topics.compare;

public class AuthorModel implements Comparable<AuthorModel>{
	  String firstName; 
	  String bookName; 
	  int auAge; 
	  
	  AuthorModel(String first, String book, int age){ 
	    this.firstName = first; 
	    this.bookName = book; 
	    this.auAge = age; 
	  } 
	  public String getFirstName() { 
	    return firstName; 
	  }
	  public void setFirstName(String firstName) { 
	    this.firstName = firstName; 
	  }
	  public String getBookName() { 
	    return bookName; 
	  }
	  public void setBookName(String bookName) { 
	    this.bookName = bookName; 
	  }
	  public int getAuAge() { 
	    return auAge; 
	  }
	  public void setAuAge(int auAge) { 
	    this.auAge = auAge; 
	  } 
	  @Override 
	  /* 
	   * When we only use Comparable, this is where we write sorting
	   * logic. This method is called when we implement the Comparable
	   * interface in our class and call Collections.sort()
	   */ 
	  public int compareTo(AuthorModel au){         
	    return this.firstName.compareTo(au.firstName);   
	  }
}
