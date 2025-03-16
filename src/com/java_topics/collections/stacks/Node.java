package com.java_topics.collections.stacks;

import java.util.Objects;


public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next= null;
	}
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
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
		Node<T> other = (Node) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ",next=" + next + "]";
	}
	
}
