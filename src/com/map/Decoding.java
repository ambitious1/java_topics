package com.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Decoding {
    public static String run() {
        String res = "";
        // Create a map to store the decoded message
        Map<Integer, String> decodedMessage = new HashMap<>();

        // File file = new File("C:\\Users\\travi\\OneDrive\\Desktop\\test.txt");
        File file = new File("C:\\Users\\travi\\OneDrive\\Documents\\coding_qual_input.txt");
        try (
                Scanner scanner = new Scanner(file)) {
            // Iterate over the lines in the file
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");

                decodedMessage.put(Integer.parseInt(line[0]), line[1]);
            }
            // Close the scanner
            scanner.close();
        } catch (NumberFormatException | FileNotFoundException e) {
            e.printStackTrace();
        }

        int height = 1;
        int nextLastTriangularIndexInCurrRow = 1;
        for (int i = 1; i <= decodedMessage.size(); i++) {

            // if it executes this block, it signifies that it has reached the end of this
            // row in the sequence
            if (nextLastTriangularIndexInCurrRow == i) {
                res += decodedMessage.get(i) + " ";
                System.out.print(decodedMessage.get(i) + " ");
                height++; // increase the height of the sequence

                // Find the last index of the upcoming row
                nextLastTriangularIndexInCurrRow = height + i;
            }
        }

        return res;
    }
}
