package com.java_topics.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	 // establish a connection by providing host and port 
    // number 
	public static void main(String[] args) {
	try (Socket socket = new Socket("localhost", 1234)) { 
        
        // writing to server 
        PrintWriter out = new PrintWriter( 
            socket.getOutputStream(), true); 

        // reading from server 
        BufferedReader in 
            = new BufferedReader(new InputStreamReader( 
                socket.getInputStream())); 

        // object of scanner class 
        Scanner sc = new Scanner(System.in); 
        String line = null; 

        while (!"exit".equalsIgnoreCase(line)) { 
            
            // reading from user 
            line = sc.nextLine(); 

            // sending the user input to server 
            out.println(line); 
            out.flush(); 

            // displaying server reply 
            System.out.println("Server replied "
                               + in.readLine()); 
        } 
        
        // closing the scanner object 
        sc.close(); 
    } 
    catch (IOException e) { 
        e.printStackTrace(); 
    }
}
	
}
