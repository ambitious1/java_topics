package com.java_topics.arrays.single;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayMaker {
	public static Object[] createAndPopulateArray(String dataType, int size, Scanner scanner) {
        List<Object> tempArray = new ArrayList<>();

        switch (dataType.toLowerCase()) {
            case "integer":
                System.out.println("Enter " + size + " integer elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    try {
                        tempArray.add(scanner.nextInt());
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer.");
                        return null;
                    } finally {
                        scanner.nextLine(); // Consume the newline
                    }
                }
                return tempArray.toArray(new Integer[0]);
            case "double":
                System.out.println("Enter " + size + " double elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    try {
                        tempArray.add(scanner.nextDouble());
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a double.");
                        return null;
                    } finally {
                        scanner.nextLine(); // Consume the newline
                    }
                }
                return tempArray.toArray(new Double[0]);
            case "string":
                System.out.println("Enter " + size + " string elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    tempArray.add(scanner.nextLine());
                }
                return tempArray.toArray(new String[0]);
            case "char":
                System.out.println("Enter " + size + " char elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    tempArray.add(scanner.next().charAt(0));
                }
                return tempArray.toArray(new Character[0]);
            default:
                System.out.println("Unsupported data type: " + dataType);
                return null;
                
           
        }
    }
}
