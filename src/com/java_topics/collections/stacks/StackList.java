package com.java_topics.collections.stacks;


public class StackList<R> {

	private Node<R> head;
	
	public StackList(Node<R> n) {
		this.head = n;
	}
	
	public void addStack(R val, boolean addToHead) {
		if(head == null) {  
			head = new Node<R>(val);
		}else {
			if(addToHead) {
				Node<R> temp = new Node<R>(val);
				temp.setNext(head);
				head = temp;
			}else {
				Node<R> hd = head;
				Node<R> temp = new Node<R>(val);
				while(hd.getNext() != null) {
					hd = hd.getNext();
				}
				
				hd.setNext(temp);
			}
						
		}
	}
	
	
	public Node<R> popStack() {
		Node<R> k = head;
		if(k.getNext() == null) {
			head = null;
		}else {			
			 head = k.getNext();			
		}	
		
		return k;
	}

	@Override
	public String toString() {
		return "StackList [head=" + head + "]";
	}
	
}
