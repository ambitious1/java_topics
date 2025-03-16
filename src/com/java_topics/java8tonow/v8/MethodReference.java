package com.java_topics.java8tonow.v8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference {
	
	private int val;
	
	
	public MethodReference(int aaa) {
		this.val = aaa;
	}
	
	public void setVal(int a) {
		this.val = a;
	}
	
	public int getVal() {
		return val;
	}
	
	public void run() {
		setVal(44);
	}
	
	public static void main(String[] args) {
		Stream<String> onceModif = Stream.of("a", "b", "c").skip(1);
		
		Stream<String> stream = 
				  Stream.of("adba", "bbbb", "bbccaac").filter(element -> element.contains("b"));
		Optional<String> firstElement = stream.findFirst();
		
		System.out.println(firstElement);

		List<String> elements =
				  Stream.of("a", "b", "c")
				    .collect(Collectors.toList());
		
		
		
		
		System.out.println(elements.toString());
		
		
		
	}		
}
