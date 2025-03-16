package com.java_topics.collections.lists;

import java.util.Objects;

public class SinglyNode<T> {
	
	private T data;
	private SinglyNode next;
	
	public SinglyNode(T data) {
		this.data = data;
		this.next= null;
	}
	
	public SinglyNode(T data, SinglyNode next) {
		this.data = data;
		this.next = next;
	}

	public SinglyNode getNext() {
		return next;
	}

	public void setNext(SinglyNode next) {
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
		SinglyNode other = (SinglyNode) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "SinglyNode [data=" + data + ",next=" + next + "]";
	}
	
}
