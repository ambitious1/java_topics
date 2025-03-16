package com.java_topics.collections.stacks;

public class Demo {
	
	public static void main(String[] args) {
		StackList<Node> s = new StackList<Node>(null);
		s.addStack(new Node(3), true);
		s.addStack(new Node(55),true);
		s.addStack(new Node(785), true);
		s.addStack(new Node(4), true);
		s.addStack(new Node(5), true);
		s.popStack();
		System.out.println(s);
	}
}
