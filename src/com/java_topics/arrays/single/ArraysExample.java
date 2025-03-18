package com.java_topics.arrays.single;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the length of the array: ");
		int length = input.nextInt();		
		
		int[] arr = new int[length];
		
		Random random = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = random.nextInt();
		}
		
		System.out.print(Arrays.toString(arr));
		
		boolean[] charIsPresent = {false, true,false};
		
		System.out.println(Arrays.toString(charIsPresent));		

	}

}
