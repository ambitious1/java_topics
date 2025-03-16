package com.java_topics.collections.lists;

import java.util.stream.Stream;

public class SinglyList<R> {
	private SinglyNode<R> head = null;

	public SinglyList(R data){ 
		
		this.head = new SinglyNode<R>(data);
	}
	
	public void addToList(R val) {
		if(head == null) {
			this.head = new SinglyNode<R>(val);
		}else {
			SinglyNode<R> currNode = head;
			 
			while(currNode.getNext() != null) {
				currNode = currNode.getNext();
			}
			currNode.setNext(new SinglyNode<R>(val));
		}
	}
	
	
	public void display() {
		Stream.of(head).forEach(x-> System.out.println(x + " "));
	} 
	
	
}
