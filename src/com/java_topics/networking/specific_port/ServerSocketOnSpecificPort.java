package com.java_topics.networking.specific_port;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketOnSpecificPort {
	public static void main(String[] args) throws Exception
    {
 
        // Try block to check for exceptions
        try {
 
            // Creating an object of ServerSocket class
            // with the custom port number - 80
            ServerSocket mySsocket = new ServerSocket(80);
 
            // Display commands for better readability
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");
 
            // Here it will wait for any client which wants
            // to get connected to this server
 
            // Establishing a connection
            // using accept() method()
            Socket socket = mySsocket.accept();
 
            // Display message
            System.out.println(
                "Client accepted through the port number: "
                + mySsocket.getLocalPort());
 
            // getLocalPort() function returning the port
            // number which is being used
        }
 
        // Catch block to handle for exceptions
        catch (Exception e) {
 
            // Simply return/exit
            return;
        }
    }
}
