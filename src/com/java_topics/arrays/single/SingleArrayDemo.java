package com.java_topics.arrays.single;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleArrayDemo {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the desired data type for the array (Integer, Double, Character, or String):");
        String dataTypeInput = scanner.nextLine().trim();

        System.out.println("Enter the number of elements for the array:");
        int size = 0;
        try {
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Array size must be a positive integer.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for array size. Please enter an integer.");
            return;
        }
        scanner.nextLine(); // Consume the newline character

        Object[] dynamicArray = ArrayMaker.createAndPopulateArray(dataTypeInput, size, scanner);

        if (dynamicArray != null) {
            System.out.println("\nCreated Array:");
            for (Object element : dynamicArray) {
                System.out.println(element);
            }
        } else {
            System.out.println("Failed to create array due to invalid data type or input errors.");
        }

        scanner.close();
    }
}
