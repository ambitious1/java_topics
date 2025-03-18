package com.java_topics.compare;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<AuthorModel>{
	   public int compare(AuthorModel a1,AuthorModel a2){
		     if(a1.auAge==a2.auAge)
		       return 0;
		   else if(a1.auAge>a2.auAge)
		       return 1;
		   else
		       return -1;
		  }
}