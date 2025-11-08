package com.java_topics.strings;

import java.util.Scanner;

public class StringDemo {
	 public static void main(String[] args) {
		 	Scanner input = new Scanner(System.in);
		 	
		 	System.out.println("Enter a word, sentence, or phrase: ");
	        String s = input.nextLine();
	        
	        
	        System.out.println("Original string: [" + s + "]");

	        // length()
	        System.out.println("s.length() = " + s.length());

	        // isEmpty()
	        System.out.println("s.isEmpty() = " + s.isEmpty());

	        // trim()
	        String trimmed = s.trim();
	        System.out.println("s.trim() = [" + trimmed + "]");

	        // toLowerCase() / toUpperCase()
	        System.out.println("s.toLowerCase() = " + trimmed.toLowerCase());
	        System.out.println("s.toUpperCase() = " + trimmed.toUpperCase());

	        // charAt()
	        System.out.println("trimmed.charAt(0) = " + trimmed.charAt(0));

	        // indexOf() / lastIndexOf()
	        System.out.println("trimmed.indexOf(\"Java\") = " + trimmed.indexOf("Java"));
	        System.out.println("trimmed.lastIndexOf('o') = " + trimmed.lastIndexOf('o'));

	        // substring()
	        System.out.println("trimmed.substring(0,5) = " + trimmed.substring(0,5));

	        // contains()
	        System.out.println("trimmed.contains(\"World\") = " + trimmed.contains("World"));

	        // startsWith() / endsWith()
	        System.out.println("trimmed.startsWith(\"Hello\") = " + trimmed.startsWith("Hello"));
	        System.out.println("trimmed.endsWith(\"World!\") = " + trimmed.endsWith("World!"));

	        // replace(), replaceAll(), replaceFirst()
	        System.out.println("trimmed.replace(\"Java\", \"Awesome\") = " + trimmed.replace("Java", "Awesome"));
	        System.out.println("trimmed.replaceAll(\"[aeiou]\", \"*\") = " + trimmed.replaceAll("[aeiou]", "*"));
	        System.out.println("trimmed.replaceFirst(\"[aeiou]\", \"*\") = " + trimmed.replaceFirst("[aeiou]", "*"));

	        // split()
	        String[] parts = trimmed.split(" ");
	        System.out.print("trimmed.split(\" \") = ");
	        for (String part : parts) {
	            System.out.print("[" + part + "] ");
	        }
	        System.out.println();

	        // toCharArray()
	        char[] chars = trimmed.toCharArray();
	        System.out.print("trimmed.toCharArray() = ");
	        for (char c : chars) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        // valueOf()
	        int num = 123;
	        String numStr = String.valueOf(num);
	        System.out.println("String.valueOf(123) = " + numStr);

	        // equals(), equalsIgnoreCase()
	        String another = "hello, java world!";
	        System.out.println("trimmed.equals(another) = " + trimmed.equals(another));
	        System.out.println("trimmed.equalsIgnoreCase(another) = " + trimmed.equalsIgnoreCase(another));

	        // compareTo(), compareToIgnoreCase()
	        System.out.println("trimmed.compareTo(another) = " + trimmed.compareTo(another));
	        System.out.println("trimmed.compareToIgnoreCase(another) = " + trimmed.compareToIgnoreCase(another));

	        // intern()
	        String literal = "Hello, Java World!";
	        String interned = literal.intern();
	        System.out.println("literal == interned? " + (literal == interned));

	        // format()
	        String formatted = String.format("Formatted number: %.2f", 45.6789);
	        System.out.println(formatted);

	        // matches()
	        System.out.println("trimmed.matches(\"Hello,.*World!\" ) = " + trimmed.matches("Hello,.*World!"));

	        // join()
	        String joined = String.join(" | ", "Apple", "Banana", "Cherry");
	        System.out.println("String.join(\" | \", ...) = " + joined);

	        // hashCode()
	        System.out.println("s.hashCode() = " + s.hashCode());

	        System.out.println("----- End of demo -----");
	    }
}
