package com.java_topics.java8tonow.v8;

import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		String[] arr = {"foo", "bar", "lah"};
		
		Stream<String> strm1 = Stream.of(arr);
		strm1.forEach(System.out::println);
		
	}
}
