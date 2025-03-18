package com.java_topics.compare;

import java.util.Comparator; 
public class BookNameComparator implements Comparator<AuthorModel>{ 
	 
	@Override
	public int compare(AuthorModel o1, AuthorModel o2) {
		// TODO Auto-generated method stub
		return o1.bookName.compareTo(o2.bookName); 
	}  
}