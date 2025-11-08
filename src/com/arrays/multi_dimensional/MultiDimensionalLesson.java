package com.arrays.multi_dimensional;

import java.util.Scanner;

public class MultiDimensionalLesson {
    static int[][] arr = {
            { 6, 2, 7 }, { 0, -3, 1 }, { 7, 2 }, { 0, 5, 3, 2 } // elements do not have to be the same length
    };

    static Scanner sc = new Scanner(System.in);

    public static int[][] createInputArr() {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[][] createInputArr(int row, int col) {
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter a Value for row (" + i + ", " + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void showArr(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void print(int[][] m_arr) {
        for (int i = 0; i < m_arr.length; i++) {
            System.out.print("row " + i + ":  ");
            showArr(m_arr[i]);
            System.out.println();
        }
    }

    public static void print() {
        for (int i = 0; i < arr.length; i++) {
            showArr(arr[i]);
            System.out.println();
        }
    }

    public static int[][] sumOf2Matrices(int row, int col) {
        int[][] f_mArr = createInputArr(row, col);

        int[][] s_mArr = createInputArr(row, col);

        int[][] ans = new int[row][col];
        // sum of 2 matrices
        System.out.println("Sum Of 2 Matrices");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[i][j] = f_mArr[i][j] + s_mArr[i][j];
            }
        }
        return ans;
    }

    public static int[][] colPrint(int[][] arr) {
        int rows = arr[0].length;
        int cols = arr.length;
        System.out.println("Column Print");
        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

}