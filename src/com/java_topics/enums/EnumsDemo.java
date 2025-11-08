package com.java_topics.enums;

import java.util.Scanner;

public class EnumsDemo {
	public static void main(String[] args) {
		System.out.print("Choose the style of the pizza : ");
		try (Scanner input = new Scanner(System.in)) {
			String style= input.nextLine().trim().toUpperCase();
			System.out.print("And now choose the size of the pizza : ");
			String size= input.nextLine().trim().toUpperCase();
			EnumChoice t1 = new EnumChoice(Size.valueOf(size), PizzaStyle.valueOf(style) );
			t1.orderPizza();
		}
	}
}
