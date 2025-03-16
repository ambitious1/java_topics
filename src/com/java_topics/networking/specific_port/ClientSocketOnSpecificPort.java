package com.java_topics.networking.specific_port;

import java.net.Socket;

public class ClientSocketOnSpecificPort {
	public static void main(String[] args) throws Exception
    {
 
        // Try block to check for exceptions
        try {
 
            // Creating an object of Socket class where
            // port number same as server side program
            Socket myCsocket = new Socket("localhost", 80);
 
            // creating client with local ip address
            // port number as '80'
 
            // Display message for better readability
            System.out.println("Connected to Server");
        }
 
        // Catch block to handle exceptions
        catch (Exception e) {
 
            // Simply return and exit the program
            return;
        }
    }
}
