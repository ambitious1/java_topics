package com.java_topics.networking.socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/*
 * 
 * Socket Programming
Java Socket programming is practiced for communication between the applications working on different JRE. Sockets implement the communication tool between two computers using TCP. Java Socket programming can either be connection-oriented or connection-less. In Socket Programming, Socket and ServerSocket classes are managed for connection-oriented socket programming. However, DatagramSocket and DatagramPacket classes are utilized for connection-less socket programming.

A client application generates a socket on its end of the communication and strives to combine that socket with a server. When the connection is established, the server generates an object of socket class on its communication end. The client and the server can now communicate by writing to and reading from the socket.

The java.net.Socket class describes a socket, and the java.net.ServerSocket class implements a tool for the server program to host clients and build connections with them.
 
Steps to establishing a TCP connection between two computing devices using Socket Programming

The following are the steps that occur on establishing a TCP connection between two computers using socket programming are given as follows:
 

Step 1 – The server instantiates a ServerSocket object, indicating at which port number communication will occur.

Step 2 – After instantiating the ServerSocket object, the server requests the accept() method of the ServerSocket class. This program pauses until a client connects to the server on the given port.

Step 3 – After the server is idling, a client instantiates an object of Socket class, defining the server name and the port number to connect to.

Step 4 – After the above step, the constructor of the Socket class strives to connect the client to the designated server and the port number. If communication is authenticated, the client forthwith has a Socket object proficient in interacting with the server.

Step 5 – On the server-side, the accept() method returns a reference to a new socket on the server connected to the client’s socket.

After the connections are stabilized, communication can happen using I/O streams. Each object of a socket class has both an OutputStream and an InputStream. The client’s OutputStream is correlated to the server’s InputStream, and the client’s InputStream is combined with the server’s OutputStream. Transmission Control Protocol (TCP) is a two-way communication protocol. Hence information can be transmitted over both streams at the corresponding time. 

Socket Class 
The Socket class is used to create socket objects that help the users in implementing all fundamental socket operations. The users can implement various networking actions such as sending, reading data, and closing connections. Each Socket object created using java.net.Socket class has been correlated specifically with 1 remote host. If a user wants to connect to another host, then he must build a new socket object.

Methods of Socket Class

In Socket programming, both the client and the server have a Socket object, so all the methods under the Socket class can be invoked by both the client and the server. There are many methods in the Socket class.  

#  |       					Method 					 	  |					Description
=====================================================================================================================================================================================================================================================================
1	public void connect(SocketAddress host, int timeout)  |	This method is used to connect the socket to the particularized host. This method is required only when the user instantiates the Socket applying the no-argument constructor.
2	public int getPort()								  |	This method is used to return the port to which the socket is pinned on the remote machine.
3	public InetAddress getInetAddress()					  | This method is used to return the location of the other computer to which the socket is connected.
4	public int getLocalPort()							  | This method is used to return the port to which the socket is joined on the local machine.
5	public SocketAddress getRemoteSocketAddress() 	 	  | This method returns the location of the remote socket.
6	public InputStream getInputStream() 	 			  | This method is used to return the input stream of the socket. This input stream is combined with the output stream of the remote socket.
7	public OutputStream getOutputStream()				  | This method is used to return the output stream of the socket. The output stream is combined with the input stream of the remote socket.
8	public void close() 								  | This method is used to close the socket, which causes the object of the Socket class to no longer be able to connect again to any server.


ServerSocket Class
The ServerSocket class is used for providing system-independent implementation of the server-side of a client/server Socket Connection. The constructor for ServerSocket class throws an exception if it can’t listen on the specified port. For example – it will throw an exception if the port is already being used.

Methods of ServerSocket Class:

There are many methods in the ServerSocket class which are very useful for the users. These methods are:
 

#  |       					Method 					   |					Description
=====================================================================================================================================================================================================================================================================
1  | public int getLocalPort()						   |	This method is used to return the port that the server socket is monitoring on. This method is beneficial if a user passed 0 as the port number in a constructor and lets the server find a port for him.
2  | public void setSoTimeout(int timeout)			   |	This method is used to set the time-out value for the time in which the server socket pauses for a client during the accept() method.
3  | public Socket accept()							   |	This method waits for an incoming client. This method is blocked till either a client combines to the server on the specified port or the socket times out, considering that the time-out value has been set using the setSoTimeout() method. Otherwise, this method will be blocked indefinitely.
4  | public void bind(SocketAddress host, int backlog) | 	This method is used to bind the socket to the particularized server and port in the object of SocketAddress. The user should use this method if he has instantiated the ServerSocket using the no-argument constructor.
Example of Socket Programming in Java:
The below example illustrates a pretty basic one-way Client and Server setup where a Client connects, sends messages to the server and the server shows them using a socket connection.
 * 
 * */


public class ServerSide {
	// initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
 
    // constructor with port
    public ServerSide(int port)
    {
 
        // starts server and waits for a connection
        try {
            server = new ServerSocket(port);
 
            System.out.println("Server started");
 
            System.out.println("Waiting for a client ...");
 
            socket = server.accept();
 
            System.out.println("Client accepted");
 
            // takes input from the client socket
            in = new DataInputStream(
                new BufferedInputStream(
                    socket.getInputStream()));
 
            String line = "";
 
            // reads message from client until "End" is sent
            while (!line.equals("End")) {
 
                try {
 
                    line = in.readUTF();
 
                    System.out.println("From Client: " + line);
                }
 
                catch (IOException i) {
 
                    System.out.println(i);
                }
            }
 
            System.out.println("Closing connection");
 
            // close connection
            socket.close();
 
            in.close();
        }
 
        catch (IOException i) {
 
            System.out.println(i);
        }
    }
 
    public static void main(String[] args)
    {
 
        ServerSide server = new ServerSide(5000);
    }
}
