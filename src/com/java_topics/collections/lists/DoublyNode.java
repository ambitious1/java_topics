package com.java_topics.collections.lists;

import java.util.Objects;

public class DoublyNode<T> {
	
	private T data;
	private DoublyNode next;
	private DoublyNode prev;
	
	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}

	public DoublyNode(T data) {
		this.data = data;
		this.next= null;
		this.prev = null;
	}
	
	public DoublyNode(T data, DoublyNode prev, DoublyNode next) {
		this.data = data;
		this.next = next;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoublyNode other = (DoublyNode) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "SinglyNode [data=" + data + ",next=" + next + "]";
	}
	
	
}
